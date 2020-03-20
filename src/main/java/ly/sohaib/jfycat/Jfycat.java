package ly.sohaib.jfycat;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.json.JSONObject;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import ly.sohaib.jfycat.entity.gfycat.Gfycat;
import ly.sohaib.jfycat.entity.gfycat.ReactionGfycats;
import ly.sohaib.jfycat.entity.gfycat.SearchGfycats;
import ly.sohaib.jfycat.entity.gfycat.TrendingGfycats;
import ly.sohaib.jfycat.http.EndPoints;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.MediaType;

/**
 * 
 *
 */

public final class Jfycat {
	
	
	private static OkHttpClient client = null;
	private static Credentials credentials;

	private final Moshi moshi = new Moshi.Builder().build();
	
	private final JsonAdapter<Credentials> credentialsAdapter = moshi.adapter(Credentials.class);
	private final JsonAdapter<SearchGfycats> searchGfycatsAdapter = moshi.adapter(SearchGfycats.class);
	private final JsonAdapter<ReactionGfycats> reactionGfycatsAdapter = moshi.adapter(ReactionGfycats.class);
	private final JsonAdapter<TrendingGfycats> trendingGfycatsAdapter = moshi.adapter(TrendingGfycats.class);
	
	private final static MediaType json = MediaType.parse("application/json; charset=utf-8");
	//The Credentials represented as json.
	private static String credentialsPayload;
	//The Access token which we will get.
	private static String accessToken;
	
	//private constructor to prevent instantiating this class
	private Jfycat() {}
	
	/**
	 * Gets the Access token and prepare our general-use okhttp client
	 * @param credentials The credentials object.
	 */
	public static void init(Credentials credentials) {
		Jfycat.credentials = credentials;
		credentialsPayload = new Jfycat().credentialsAdapter.toJson(credentials);
		try {
			getAccessToken();
		} catch (IOException e) {
			e.printStackTrace();
		}
		client = getClient();
	}
	
	/**
	 * 
	 * @param clientID
	 * @param clientSecret
	 * @param grantType
	 */
	public static void init(String clientID, String clientSecret, GrantType grantType) {
		Credentials cred = new Credentials(clientID, clientSecret, grantType);
		init(cred);	
	}
	
	/**
	 * gets the Access token
	 * @throws IOException
	 */
	private static void getAccessToken() throws IOException {
		OkHttpClient client = new OkHttpClient().newBuilder().build();
		Request request = prepareAuthRequest();
		try (Response response = client.newCall(request).execute()) {
		      if (!response.isSuccessful()) 
		    	  throw new IOException("Unexpected code " + response);

		      JSONObject o = new JSONObject(response.body().string());
		      accessToken = o.getString("access_token");
		    }
	}
	
	/**
	 * 
	 * @return
	 */
	private static Request prepareAuthRequest() {
		return new Request.Builder()
						  .url(EndPoints.AUTHORIZATION_ENDPOINT)
						  .post(RequestBody.create(json, credentialsPayload))
						  .build();
	}
	
	/**
	 * 
	 * @return the general-use client
	 */
	private static OkHttpClient getClient() {
		if(client != null) 
			return client;
		client = new OkHttpClient().newBuilder()
				 .addInterceptor(new Interceptor() {
					public Response intercept(Chain chain) throws IOException {
						Request request = chain.request()
								   			   .newBuilder()
								   			   .addHeader("Authorization","Bearer "+accessToken)
								   			   .build();
						Response response = chain.proceed(request); 
						return response;
					}
				})
				 .build();
		return client;
	}
	
	
	/**
	 * 
	 * @param Keyword The word to search for in the Gfycat
	 * @return A list of all the gfycats that match the searched keyword.
	 * @throws IOException
	 */
	public static List<Gfycat> search(String Keyword) throws IOException {
		//List<Gfycat> GfycatQueryResult;
		SearchGfycats searchGfycats;
		Request request = new Request.Builder()
						.url(EndPoints.SEARCH_ENDPOINT+URLEncoder.encode(Keyword,StandardCharsets.UTF_8.name())
						+"&count=50")
						.build();
		try (Response response = client.newCall(request).execute()) {
		      if (!response.isSuccessful())
		    		  throw new IOException("Unexpected code " + response);
		      
		      searchGfycats = new Jfycat().searchGfycatsAdapter.fromJson(response.body().string());
		}
		return searchGfycats.getGfycats();
	}
	
	
	public static List<Gfycat> trendingList() throws IOException {
		TrendingGfycats trendingGfycats;
		Request request = new Request.Builder()
						.url(EndPoints.TRENDING_ENDPOINT+"count=50")
						.build();
		try (Response response = client.newCall(request).execute()) {
		      if (!response.isSuccessful())
		    		  throw new IOException("Unexpected code " + response);
		      
		      trendingGfycats = new Jfycat().trendingGfycatsAdapter.fromJson(response.body().string());
		}
		return trendingGfycats.getGfycats();
	}
	
	public static List<Gfycat> trending(String tagName) throws IOException {
		TrendingGfycats trendingGfycats;
		Request request = new Request.Builder()
						.url(EndPoints.TRENDING_ENDPOINT+"?tagName="+URLEncoder.encode(tagName,StandardCharsets.UTF_8.name())
						+"&count=50")
						.build();
		try (Response response = client.newCall(request).execute()) {
		      if (!response.isSuccessful())
		    		  throw new IOException("Unexpected code " + response);
		      
		      trendingGfycats = new Jfycat().trendingGfycatsAdapter.fromJson(response.body().string());
		}
		return trendingGfycats.getGfycats();
	}
}