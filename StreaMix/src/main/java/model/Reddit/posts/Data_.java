
package model.reddit.posts;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "approved_at_utc", "subreddit", "selftext", "author_fullname", "saved", "mod_reason_title",
		"gilded", "clicked", "title", "link_flair_richtext", "subreddit_name_prefixed", "hidden", "pwls",
		"link_flair_css_class", "downs", "hide_score", "name", "quarantine", "link_flair_text_color", "upvote_ratio",
		"author_flair_background_color", "subreddit_type", "ups", "total_awards_received", "media_embed",
		"author_flair_template_id", "is_original_content", "user_reports", "secure_media", "is_reddit_media_domain",
		"is_meta", "category", "secure_media_embed", "link_flair_text", "can_mod_post", "score", "approved_by",
		"author_premium", "thumbnail", "edited", "author_flair_css_class", "author_flair_richtext", "gildings",
		"content_categories", "is_self", "mod_note", "created", "link_flair_type", "wls", "removed_by_category",
		"banned_by", "author_flair_type", "domain", "allow_live_comments", "selftext_html", "likes", "suggested_sort",
		"banned_at_utc", "view_count", "archived", "no_follow", "is_crosspostable", "pinned", "over_18",
		"all_awardings", "awarders", "media_only", "link_flair_template_id", "can_gild", "spoiler", "locked",
		"author_flair_text", "treatment_tags", "visited", "removed_by", "num_reports", "distinguished", "subreddit_id",
		"mod_reason_by", "removal_reason", "link_flair_background_color", "id", "is_robot_indexable", "report_reasons",
		"author", "discussion_type", "num_comments", "send_replies", "whitelist_status", "contest_mode", "mod_reports",
		"author_patreon_flair", "author_flair_text_color", "permalink", "parent_whitelist_status", "stickied", "url",
		"subreddit_subscribers", "created_utc", "num_crossposts", "media", "is_video" })
public class Data_ {

	@JsonProperty("approved_at_utc")
	private Object approvedAtUtc;
	@JsonProperty("subreddit")
	private String subreddit;
	@JsonProperty("selftext")
	private String selftext;
	@JsonProperty("author_fullname")
	private String authorFullname;
	@JsonProperty("saved")
	private Boolean saved;
	@JsonProperty("mod_reason_title")
	private Object modReasonTitle;
	@JsonProperty("gilded")
	private Integer gilded;
	@JsonProperty("clicked")
	private Boolean clicked;
	@JsonProperty("title")
	private String title;
	@JsonProperty("link_flair_richtext")
	private List<Object> linkFlairRichtext = null;
	@JsonProperty("subreddit_name_prefixed")
	private String subredditNamePrefixed;
	@JsonProperty("hidden")
	private Boolean hidden;
	@JsonProperty("pwls")
	private Integer pwls;
	@JsonProperty("link_flair_css_class")
	private Object linkFlairCssClass;
	@JsonProperty("downs")
	private Integer downs;
	@JsonProperty("hide_score")
	private Boolean hideScore;
	@JsonProperty("name")
	private String name;
	@JsonProperty("quarantine")
	private Boolean quarantine;
	@JsonProperty("link_flair_text_color")
	private String linkFlairTextColor;
	@JsonProperty("upvote_ratio")
	private Double upvoteRatio;
	@JsonProperty("author_flair_background_color")
	private Object authorFlairBackgroundColor;
	@JsonProperty("subreddit_type")
	private String subredditType;
	@JsonProperty("ups")
	private Integer ups;
	@JsonProperty("total_awards_received")
	private Integer totalAwardsReceived;
	@JsonProperty("media_embed")
	private MediaEmbed mediaEmbed;
	@JsonProperty("author_flair_template_id")
	private Object authorFlairTemplateId;
	@JsonProperty("is_original_content")
	private Boolean isOriginalContent;
	@JsonProperty("user_reports")
	private List<Object> userReports = null;
	@JsonProperty("secure_media")
	private Object secureMedia;
	@JsonProperty("is_reddit_media_domain")
	private Boolean isRedditMediaDomain;
	@JsonProperty("is_meta")
	private Boolean isMeta;
	@JsonProperty("category")
	private Object category;
	@JsonProperty("secure_media_embed")
	private SecureMediaEmbed secureMediaEmbed;
	@JsonProperty("link_flair_text")
	private Object linkFlairText;
	@JsonProperty("can_mod_post")
	private Boolean canModPost;
	@JsonProperty("score")
	private Integer score;
	@JsonProperty("approved_by")
	private Object approvedBy;
	@JsonProperty("author_premium")
	private Boolean authorPremium;
	@JsonProperty("thumbnail")
	private String thumbnail;
	@JsonProperty("edited")
	private String edited;
	@JsonProperty("author_flair_css_class")
	private Object authorFlairCssClass;
	@JsonProperty("author_flair_richtext")
	private List<Object> authorFlairRichtext = null;
	@JsonProperty("gildings")
	private Gildings gildings;
	@JsonProperty("content_categories")
	private Object contentCategories;
	@JsonProperty("is_self")
	private Boolean isSelf;
	@JsonProperty("mod_note")
	private Object modNote;
	@JsonProperty("created")
	private Double created;
	@JsonProperty("link_flair_type")
	private String linkFlairType;
	@JsonProperty("wls")
	private Integer wls;
	@JsonProperty("removed_by_category")
	private Object removedByCategory;
	@JsonProperty("banned_by")
	private Object bannedBy;
	@JsonProperty("author_flair_type")
	private String authorFlairType;
	@JsonProperty("domain")
	private String domain;
	@JsonProperty("allow_live_comments")
	private Boolean allowLiveComments;
	@JsonProperty("selftext_html")
	private String selftextHtml;
	@JsonProperty("likes")
	private Object likes;
	@JsonProperty("suggested_sort")
	private Object suggestedSort;
	@JsonProperty("banned_at_utc")
	private Object bannedAtUtc;
	@JsonProperty("view_count")
	private Object viewCount;
	@JsonProperty("archived")
	private Boolean archived;
	@JsonProperty("no_follow")
	private Boolean noFollow;
	@JsonProperty("is_crosspostable")
	private Boolean isCrosspostable;
	@JsonProperty("pinned")
	private Boolean pinned;
	@JsonProperty("over_18")
	private Boolean over18;
	@JsonProperty("all_awardings")
	private List<Object> allAwardings = null;
	@JsonProperty("awarders")
	private List<Object> awarders = null;
	@JsonProperty("media_only")
	private Boolean mediaOnly;
	@JsonProperty("link_flair_template_id")
	private String linkFlairTemplateId;
	@JsonProperty("can_gild")
	private Boolean canGild;
	@JsonProperty("spoiler")
	private Boolean spoiler;
	@JsonProperty("locked")
	private Boolean locked;
	@JsonProperty("author_flair_text")
	private Object authorFlairText;
	@JsonProperty("treatment_tags")
	private List<Object> treatmentTags = null;
	@JsonProperty("visited")
	private Boolean visited;
	@JsonProperty("removed_by")
	private Object removedBy;
	@JsonProperty("num_reports")
	private Object numReports;
	@JsonProperty("distinguished")
	private Object distinguished;
	@JsonProperty("subreddit_id")
	private String subredditId;
	@JsonProperty("mod_reason_by")
	private Object modReasonBy;
	@JsonProperty("removal_reason")
	private Object removalReason;
	@JsonProperty("link_flair_background_color")
	private String linkFlairBackgroundColor;
	@JsonProperty("id")
	private String id;
	@JsonProperty("is_robot_indexable")
	private Boolean isRobotIndexable;
	@JsonProperty("report_reasons")
	private Object reportReasons;
	@JsonProperty("author")
	private String author;
	@JsonProperty("discussion_type")
	private Object discussionType;
	@JsonProperty("num_comments")
	private Integer numComments;
	@JsonProperty("send_replies")
	private Boolean sendReplies;
	@JsonProperty("whitelist_status")
	private String whitelistStatus;
	@JsonProperty("contest_mode")
	private Boolean contestMode;
	@JsonProperty("mod_reports")
	private List<Object> modReports = null;
	@JsonProperty("author_patreon_flair")
	private Boolean authorPatreonFlair;
	@JsonProperty("author_flair_text_color")
	private Object authorFlairTextColor;
	@JsonProperty("permalink")
	private String permalink;
	@JsonProperty("parent_whitelist_status")
	private String parentWhitelistStatus;
	@JsonProperty("stickied")
	private Boolean stickied;
	@JsonProperty("url")
	private String url;
	@JsonProperty("subreddit_subscribers")
	private Integer subredditSubscribers;
	@JsonProperty("created_utc")
	private Double createdUtc;
	@JsonProperty("num_crossposts")
	private Integer numCrossposts;
	@JsonProperty("media")
	private Object media;
	@JsonProperty("is_video")
	private Boolean isVideo;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("approved_at_utc")
	public Object getApprovedAtUtc() {
		return approvedAtUtc;
	}

