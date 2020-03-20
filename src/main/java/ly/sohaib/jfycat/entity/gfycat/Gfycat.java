package ly.sohaib.jfycat.entity.gfycat;

import java.util.List;
import com.squareup.moshi.Json;

public class Gfycat {

	@Json(name = "gfyId")
	private String gfyId;
	@Json(name = "gfyName")
	private String gfyName;
	@Json(name = "gfyNumber")
	private Integer gfyNumber;
	@Json(name = "webmUrl")
	private String webmUrl;
	@Json(name = "gifUrl")
	private String gifUrl;
	@Json(name = "mobileUrl")
	private String mobileUrl;
	@Json(name = "mobilePosterUrl")
	private String mobilePosterUrl;
	@Json(name = "posterUrl")
	private String posterUrl;
	@Json(name = "thumb100PosterUrl")
	private String thumb100PosterUrl;
	@Json(name = "max5mbGif")
	private String max5mbGif;
	@Json(name = "max2mbGif")
	private String max2mbGif;
	@Json(name = "max1mbGif")
	private String max1mbGif;
	@Json(name = "gif100px")
	private String gif100px;
	@Json(name = "webpUrl")
	private String webpUrl;
	@Json(name = "width")
	private Integer width;
	@Json(name = "height")
	private Integer height;
	@Json(name = "avgColor")
	private String avgColor;
	@Json(name = "frameRate")
	private Double frameRate;
	@Json(name = "numFrames")
	private Double numFrames;
	@Json(name = "mp4Size")
	private Double mp4Size;
	@Json(name = "webmSize")
	private Double webmSize;
	@Json(name = "gifSize")
	private Double gifSize;
	@Json(name = "source")
	private Integer source;
	@Json(name = "createDate")
	private Integer createDate;
	@Json(name = "nsfw")
	private String nsfw;
	@Json(name = "mp4Url")
	private String mp4Url;
	@Json(name = "likes")
	private Integer likes;
	@Json(name = "published")
	private Integer published;
	@Json(name = "dislikes")
	private Integer dislikes;
	@Json(name = "extraLemmas")
	private String extraLemmas;
	@Json(name = "md5")
	private String md5;
	@Json(name = "views")
	private Integer views;
	@Json(name = "tags")
	private List<String> tags = null;
	@Json(name = "userName")
	private String userName;
	@Json(name = "title")
	private String title;
	@Json(name = "description")
	private String description;
	@Json(name = "languageText")
	private String languageText;
	@Json(name = "languageCategories")
	private Object languageCategories;
	@Json(name = "subreddit")
	private String subreddit;
	@Json(name = "redditId")
	private String redditId;
	@Json(name = "redditIdText")
	private String redditIdText;
	@Json(name = "domainWhitelist")
	private List<Object> domainWhitelist = null;

	public String getGfyId() {
		return gfyId;
	}

	public void setGfyId(String gfyId) {
		this.gfyId = gfyId;
	}

	public String getGfyName() {
		return gfyName;
	}

	public void setGfyName(String gfyName) {
		this.gfyName = gfyName;
	}

	public Integer getGfyNumber() {
		return gfyNumber;
	}

	public void setGfyNumber(Integer gfyNumber) {
		this.gfyNumber = gfyNumber;
	}

	public String getWebmUrl() {
		return webmUrl;
	}

	public void setWebmUrl(String webmUrl) {
		this.webmUrl = webmUrl;
	}

	public String getGifUrl() {
		return gifUrl;
	}

	public void setGifUrl(String gifUrl) {
		this.gifUrl = gifUrl;
	}

	public String getMobileUrl() {
		return mobileUrl;
	}

	public void setMobileUrl(String mobileUrl) {
		this.mobileUrl = mobileUrl;
	}

	public String getMobilePosterUrl() {
		return mobilePosterUrl;
	}

	public void setMobilePosterUrl(String mobilePosterUrl) {
		this.mobilePosterUrl = mobilePosterUrl;
	}

	public String getPosterUrl() {
		return posterUrl;
	}

	public void setPosterUrl(String posterUrl) {
		this.posterUrl = posterUrl;
	}

