package ly.sohaib.jfycat.entity.gfycat;

import java.util.List;
import com.squareup.moshi.Json;

public class Tag {

	@Json(name = "tag")
	private String tag;
	@Json(name = "gfycats")
	private List<Gfycat> gfycats = null;
	@Json(name = "cursor")
	private String cursor;
	@Json(name = "digest")
	private String digest;
	@Json(name = "tagText")
	private String tagText;

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public List<Gfycat> getGfycats() {
		return gfycats;
	}

	public void setGfycats(List<Gfycat> gfycats) {
		this.gfycats = gfycats;
	}

	public String getCursor() {
		return cursor;
	}

	public void setCursor(String cursor) {
		this.cursor = cursor;
	}

	public String getDigest() {
		return digest;
	}

	public void setDigest(String digest) {
		this.digest = digest;
	}

	public String getTagText() {
		return tagText;
	}

	public void setTagText(String tagText) {
		this.tagText = tagText;
	}

}