	@JsonProperty("approved_at_utc")
	public void setApprovedAtUtc(Object approvedAtUtc) {
		this.approvedAtUtc = approvedAtUtc;
	}

	public Data_ withApprovedAtUtc(Object approvedAtUtc) {
		this.approvedAtUtc = approvedAtUtc;
		return this;
	}

	@JsonProperty("subreddit")
	public String getSubreddit() {
		return subreddit;
	}

	@JsonProperty("subreddit")
	public void setSubreddit(String subreddit) {
		this.subreddit = subreddit;
	}

	public Data_ withSubreddit(String subreddit) {
		this.subreddit = subreddit;
		return this;
	}

	@JsonProperty("selftext")
	public String getSelftext() {
		return selftext;
	}

	@JsonProperty("selftext")
	public void setSelftext(String selftext) {
		this.selftext = selftext;
	}

	public Data_ withSelftext(String selftext) {
		this.selftext = selftext;
		return this;
	}

	@JsonProperty("author_fullname")
	public String getAuthorFullname() {
		return authorFullname;
	}

	@JsonProperty("author_fullname")
	public void setAuthorFullname(String authorFullname) {
		this.authorFullname = authorFullname;
	}

	public Data_ withAuthorFullname(String authorFullname) {
		this.authorFullname = authorFullname;
		return this;
	}

	@JsonProperty("saved")
	public Boolean getSaved() {
		return saved;
	}

	@JsonProperty("saved")
	public void setSaved(Boolean saved) {
		this.saved = saved;
	}

	public Data_ withSaved(Boolean saved) {
		this.saved = saved;
		return this;
	}

	@JsonProperty("mod_reason_title")
	public Object getModReasonTitle() {
		return modReasonTitle;
	}

	@JsonProperty("mod_reason_title")
	public void setModReasonTitle(Object modReasonTitle) {
		this.modReasonTitle = modReasonTitle;
	}

	public Data_ withModReasonTitle(Object modReasonTitle) {
		this.modReasonTitle = modReasonTitle;
		return this;
	}

	@JsonProperty("gilded")
	public Integer getGilded() {
		return gilded;
	}

	@JsonProperty("gilded")
	public void setGilded(Integer gilded) {
		this.gilded = gilded;
	}

	public Data_ withGilded(Integer gilded) {
		this.gilded = gilded;
		return this;
	}

	@JsonProperty("clicked")
	public Boolean getClicked() {
		return clicked;
	}