	public String getThumb100PosterUrl() {
		return thumb100PosterUrl;
	}

	public void setThumb100PosterUrl(String thumb100PosterUrl) {
		this.thumb100PosterUrl = thumb100PosterUrl;
	}

	public String getMax5mbGif() {
		return max5mbGif;
	}

	public void setMax5mbGif(String max5mbGif) {
		this.max5mbGif = max5mbGif;
	}

	public String getMax2mbGif() {
		return max2mbGif;
	}

	public void setMax2mbGif(String max2mbGif) {
		this.max2mbGif = max2mbGif;
	}

	public String getMax1mbGif() {
		return max1mbGif;
	}

	public void setMax1mbGif(String max1mbGif) {
		this.max1mbGif = max1mbGif;
	}

	public String getGif100px() {
		return gif100px;
	}

	public void setGif100px(String gif100px) {
		this.gif100px = gif100px;
	}

	public String getWebpUrl() {
		return webpUrl;
	}

	public void setWebpUrl(String webpUrl) {
		this.webpUrl = webpUrl;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public String getAvgColor() {
		return avgColor;
	}

	public void setAvgColor(String avgColor) {
		this.avgColor = avgColor;
	}

	public Double getFrameRate() {
		return frameRate;
	}

	public void setFrameRate(Double frameRate) {
		this.frameRate = frameRate;
	}

	public Double getNumFrames() {
		return numFrames;
	}

	public void setNumFrames(Double numFrames) {
		this.numFrames = numFrames;
	}

	public Double getMp4Size() {
		return mp4Size;
	}

	public void setMp4Size(Double mp4Size) {
		this.mp4Size = mp4Size;
	}

	public Double getWebmSize() {
		return webmSize;
	}

	public void setWebmSize(Double webmSize) {
		this.webmSize = webmSize;
	}

	public Double getGifSize() {
		return gifSize;
	}

	public void setGifSize(Double gifSize) {
		this.gifSize = gifSize;
	}

	public Integer getSource() {
		return source;
	}

	public void setSource(Integer source) {
		this.source = source;
	}

	public Integer getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Integer createDate) {
		this.createDate = createDate;
	}

	public String getNsfw() {
		return nsfw;
	}

	public void setNsfw(String nsfw) {
		this.nsfw = nsfw;
	}

	public String getMp4Url() {
		return mp4Url;
	}

	public void setMp4Url(String mp4Url) {
		this.mp4Url = mp4Url;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public Integer getPublished() {
		return published;
	}

	public void setPublished(Integer published) {
		this.published = published;
	}

	public Integer getDislikes() {
		return dislikes;
	}

	public void setDislikes(Integer dislikes) {
		this.dislikes = dislikes;
	}

	public String getExtraLemmas() {
		return extraLemmas;
	}

	public void setExtraLemmas(String extraLemmas) {
		this.extraLemmas = extraLemmas;
	}

	public String getMd5() {
		return md5;
	}

	public void setMd5(String md5) {
		this.md5 = md5;
	}

	public Integer getViews() {
		return views;
	}

	public void setViews(Integer views) {
		this.views = views;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLanguageText() {
		return languageText;
	}

	public void setLanguageText(String languageText) {
		this.languageText = languageText;
	}

	public Object getLanguageCategories() {
		return languageCategories;
	}

	public void setLanguageCategories(Object languageCategories) {
		this.languageCategories = languageCategories;
	}

	public String getSubreddit() {
		return subreddit;
	}

	public void setSubreddit(String subreddit) {
		this.subreddit = subreddit;
	}

	public String getRedditId() {
		return redditId;
	}

	public void setRedditId(String redditId) {
		this.redditId = redditId;
	}

	public String getRedditIdText() {
		return redditIdText;
	}

	public void setRedditIdText(String redditIdText) {
		this.redditIdText = redditIdText;
	}

	public List<Object> getDomainWhitelist() {
		return domainWhitelist;
	}

	public void setDomainWhitelist(List<Object> domainWhitelist) {
		this.domainWhitelist = domainWhitelist;
	}

}
