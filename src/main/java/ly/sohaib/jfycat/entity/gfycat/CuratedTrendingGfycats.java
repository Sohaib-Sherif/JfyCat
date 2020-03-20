package ly.sohaib.jfycat.entity.gfycat;

import java.util.List;
import com.squareup.moshi.Json;

public class CuratedTrendingGfycats {

	@Json(name = "tag")
	private String tag;
	@Json(name = "cursor")
	private String cursor;
	@Json(name = "gfycats")
	private List<Gfycat> gfycats = null;
	@Json(name = "digest")
	private String digest;
	@Json(name = "newGfycats")
	private List<Object> newGfycats = null;

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getCursor() {
		return cursor;
	}

	public void setCursor(String cursor) {
		this.cursor = cursor;
	}

	public List<Gfycat> getGfycats() {
		return gfycats;
	}

	public void setGfycats(List<Gfycat> gfycats) {
		this.gfycats = gfycats;
	}

	public String getDigest() {
		return digest;
	}

	public void setDigest(String digest) {
		this.digest = digest;
	}

	public List<Object> getNewGfycats() {
		return newGfycats;
	}

	public void setNewGfycats(List<Object> newGfycats) {
		this.newGfycats = newGfycats;
	}
}