	@JsonProperty("clicked")
	public void setClicked(Boolean clicked) {
		this.clicked = clicked;
	}

	public Data_ withClicked(Boolean clicked) {
		this.clicked = clicked;
		return this;
	}

	@JsonProperty("title")
	public String getTitle() {
		return title;
	}

	@JsonProperty("title")
	public void setTitle(String title) {
		this.title = title;
	}

	public Data_ withTitle(String title) {
		this.title = title;
		return this;
	}

	@JsonProperty("link_flair_richtext")
	public List<Object> getLinkFlairRichtext() {
		return linkFlairRichtext;
	}

	@JsonProperty("link_flair_richtext")
	public void setLinkFlairRichtext(List<Object> linkFlairRichtext) {
		this.linkFlairRichtext = linkFlairRichtext;
	}

	public Data_ withLinkFlairRichtext(List<Object> linkFlairRichtext) {
		this.linkFlairRichtext = linkFlairRichtext;
		return this;
	}

	@JsonProperty("subreddit_name_prefixed")
	public String getSubredditNamePrefixed() {
		return subredditNamePrefixed;
	}

	@JsonProperty("subreddit_name_prefixed")
	public void setSubredditNamePrefixed(String subredditNamePrefixed) {
		this.subredditNamePrefixed = subredditNamePrefixed;
	}

	public Data_ withSubredditNamePrefixed(String subredditNamePrefixed) {
		this.subredditNamePrefixed = subredditNamePrefixed;
		return this;
	}

	@JsonProperty("hidden")
	public Boolean getHidden() {
		return hidden;
	}

	@JsonProperty("hidden")
	public void setHidden(Boolean hidden) {
		this.hidden = hidden;
	}

	public Data_ withHidden(Boolean hidden) {
		this.hidden = hidden;
		return this;
	}

	@JsonProperty("pwls")
	public Integer getPwls() {
		return pwls;
	}

	@JsonProperty("pwls")
	public void setPwls(Integer pwls) {
		this.pwls = pwls;
	}

	public Data_ withPwls(Integer pwls) {
		this.pwls = pwls;
		return this;
	}

	@JsonProperty("link_flair_css_class")
	public Object getLinkFlairCssClass() {
		return linkFlairCssClass;
	}

	@JsonProperty("link_flair_css_class")
	public void setLinkFlairCssClass(Object linkFlairCssClass) {
		this.linkFlairCssClass = linkFlairCssClass;
	}

	public Data_ withLinkFlairCssClass(Object linkFlairCssClass) {
		this.linkFlairCssClass = linkFlairCssClass;
		return this;
	}

	@JsonProperty("downs")
	public Integer getDowns() {
		return downs;
	}

	@JsonProperty("downs")
	public void setDowns(Integer downs) {
		this.downs = downs;
	}

	public Data_ withDowns(Integer downs) {
		this.downs = downs;
		return this;
	}

	@JsonProperty("hide_score")
	public Boolean getHideScore() {
		return hideScore;
	}

	@JsonProperty("hide_score")
	public void setHideScore(Boolean hideScore) {
		this.hideScore = hideScore;
	}

