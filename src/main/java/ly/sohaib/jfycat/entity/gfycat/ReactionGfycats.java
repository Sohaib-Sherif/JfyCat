package ly.sohaib.jfycat.entity.gfycat;

import java.util.List;
import com.squareup.moshi.Json;

public class ReactionGfycats {

	@Json(name = "cursor")
	private String cursor;
	@Json(name = "tags")
	private List<Tag> tags = null;

	public String getCursor() {
		return cursor;
	}

	public void setCursor(String cursor) {
		this.cursor = cursor;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
}