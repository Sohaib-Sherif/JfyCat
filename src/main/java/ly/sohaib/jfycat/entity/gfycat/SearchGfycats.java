package ly.sohaib.jfycat.entity.gfycat;

import java.util.List;
import com.squareup.moshi.Json;

public class SearchGfycats {

	@Json(name = "gfycats")
	private List<Gfycat> gfycats = null;
	@Json(name = "cursor")
	private String cursor;

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

}