	public Data_ withHideScore(Boolean hideScore) {
		this.hideScore = hideScore;
		return this;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	public Data_ withName(String name) {
		this.name = name;
		return this;
	}

	@JsonProperty("quarantine")
	public Boolean getQuarantine() {
		return quarantine;
	}

	@JsonProperty("quarantine")
	public void setQuarantine(Boolean quarantine) {
		this.quarantine = quarantine;
	}

	public Data_ withQuarantine(Boolean quarantine) {
		this.quarantine = quarantine;
		return this;
	}

	@JsonProperty("link_flair_text_color")
	public String getLinkFlairTextColor() {
		return linkFlairTextColor;
	}

	@JsonProperty("link_flair_text_color")
	public void setLinkFlairTextColor(String linkFlairTextColor) {
		this.linkFlairTextColor = linkFlairTextColor;
	}

	public Data_ withLinkFlairTextColor(String linkFlairTextColor) {
		this.linkFlairTextColor = linkFlairTextColor;
		return this;
	}

	@JsonProperty("upvote_ratio")
	public Double getUpvoteRatio() {
		return upvoteRatio;
	}

	@JsonProperty("upvote_ratio")
	public void setUpvoteRatio(Double upvoteRatio) {
		this.upvoteRatio = upvoteRatio;
	}

	public Data_ withUpvoteRatio(Double upvoteRatio) {
		this.upvoteRatio = upvoteRatio;
		return this;
	}

	@JsonProperty("author_flair_background_color")
	public Object getAuthorFlairBackgroundColor() {
		return authorFlairBackgroundColor;
	}

	@JsonProperty("author_flair_background_color")
	public void setAuthorFlairBackgroundColor(Object authorFlairBackgroundColor) {
		this.authorFlairBackgroundColor = authorFlairBackgroundColor;
	}

	public Data_ withAuthorFlairBackgroundColor(Object authorFlairBackgroundColor) {
		this.authorFlairBackgroundColor = authorFlairBackgroundColor;
		return this;
	}

	@JsonProperty("subreddit_type")
	public String getSubredditType() {
		return subredditType;
	}

	@JsonProperty("subreddit_type")
	public void setSubredditType(String subredditType) {
		this.subredditType = subredditType;
	}

	public Data_ withSubredditType(String subredditType) {
		this.subredditType = subredditType;
		return this;
	}

	@JsonProperty("ups")
	public Integer getUps() {
		return ups;
	}

	@JsonProperty("ups")
	public void setUps(Integer ups) {
		this.ups = ups;
	}

	public Data_ withUps(Integer ups) {
		this.ups = ups;
		return this;
	}

	@JsonProperty("total_awards_received")
	public Integer getTotalAwardsReceived() {
		return totalAwardsReceived;
	}

	@JsonProperty("total_awards_received")
	public void setTotalAwardsReceived(Integer totalAwardsReceived) {
		this.totalAwardsReceived = totalAwardsReceived;
	}

	public Data_ withTotalAwardsReceived(Integer totalAwardsReceived) {
		this.totalAwardsReceived = totalAwardsReceived;
		return this;
	}

	@JsonProperty("media_embed")
	public MediaEmbed getMediaEmbed() {
		return mediaEmbed;
	}

	@JsonProperty("media_embed")
	public void setMediaEmbed(MediaEmbed mediaEmbed) {
		this.mediaEmbed = mediaEmbed;
	}

	public Data_ withMediaEmbed(MediaEmbed mediaEmbed) {
		this.mediaEmbed = mediaEmbed;
		return this;
	}

	@JsonProperty("author_flair_template_id")
	public Object getAuthorFlairTemplateId() {
		return authorFlairTemplateId;
	}

	@JsonProperty("author_flair_template_id")
	public void setAuthorFlairTemplateId(Object authorFlairTemplateId) {
		this.authorFlairTemplateId = authorFlairTemplateId;
	}

	public Data_ withAuthorFlairTemplateId(Object authorFlairTemplateId) {
		this.authorFlairTemplateId = authorFlairTemplateId;
		return this;
	}

	@JsonProperty("is_original_content")
	public Boolean getIsOriginalContent() {
		return isOriginalContent;
	}

	@JsonProperty("is_original_content")
	public void setIsOriginalContent(Boolean isOriginalContent) {
		this.isOriginalContent = isOriginalContent;
	}

	public Data_ withIsOriginalContent(Boolean isOriginalContent) {
		this.isOriginalContent = isOriginalContent;
		return this;
	}

	@JsonProperty("user_reports")
	public List<Object> getUserReports() {
		return userReports;
	}

	@JsonProperty("user_reports")
	public void setUserReports(List<Object> userReports) {
		this.userReports = userReports;
	}

	public Data_ withUserReports(List<Object> userReports) {
		this.userReports = userReports;
		return this;
	}

	@JsonProperty("secure_media")
	public Object getSecureMedia() {
		return secureMedia;
	}

	@JsonProperty("secure_media")
	public void setSecureMedia(Object secureMedia) {
		this.secureMedia = secureMedia;
	}

	public Data_ withSecureMedia(Object secureMedia) {
		this.secureMedia = secureMedia;
		return this;
	}

	@JsonProperty("is_reddit_media_domain")
	public Boolean getIsRedditMediaDomain() {
		return isRedditMediaDomain;
	}

	@JsonProperty("is_reddit_media_domain")
	public void setIsRedditMediaDomain(Boolean isRedditMediaDomain) {
		this.isRedditMediaDomain = isRedditMediaDomain;
	}

	public Data_ withIsRedditMediaDomain(Boolean isRedditMediaDomain) {
		this.isRedditMediaDomain = isRedditMediaDomain;
		return this;
	}

	@JsonProperty("is_meta")
	public Boolean getIsMeta() {
		return isMeta;
	}

	@JsonProperty("is_meta")
	public void setIsMeta(Boolean isMeta) {
		this.isMeta = isMeta;
	}

	public Data_ withIsMeta(Boolean isMeta) {
		this.isMeta = isMeta;
		return this;
	}

	@JsonProperty("category")
	public Object getCategory() {
		return category;
	}

	@JsonProperty("category")
	public void setCategory(Object category) {
		this.category = category;
	}

	public Data_ withCategory(Object category) {
		this.category = category;
		return this;
	}

	@JsonProperty("secure_media_embed")
	public SecureMediaEmbed getSecureMediaEmbed() {
		return secureMediaEmbed;
	}

	@JsonProperty("secure_media_embed")
	public void setSecureMediaEmbed(SecureMediaEmbed secureMediaEmbed) {
		this.secureMediaEmbed = secureMediaEmbed;
	}

	public Data_ withSecureMediaEmbed(SecureMediaEmbed secureMediaEmbed) {
		this.secureMediaEmbed = secureMediaEmbed;
		return this;
	}

	@JsonProperty("link_flair_text")
	public Object getLinkFlairText() {
		return linkFlairText;
	}

	@JsonProperty("link_flair_text")
	public void setLinkFlairText(Object linkFlairText) {
		this.linkFlairText = linkFlairText;
	}

	public Data_ withLinkFlairText(Object linkFlairText) {
		this.linkFlairText = linkFlairText;
		return this;
	}

	@JsonProperty("can_mod_post")
	public Boolean getCanModPost() {
		return canModPost;
	}

	@JsonProperty("can_mod_post")
	public void setCanModPost(Boolean canModPost) {
		this.canModPost = canModPost;
	}

	public Data_ withCanModPost(Boolean canModPost) {
		this.canModPost = canModPost;
		return this;
	}

	@JsonProperty("score")
	public Integer getScore() {
		return score;
	}

	@JsonProperty("score")
	public void setScore(Integer score) {
		this.score = score;
	}

	public Data_ withScore(Integer score) {
		this.score = score;
		return this;
	}

	@JsonProperty("approved_by")
	public Object getApprovedBy() {
		return approvedBy;
	}

	@JsonProperty("approved_by")
	public void setApprovedBy(Object approvedBy) {
		this.approvedBy = approvedBy;
	}

	public Data_ withApprovedBy(Object approvedBy) {
		this.approvedBy = approvedBy;
		return this;
	}

	@JsonProperty("author_premium")
	public Boolean getAuthorPremium() {
		return authorPremium;
	}

	@JsonProperty("author_premium")
	public void setAuthorPremium(Boolean authorPremium) {
		this.authorPremium = authorPremium;
	}

	public Data_ withAuthorPremium(Boolean authorPremium) {
		this.authorPremium = authorPremium;
		return this;
	}

	@JsonProperty("thumbnail")
	public String getThumbnail() {
		return thumbnail;
	}

	@JsonProperty("thumbnail")
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public Data_ withThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
		return this;
	}

