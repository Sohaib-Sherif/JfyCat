package ly.sohaib.jfycat;

import com.squareup.moshi.Json;

public class Credentials {

	@Json(name = "grant_type")
	private String grantType;
	@Json(name = "client_id")
	private String clientID;
	@Json(name = "client_secret")
	private String clientSecret;

	
	public Credentials(String clientID , String clientSecret, GrantType grantType) {
		this.clientID = clientID;
		this.clientSecret = clientSecret;
		this.grantType = grantType.toString();
	}
	public String getGrantType() {
		return grantType;
	}

	public void setGrantType(String grantType) {
		this.grantType = grantType;
	}

	public String getClientId() {
		return clientID;
	}

	public void setClientId(String clientId) {
		this.clientID = clientId;
	}

	public String getClientSecret() {
		return clientSecret;
	}

	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}

}