	@JsonProperty("edited")
	public String getEdited() {
		return edited;
	}

	@JsonProperty("edited")
	public void setEdited(String edited) {
		this.edited = edited;
	}

	public Data_ withEdited(String edited) {
		this.edited = edited;
		return this;
	}

	@JsonProperty("author_flair_css_class")
	public Object getAuthorFlairCssClass() {
		return authorFlairCssClass;
	}

	@JsonProperty("author_flair_css_class")
	public void setAuthorFlairCssClass(Object authorFlairCssClass) {
		this.authorFlairCssClass = authorFlairCssClass;
	}

	public Data_ withAuthorFlairCssClass(Object authorFlairCssClass) {
		this.authorFlairCssClass = authorFlairCssClass;
		return this;
	}

	@JsonProperty("author_flair_richtext")
	public List<Object> getAuthorFlairRichtext() {
		return authorFlairRichtext;
	}

	@JsonProperty("author_flair_richtext")
	public void setAuthorFlairRichtext(List<Object> authorFlairRichtext) {
		this.authorFlairRichtext = authorFlairRichtext;
	}

	public Data_ withAuthorFlairRichtext(List<Object> authorFlairRichtext) {
		this.authorFlairRichtext = authorFlairRichtext;
		return this;
	}

	@JsonProperty("gildings")
	public Gildings getGildings() {
		return gildings;
	}

	@JsonProperty("gildings")
	public void setGildings(Gildings gildings) {
		this.gildings = gildings;
	}

	public Data_ withGildings(Gildings gildings) {
		this.gildings = gildings;
		return this;
	}

	@JsonProperty("content_categories")
	public Object getContentCategories() {
		return contentCategories;
	}

	@JsonProperty("content_categories")
	public void setContentCategories(Object contentCategories) {
		this.contentCategories = contentCategories;
	}

	public Data_ withContentCategories(Object contentCategories) {
		this.contentCategories = contentCategories;
		return this;
	}

	@JsonProperty("is_self")
	public Boolean getIsSelf() {
		return isSelf;
	}

	@JsonProperty("is_self")
	public void setIsSelf(Boolean isSelf) {
		this.isSelf = isSelf;
	}

	public Data_ withIsSelf(Boolean isSelf) {
		this.isSelf = isSelf;
		return this;
	}

	@JsonProperty("mod_note")
	public Object getModNote() {
		return modNote;
	}

	@JsonProperty("mod_note")
	public void setModNote(Object modNote) {
		this.modNote = modNote;
	}

	public Data_ withModNote(Object modNote) {
		this.modNote = modNote;
		return this;
	}

	@JsonProperty("created")
	public Double getCreated() {
		return created;
	}

	@JsonProperty("created")
	public void setCreated(Double created) {
		this.created = created;
	}

	public Data_ withCreated(Double created) {
		this.created = created;
		return this;
	}

	@JsonProperty("link_flair_type")
	public String getLinkFlairType() {
		return linkFlairType;
	}

	@JsonProperty("link_flair_type")
	public void setLinkFlairType(String linkFlairType) {
		this.linkFlairType = linkFlairType;
	}

	public Data_ withLinkFlairType(String linkFlairType) {
		this.linkFlairType = linkFlairType;
		return this;
	}

	@JsonProperty("wls")
	public Integer getWls() {
		return wls;
	}

	@JsonProperty("wls")
	public void setWls(Integer wls) {
		this.wls = wls;
	}

	public Data_ withWls(Integer wls) {
		this.wls = wls;
		return this;
	}

	@JsonProperty("removed_by_category")
	public Object getRemovedByCategory() {
		return removedByCategory;
	}

	@JsonProperty("removed_by_category")
	public void setRemovedByCategory(Object removedByCategory) {
		this.removedByCategory = removedByCategory;
	}

	public Data_ withRemovedByCategory(Object removedByCategory) {
		this.removedByCategory = removedByCategory;
		return this;
	}

	@JsonProperty("banned_by")
	public Object getBannedBy() {
		return bannedBy;
	}

	@JsonProperty("banned_by")
	public void setBannedBy(Object bannedBy) {
		this.bannedBy = bannedBy;
	}

	public Data_ withBannedBy(Object bannedBy) {
		this.bannedBy = bannedBy;
		return this;
	}

	@JsonProperty("author_flair_type")
	public String getAuthorFlairType() {
		return authorFlairType;
	}

	@JsonProperty("author_flair_type")
	public void setAuthorFlairType(String authorFlairType) {
		this.authorFlairType = authorFlairType;
	}

	public Data_ withAuthorFlairType(String authorFlairType) {
		this.authorFlairType = authorFlairType;
		return this;
	}

	@JsonProperty("domain")
	public String getDomain() {
		return domain;
	}

	@JsonProperty("domain")
	public void setDomain(String domain) {
		this.domain = domain;
	}

	public Data_ withDomain(String domain) {
		this.domain = domain;
		return this;
	}

	@JsonProperty("allow_live_comments")
	public Boolean getAllowLiveComments() {
		return allowLiveComments;
	}

	@JsonProperty("allow_live_comments")
	public void setAllowLiveComments(Boolean allowLiveComments) {
		this.allowLiveComments = allowLiveComments;
	}

	public Data_ withAllowLiveComments(Boolean allowLiveComments) {
		this.allowLiveComments = allowLiveComments;
		return this;
	}

	@JsonProperty("selftext_html")
	public String getSelftextHtml() {
		return selftextHtml;
	}

	@JsonProperty("selftext_html")
	public void setSelftextHtml(String selftextHtml) {
		this.selftextHtml = selftextHtml;
	}

	public Data_ withSelftextHtml(String selftextHtml) {
		this.selftextHtml = selftextHtml;
		return this;
	}

	@JsonProperty("likes")
	public Object getLikes() {
		return likes;
	}

	@JsonProperty("likes")
	public void setLikes(Object likes) {
		this.likes = likes;
	}

	public Data_ withLikes(Object likes) {
		this.likes = likes;
		return this;
	}

	@JsonProperty("suggested_sort")
	public Object getSuggestedSort() {
		return suggestedSort;
	}

	@JsonProperty("suggested_sort")
	public void setSuggestedSort(Object suggestedSort) {
		this.suggestedSort = suggestedSort;
	}

	public Data_ withSuggestedSort(Object suggestedSort) {
		this.suggestedSort = suggestedSort;
		return this;
	}

	@JsonProperty("banned_at_utc")
	public Object getBannedAtUtc() {
		return bannedAtUtc;
	}

	@JsonProperty("banned_at_utc")
	public void setBannedAtUtc(Object bannedAtUtc) {
		this.bannedAtUtc = bannedAtUtc;
	}

	public Data_ withBannedAtUtc(Object bannedAtUtc) {
		this.bannedAtUtc = bannedAtUtc;
		return this;
	}

	@JsonProperty("view_count")
	public Object getViewCount() {
		return viewCount;
	}

	@JsonProperty("view_count")
	public void setViewCount(Object viewCount) {
		this.viewCount = viewCount;
	}

	public Data_ withViewCount(Object viewCount) {
		this.viewCount = viewCount;
		return this;
	}

	@JsonProperty("archived")
	public Boolean getArchived() {
		return archived;
	}

	@JsonProperty("archived")
	public void setArchived(Boolean archived) {
		this.archived = archived;
	}

	public Data_ withArchived(Boolean archived) {
		this.archived = archived;
		return this;
	}

	@JsonProperty("no_follow")
	public Boolean getNoFollow() {
		return noFollow;
	}

	@JsonProperty("no_follow")
	public void setNoFollow(Boolean noFollow) {
		this.noFollow = noFollow;
	}

	public Data_ withNoFollow(Boolean noFollow) {
		this.noFollow = noFollow;
		return this;
	}

	@JsonProperty("is_crosspostable")
	public Boolean getIsCrosspostable() {
		return isCrosspostable;
	}

	@JsonProperty("is_crosspostable")
	public void setIsCrosspostable(Boolean isCrosspostable) {
		this.isCrosspostable = isCrosspostable;
	}

	public Data_ withIsCrosspostable(Boolean isCrosspostable) {
		this.isCrosspostable = isCrosspostable;
		return this;
	}

	@JsonProperty("pinned")
	public Boolean getPinned() {
		return pinned;
	}

	@JsonProperty("pinned")
	public void setPinned(Boolean pinned) {
		this.pinned = pinned;
	}

	public Data_ withPinned(Boolean pinned) {
		this.pinned = pinned;
		return this;
	}

	@JsonProperty("over_18")
	public Boolean getOver18() {
		return over18;
	}

	@JsonProperty("over_18")
	public void setOver18(Boolean over18) {
		this.over18 = over18;
	}

	public Data_ withOver18(Boolean over18) {
		this.over18 = over18;
		return this;
	}

	@JsonProperty("all_awardings")
	public List<Object> getAllAwardings() {
		return allAwardings;
	}

	@JsonProperty("all_awardings")
	public void setAllAwardings(List<Object> allAwardings) {
		this.allAwardings = allAwardings;
	}

	public Data_ withAllAwardings(List<Object> allAwardings) {
		this.allAwardings = allAwardings;
		return this;
	}

	@JsonProperty("awarders")
	public List<Object> getAwarders() {
		return awarders;
	}

	@JsonProperty("awarders")
	public void setAwarders(List<Object> awarders) {
		this.awarders = awarders;
	}

	public Data_ withAwarders(List<Object> awarders) {
		this.awarders = awarders;
		return this;
	}

	@JsonProperty("media_only")
	public Boolean getMediaOnly() {
		return mediaOnly;
	}

	@JsonProperty("media_only")
	public void setMediaOnly(Boolean mediaOnly) {
		this.mediaOnly = mediaOnly;
	}

	public Data_ withMediaOnly(Boolean mediaOnly) {
		this.mediaOnly = mediaOnly;
		return this;
	}

	@JsonProperty("link_flair_template_id")
	public String getLinkFlairTemplateId() {
		return linkFlairTemplateId;
	}

	@JsonProperty("link_flair_template_id")
	public void setLinkFlairTemplateId(String linkFlairTemplateId) {
		this.linkFlairTemplateId = linkFlairTemplateId;
	}

	public Data_ withLinkFlairTemplateId(String linkFlairTemplateId) {
		this.linkFlairTemplateId = linkFlairTemplateId;
		return this;
	}

	@JsonProperty("can_gild")
	public Boolean getCanGild() {
		return canGild;
	}

	@JsonProperty("can_gild")
	public void setCanGild(Boolean canGild) {
		this.canGild = canGild;
	}

	public Data_ withCanGild(Boolean canGild) {
		this.canGild = canGild;
		return this;
	}

	@JsonProperty("spoiler")
	public Boolean getSpoiler() {
		return spoiler;
	}

	@JsonProperty("spoiler")
	public void setSpoiler(Boolean spoiler) {
		this.spoiler = spoiler;
	}

	public Data_ withSpoiler(Boolean spoiler) {
		this.spoiler = spoiler;
		return this;
	}

	@JsonProperty("locked")
	public Boolean getLocked() {
		return locked;
	}

	@JsonProperty("locked")
	public void setLocked(Boolean locked) {
		this.locked = locked;
	}

	public Data_ withLocked(Boolean locked) {
		this.locked = locked;
		return this;
	}

	@JsonProperty("author_flair_text")
	public Object getAuthorFlairText() {
		return authorFlairText;
	}

	@JsonProperty("author_flair_text")
	public void setAuthorFlairText(Object authorFlairText) {
		this.authorFlairText = authorFlairText;
	}

	public Data_ withAuthorFlairText(Object authorFlairText) {
		this.authorFlairText = authorFlairText;
		return this;
	}

	@JsonProperty("treatment_tags")
	public List<Object> getTreatmentTags() {
		return treatmentTags;
	}

	@JsonProperty("treatment_tags")
	public void setTreatmentTags(List<Object> treatmentTags) {
		this.treatmentTags = treatmentTags;
	}

	public Data_ withTreatmentTags(List<Object> treatmentTags) {
		this.treatmentTags = treatmentTags;
		return this;
	}

	@JsonProperty("visited")
	public Boolean getVisited() {
		return visited;
	}

	@JsonProperty("visited")
	public void setVisited(Boolean visited) {
		this.visited = visited;
	}

	public Data_ withVisited(Boolean visited) {
		this.visited = visited;
		return this;
	}

	@JsonProperty("removed_by")
	public Object getRemovedBy() {
		return removedBy;
	}

	@JsonProperty("removed_by")
	public void setRemovedBy(Object removedBy) {
		this.removedBy = removedBy;
	}

	public Data_ withRemovedBy(Object removedBy) {
		this.removedBy = removedBy;
		return this;
	}

	@JsonProperty("num_reports")
	public Object getNumReports() {
		return numReports;
	}

	@JsonProperty("num_reports")
	public void setNumReports(Object numReports) {
		this.numReports = numReports;
	}

	public Data_ withNumReports(Object numReports) {
		this.numReports = numReports;
		return this;
	}

	@JsonProperty("distinguished")
	public Object getDistinguished() {
		return distinguished;
	}

	@JsonProperty("distinguished")
	public void setDistinguished(Object distinguished) {
		this.distinguished = distinguished;
	}

	public Data_ withDistinguished(Object distinguished) {
		this.distinguished = distinguished;
		return this;
	}

	@JsonProperty("subreddit_id")
	public String getSubredditId() {
		return subredditId;
	}

	@JsonProperty("subreddit_id")
	public void setSubredditId(String subredditId) {
		this.subredditId = subredditId;
	}

	public Data_ withSubredditId(String subredditId) {
		this.subredditId = subredditId;
		return this;
	}

	@JsonProperty("mod_reason_by")
	public Object getModReasonBy() {
		return modReasonBy;
	}

	@JsonProperty("mod_reason_by")
	public void setModReasonBy(Object modReasonBy) {
		this.modReasonBy = modReasonBy;
	}

	public Data_ withModReasonBy(Object modReasonBy) {
		this.modReasonBy = modReasonBy;
		return this;
	}

	@JsonProperty("removal_reason")
	public Object getRemovalReason() {
		return removalReason;
	}

	@JsonProperty("removal_reason")
	public void setRemovalReason(Object removalReason) {
		this.removalReason = removalReason;
	}

	public Data_ withRemovalReason(Object removalReason) {
		this.removalReason = removalReason;
		return this;
	}

	@JsonProperty("link_flair_background_color")
	public String getLinkFlairBackgroundColor() {
		return linkFlairBackgroundColor;
	}

	@JsonProperty("link_flair_background_color")
	public void setLinkFlairBackgroundColor(String linkFlairBackgroundColor) {
		this.linkFlairBackgroundColor = linkFlairBackgroundColor;
	}

	public Data_ withLinkFlairBackgroundColor(String linkFlairBackgroundColor) {
		this.linkFlairBackgroundColor = linkFlairBackgroundColor;
		return this;
	}

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	public Data_ withId(String id) {
		this.id = id;
		return this;
	}

	@JsonProperty("is_robot_indexable")
	public Boolean getIsRobotIndexable() {
		return isRobotIndexable;
	}

	@JsonProperty("is_robot_indexable")
	public void setIsRobotIndexable(Boolean isRobotIndexable) {
		this.isRobotIndexable = isRobotIndexable;
	}

	public Data_ withIsRobotIndexable(Boolean isRobotIndexable) {
		this.isRobotIndexable = isRobotIndexable;
		return this;
	}

	@JsonProperty("report_reasons")
	public Object getReportReasons() {
		return reportReasons;
	}

	@JsonProperty("report_reasons")
	public void setReportReasons(Object reportReasons) {
		this.reportReasons = reportReasons;
	}

	public Data_ withReportReasons(Object reportReasons) {
		this.reportReasons = reportReasons;
		return this;
	}

	@JsonProperty("author")
	public String getAuthor() {
		return author;
	}

	@JsonProperty("author")
	public void setAuthor(String author) {
		this.author = author;
	}

	public Data_ withAuthor(String author) {
		this.author = author;
		return this;
	}

	@JsonProperty("discussion_type")
	public Object getDiscussionType() {
		return discussionType;
	}

	@JsonProperty("discussion_type")
	public void setDiscussionType(Object discussionType) {
		this.discussionType = discussionType;
	}

	public Data_ withDiscussionType(Object discussionType) {
		this.discussionType = discussionType;
		return this;
	}

	@JsonProperty("num_comments")
	public Integer getNumComments() {
		return numComments;
	}

	@JsonProperty("num_comments")
	public void setNumComments(Integer numComments) {
		this.numComments = numComments;
	}

	public Data_ withNumComments(Integer numComments) {
		this.numComments = numComments;
		return this;
	}

	@JsonProperty("send_replies")
	public Boolean getSendReplies() {
		return sendReplies;
	}

	@JsonProperty("send_replies")
	public void setSendReplies(Boolean sendReplies) {
		this.sendReplies = sendReplies;
	}

	public Data_ withSendReplies(Boolean sendReplies) {
		this.sendReplies = sendReplies;
		return this;
	}

	@JsonProperty("whitelist_status")
	public String getWhitelistStatus() {
		return whitelistStatus;
	}

	@JsonProperty("whitelist_status")
	public void setWhitelistStatus(String whitelistStatus) {
		this.whitelistStatus = whitelistStatus;
	}

	public Data_ withWhitelistStatus(String whitelistStatus) {
		this.whitelistStatus = whitelistStatus;
		return this;
	}

	@JsonProperty("contest_mode")
	public Boolean getContestMode() {
		return contestMode;
	}

	@JsonProperty("contest_mode")
	public void setContestMode(Boolean contestMode) {
		this.contestMode = contestMode;
	}

	public Data_ withContestMode(Boolean contestMode) {
		this.contestMode = contestMode;
		return this;
	}

	@JsonProperty("mod_reports")
	public List<Object> getModReports() {
		return modReports;
	}

	@JsonProperty("mod_reports")
	public void setModReports(List<Object> modReports) {
		this.modReports = modReports;
	}

	public Data_ withModReports(List<Object> modReports) {
		this.modReports = modReports;
		return this;
	}

	@JsonProperty("author_patreon_flair")
	public Boolean getAuthorPatreonFlair() {
		return authorPatreonFlair;
	}

	@JsonProperty("author_patreon_flair")
	public void setAuthorPatreonFlair(Boolean authorPatreonFlair) {
		this.authorPatreonFlair = authorPatreonFlair;
	}

	public Data_ withAuthorPatreonFlair(Boolean authorPatreonFlair) {
		this.authorPatreonFlair = authorPatreonFlair;
		return this;
	}

	@JsonProperty("author_flair_text_color")
	public Object getAuthorFlairTextColor() {
		return authorFlairTextColor;
	}

	@JsonProperty("author_flair_text_color")
	public void setAuthorFlairTextColor(Object authorFlairTextColor) {
		this.authorFlairTextColor = authorFlairTextColor;
	}

	public Data_ withAuthorFlairTextColor(Object authorFlairTextColor) {
		this.authorFlairTextColor = authorFlairTextColor;
		return this;
	}

	@JsonProperty("permalink")
	public String getPermalink() {
		return permalink;
	}

	@JsonProperty("permalink")
	public void setPermalink(String permalink) {
		this.permalink = permalink;
	}

	public Data_ withPermalink(String permalink) {
		this.permalink = permalink;
		return this;
	}

	@JsonProperty("parent_whitelist_status")
	public String getParentWhitelistStatus() {
		return parentWhitelistStatus;
	}

	@JsonProperty("parent_whitelist_status")
	public void setParentWhitelistStatus(String parentWhitelistStatus) {
		this.parentWhitelistStatus = parentWhitelistStatus;
	}

	public Data_ withParentWhitelistStatus(String parentWhitelistStatus) {
		this.parentWhitelistStatus = parentWhitelistStatus;
		return this;
	}

	@JsonProperty("stickied")
	public Boolean getStickied() {
		return stickied;
	}

	@JsonProperty("stickied")
	public void setStickied(Boolean stickied) {
		this.stickied = stickied;
	}

	public Data_ withStickied(Boolean stickied) {
		this.stickied = stickied;
		return this;
	}

	@JsonProperty("url")
	public String getUrl() {
		return url;
	}

	@JsonProperty("url")
	public void setUrl(String url) {
		this.url = url;
	}

	public Data_ withUrl(String url) {
		this.url = url;
		return this;
	}

	@JsonProperty("subreddit_subscribers")
	public Integer getSubredditSubscribers() {
		return subredditSubscribers;
	}

	@JsonProperty("subreddit_subscribers")
	public void setSubredditSubscribers(Integer subredditSubscribers) {
		this.subredditSubscribers = subredditSubscribers;
	}

	public Data_ withSubredditSubscribers(Integer subredditSubscribers) {
		this.subredditSubscribers = subredditSubscribers;
		return this;
	}

	@JsonProperty("created_utc")
	public Double getCreatedUtc() {
		return createdUtc;
	}

	@JsonProperty("created_utc")
	public void setCreatedUtc(Double createdUtc) {
		this.createdUtc = createdUtc;
	}

	public Data_ withCreatedUtc(Double createdUtc) {
		this.createdUtc = createdUtc;
		return this;
	}

	@JsonProperty("num_crossposts")
	public Integer getNumCrossposts() {
		return numCrossposts;
	}

	@JsonProperty("num_crossposts")
	public void setNumCrossposts(Integer numCrossposts) {
		this.numCrossposts = numCrossposts;
	}

	public Data_ withNumCrossposts(Integer numCrossposts) {
		this.numCrossposts = numCrossposts;
		return this;
	}

	@JsonProperty("media")
	public Object getMedia() {
		return media;
	}

	@JsonProperty("media")
	public void setMedia(Object media) {
		this.media = media;
	}

	public Data_ withMedia(Object media) {
		this.media = media;
		return this;
	}

	@JsonProperty("is_video")
	public Boolean getIsVideo() {
		return isVideo;
	}

	@JsonProperty("is_video")
	public void setIsVideo(Boolean isVideo) {
		this.isVideo = isVideo;
	}

	public Data_ withIsVideo(Boolean isVideo) {
		this.isVideo = isVideo;
		return this;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public Data_ withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}
