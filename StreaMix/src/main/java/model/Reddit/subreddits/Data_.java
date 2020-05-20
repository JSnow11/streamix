
package model.reddit.subreddits;

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
@JsonPropertyOrder({ "user_flair_background_color", "submit_text_html", "restrict_posting", "user_is_banned",
		"free_form_reports", "wiki_enabled", "user_is_muted", "user_can_flair_in_sr", "display_name", "header_img",
		"title", "icon_size", "primary_color", "active_user_count", "icon_img", "display_name_prefixed",
		"accounts_active", "public_traffic", "subscribers", "user_flair_richtext", "videostream_links_count", "name",
		"quarantine", "hide_ads", "emojis_enabled", "advertiser_category", "public_description",
		"comment_score_hide_mins", "user_has_favorited", "user_flair_template_id", "community_icon",
		"banner_background_image", "original_content_tag_enabled", "submit_text", "description_html",
		"spoilers_enabled", "header_title", "header_size", "user_flair_position", "all_original_content",
		"has_menu_widget", "is_enrolled_in_new_modmail", "key_color", "can_assign_user_flair", "created", "wls",
		"show_media_preview", "submission_type", "user_is_subscriber", "disable_contributor_requests",
		"allow_videogifs", "user_flair_type", "allow_polls", "collapse_deleted_comments", "emojis_custom_size",
		"public_description_html", "allow_videos", "is_crosspostable_subreddit", "suggested_comment_sort",
		"can_assign_link_flair", "accounts_active_is_fuzzed", "submit_text_label", "link_flair_position",
		"user_sr_flair_enabled", "user_flair_enabled_in_sr", "allow_chat_post_creation", "allow_discovery",
		"user_sr_theme_enabled", "link_flair_enabled", "subreddit_type", "notification_level", "banner_img",
		"user_flair_text", "banner_background_color", "show_media", "id", "user_is_contributor", "over18",
		"description", "is_chat_post_feature_enabled", "submit_link_label", "user_flair_text_color",
		"restrict_commenting", "user_flair_css_class", "allow_images", "lang", "whitelist_status", "url", "created_utc",
		"banner_size", "mobile_banner_image", "user_is_moderator" })
public class Data_ {

	@JsonProperty("user_flair_background_color")
	private Object userFlairBackgroundColor;
	@JsonProperty("submit_text_html")
	private String submitTextHtml;
	@JsonProperty("restrict_posting")
	private Boolean restrictPosting;
	@JsonProperty("user_is_banned")
	private Boolean userIsBanned;
	@JsonProperty("free_form_reports")
	private Boolean freeFormReports;
	@JsonProperty("wiki_enabled")
	private Boolean wikiEnabled;
	@JsonProperty("user_is_muted")
	private Boolean userIsMuted;
	@JsonProperty("user_can_flair_in_sr")
	private Object userCanFlairInSr;
	@JsonProperty("display_name")
	private String displayName;
	@JsonProperty("header_img")
	private String headerImg;
	@JsonProperty("title")
	private String title;
	@JsonProperty("icon_size")
	private List<Integer> iconSize = null;
	@JsonProperty("primary_color")
	private String primaryColor;
	@JsonProperty("active_user_count")
	private Object activeUserCount;
	@JsonProperty("icon_img")
	private String iconImg;
	@JsonProperty("display_name_prefixed")
	private String displayNamePrefixed;
	@JsonProperty("accounts_active")
	private Object accountsActive;
	@JsonProperty("public_traffic")
	private Boolean publicTraffic;
	@JsonProperty("subscribers")
	private Integer subscribers;
	@JsonProperty("user_flair_richtext")
	private List<Object> userFlairRichtext = null;
	@JsonProperty("videostream_links_count")
	private Integer videostreamLinksCount;
	@JsonProperty("name")
	private String name;
	@JsonProperty("quarantine")
	private Boolean quarantine;
	@JsonProperty("hide_ads")
	private Boolean hideAds;
	@JsonProperty("emojis_enabled")
	private Boolean emojisEnabled;
	@JsonProperty("advertiser_category")
	private String advertiserCategory;
	@JsonProperty("public_description")
	private String publicDescription;
	@JsonProperty("comment_score_hide_mins")
	private Integer commentScoreHideMins;
	@JsonProperty("user_has_favorited")
	private Boolean userHasFavorited;
	@JsonProperty("user_flair_template_id")
	private Object userFlairTemplateId;
	@JsonProperty("community_icon")
	private String communityIcon;
	@JsonProperty("banner_background_image")
	private String bannerBackgroundImage;
	@JsonProperty("original_content_tag_enabled")
	private Boolean originalContentTagEnabled;
	@JsonProperty("submit_text")
	private String submitText;
	@JsonProperty("description_html")
	private String descriptionHtml;
	@JsonProperty("spoilers_enabled")
	private Boolean spoilersEnabled;
	@JsonProperty("header_title")
	private String headerTitle;
	@JsonProperty("header_size")
	private List<Integer> headerSize = null;
	@JsonProperty("user_flair_position")
	private String userFlairPosition;
	@JsonProperty("all_original_content")
	private Boolean allOriginalContent;
	@JsonProperty("has_menu_widget")
	private Boolean hasMenuWidget;
	@JsonProperty("is_enrolled_in_new_modmail")
	private Object isEnrolledInNewModmail;
	@JsonProperty("key_color")
	private String keyColor;
	@JsonProperty("can_assign_user_flair")
	private Boolean canAssignUserFlair;
	@JsonProperty("created")
	private Double created;
	@JsonProperty("wls")
	private Integer wls;
	@JsonProperty("show_media_preview")
	private Boolean showMediaPreview;
	@JsonProperty("submission_type")
	private String submissionType;
	@JsonProperty("user_is_subscriber")
	private Boolean userIsSubscriber;
	@JsonProperty("disable_contributor_requests")
	private Boolean disableContributorRequests;
	@JsonProperty("allow_videogifs")
	private Boolean allowVideogifs;
	@JsonProperty("user_flair_type")
	private String userFlairType;
	@JsonProperty("allow_polls")
	private Boolean allowPolls;
	@JsonProperty("collapse_deleted_comments")
	private Boolean collapseDeletedComments;
	@JsonProperty("emojis_custom_size")
	private Object emojisCustomSize;
	@JsonProperty("public_description_html")
	private String publicDescriptionHtml;
	@JsonProperty("allow_videos")
	private Boolean allowVideos;
	@JsonProperty("is_crosspostable_subreddit")
	private Object isCrosspostableSubreddit;
	@JsonProperty("suggested_comment_sort")
	private Object suggestedCommentSort;
	@JsonProperty("can_assign_link_flair")
	private Boolean canAssignLinkFlair;
	@JsonProperty("accounts_active_is_fuzzed")
	private Boolean accountsActiveIsFuzzed;
	@JsonProperty("submit_text_label")
	private String submitTextLabel;
	@JsonProperty("link_flair_position")
	private String linkFlairPosition;
	@JsonProperty("user_sr_flair_enabled")
	private Object userSrFlairEnabled;
	@JsonProperty("user_flair_enabled_in_sr")
	private Boolean userFlairEnabledInSr;
	@JsonProperty("allow_chat_post_creation")
	private Boolean allowChatPostCreation;
	@JsonProperty("allow_discovery")
	private Boolean allowDiscovery;
	@JsonProperty("user_sr_theme_enabled")
	private Boolean userSrThemeEnabled;
	@JsonProperty("link_flair_enabled")
	private Boolean linkFlairEnabled;
	@JsonProperty("subreddit_type")
	private String subredditType;
	@JsonProperty("notification_level")
	private Object notificationLevel;
	@JsonProperty("banner_img")
	private String bannerImg;
	@JsonProperty("user_flair_text")
	private Object userFlairText;
	@JsonProperty("banner_background_color")
	private String bannerBackgroundColor;
	@JsonProperty("show_media")
	private Boolean showMedia;
	@JsonProperty("id")
	private String id;
	@JsonProperty("user_is_contributor")
	private Boolean userIsContributor;
	@JsonProperty("over18")
	private Boolean over18;
	@JsonProperty("description")
	private String description;
	@JsonProperty("is_chat_post_feature_enabled")
	private Boolean isChatPostFeatureEnabled;
	@JsonProperty("submit_link_label")
	private String submitLinkLabel;
	@JsonProperty("user_flair_text_color")
	private Object userFlairTextColor;
	@JsonProperty("restrict_commenting")
	private Boolean restrictCommenting;
	@JsonProperty("user_flair_css_class")
	private Object userFlairCssClass;
	@JsonProperty("allow_images")
	private Boolean allowImages;
	@JsonProperty("lang")
	private String lang;
	@JsonProperty("whitelist_status")
	private String whitelistStatus;
	@JsonProperty("url")
	private String url;
	@JsonProperty("created_utc")
	private Double createdUtc;
	@JsonProperty("banner_size")
	private Object bannerSize;
	@JsonProperty("mobile_banner_image")
	private String mobileBannerImage;
	@JsonProperty("user_is_moderator")
	private Boolean userIsModerator;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("user_flair_background_color")
	public Object getUserFlairBackgroundColor() {
		return userFlairBackgroundColor;
	}

	@JsonProperty("user_flair_background_color")
	public void setUserFlairBackgroundColor(Object userFlairBackgroundColor) {
		this.userFlairBackgroundColor = userFlairBackgroundColor;
	}

	public Data_ withUserFlairBackgroundColor(Object userFlairBackgroundColor) {
		this.userFlairBackgroundColor = userFlairBackgroundColor;
		return this;
	}

	@JsonProperty("submit_text_html")
	public String getSubmitTextHtml() {
		return submitTextHtml;
	}

	@JsonProperty("submit_text_html")
	public void setSubmitTextHtml(String submitTextHtml) {
		this.submitTextHtml = submitTextHtml;
	}

	public Data_ withSubmitTextHtml(String submitTextHtml) {
		this.submitTextHtml = submitTextHtml;
		return this;
	}

	@JsonProperty("restrict_posting")
	public Boolean getRestrictPosting() {
		return restrictPosting;
	}

	@JsonProperty("restrict_posting")
	public void setRestrictPosting(Boolean restrictPosting) {
		this.restrictPosting = restrictPosting;
	}

	public Data_ withRestrictPosting(Boolean restrictPosting) {
		this.restrictPosting = restrictPosting;
		return this;
	}

	@JsonProperty("user_is_banned")
	public Boolean getUserIsBanned() {
		return userIsBanned;
	}

	@JsonProperty("user_is_banned")
	public void setUserIsBanned(Boolean userIsBanned) {
		this.userIsBanned = userIsBanned;
	}

	public Data_ withUserIsBanned(Boolean userIsBanned) {
		this.userIsBanned = userIsBanned;
		return this;
	}

	@JsonProperty("free_form_reports")
	public Boolean getFreeFormReports() {
		return freeFormReports;
	}

	@JsonProperty("free_form_reports")
	public void setFreeFormReports(Boolean freeFormReports) {
		this.freeFormReports = freeFormReports;
	}

	public Data_ withFreeFormReports(Boolean freeFormReports) {
		this.freeFormReports = freeFormReports;
		return this;
	}

	@JsonProperty("wiki_enabled")
	public Boolean getWikiEnabled() {
		return wikiEnabled;
	}

	@JsonProperty("wiki_enabled")
	public void setWikiEnabled(Boolean wikiEnabled) {
		this.wikiEnabled = wikiEnabled;
	}

	public Data_ withWikiEnabled(Boolean wikiEnabled) {
		this.wikiEnabled = wikiEnabled;
		return this;
	}

	@JsonProperty("user_is_muted")
	public Boolean getUserIsMuted() {
		return userIsMuted;
	}

	@JsonProperty("user_is_muted")
	public void setUserIsMuted(Boolean userIsMuted) {
		this.userIsMuted = userIsMuted;
	}

	public Data_ withUserIsMuted(Boolean userIsMuted) {
		this.userIsMuted = userIsMuted;
		return this;
	}

	@JsonProperty("user_can_flair_in_sr")
	public Object getUserCanFlairInSr() {
		return userCanFlairInSr;
	}

	@JsonProperty("user_can_flair_in_sr")
	public void setUserCanFlairInSr(Object userCanFlairInSr) {
		this.userCanFlairInSr = userCanFlairInSr;
	}

	public Data_ withUserCanFlairInSr(Object userCanFlairInSr) {
		this.userCanFlairInSr = userCanFlairInSr;
		return this;
	}

	@JsonProperty("display_name")
	public String getDisplayName() {
		return displayName;
	}

	@JsonProperty("display_name")
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public Data_ withDisplayName(String displayName) {
		this.displayName = displayName;
		return this;
	}

	@JsonProperty("header_img")
	public String getHeaderImg() {
		return headerImg;
	}

	@JsonProperty("header_img")
	public void setHeaderImg(String headerImg) {
		this.headerImg = headerImg;
	}

	public Data_ withHeaderImg(String headerImg) {
		this.headerImg = headerImg;
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

	@JsonProperty("icon_size")
	public List<Integer> getIconSize() {
		return iconSize;
	}

	@JsonProperty("icon_size")
	public void setIconSize(List<Integer> iconSize) {
		this.iconSize = iconSize;
	}

	public Data_ withIconSize(List<Integer> iconSize) {
		this.iconSize = iconSize;
		return this;
	}

	@JsonProperty("primary_color")
	public String getPrimaryColor() {
		return primaryColor;
	}

	@JsonProperty("primary_color")
	public void setPrimaryColor(String primaryColor) {
		this.primaryColor = primaryColor;
	}

	public Data_ withPrimaryColor(String primaryColor) {
		this.primaryColor = primaryColor;
		return this;
	}

	@JsonProperty("active_user_count")
	public Object getActiveUserCount() {
		return activeUserCount;
	}

	@JsonProperty("active_user_count")
	public void setActiveUserCount(Object activeUserCount) {
		this.activeUserCount = activeUserCount;
	}

	public Data_ withActiveUserCount(Object activeUserCount) {
		this.activeUserCount = activeUserCount;
		return this;
	}

	@JsonProperty("icon_img")
	public String getIconImg() {
		return iconImg;
	}

	@JsonProperty("icon_img")
	public void setIconImg(String iconImg) {
		this.iconImg = iconImg;
	}

	public Data_ withIconImg(String iconImg) {
		this.iconImg = iconImg;
		return this;
	}

	@JsonProperty("display_name_prefixed")
	public String getDisplayNamePrefixed() {
		return displayNamePrefixed;
	}

	@JsonProperty("display_name_prefixed")
	public void setDisplayNamePrefixed(String displayNamePrefixed) {
		this.displayNamePrefixed = displayNamePrefixed;
	}

	public Data_ withDisplayNamePrefixed(String displayNamePrefixed) {
		this.displayNamePrefixed = displayNamePrefixed;
		return this;
	}

	@JsonProperty("accounts_active")
	public Object getAccountsActive() {
		return accountsActive;
	}

	@JsonProperty("accounts_active")
	public void setAccountsActive(Object accountsActive) {
		this.accountsActive = accountsActive;
	}

	public Data_ withAccountsActive(Object accountsActive) {
		this.accountsActive = accountsActive;
		return this;
	}

	@JsonProperty("public_traffic")
	public Boolean getPublicTraffic() {
		return publicTraffic;
	}

	@JsonProperty("public_traffic")
	public void setPublicTraffic(Boolean publicTraffic) {
		this.publicTraffic = publicTraffic;
	}

	public Data_ withPublicTraffic(Boolean publicTraffic) {
		this.publicTraffic = publicTraffic;
		return this;
	}

	@JsonProperty("subscribers")
	public Integer getSubscribers() {
		return subscribers;
	}

	@JsonProperty("subscribers")
	public void setSubscribers(Integer subscribers) {
		this.subscribers = subscribers;
	}

	public Data_ withSubscribers(Integer subscribers) {
		this.subscribers = subscribers;
		return this;
	}

	@JsonProperty("user_flair_richtext")
	public List<Object> getUserFlairRichtext() {
		return userFlairRichtext;
	}

	@JsonProperty("user_flair_richtext")
	public void setUserFlairRichtext(List<Object> userFlairRichtext) {
		this.userFlairRichtext = userFlairRichtext;
	}

	public Data_ withUserFlairRichtext(List<Object> userFlairRichtext) {
		this.userFlairRichtext = userFlairRichtext;
		return this;
	}

	@JsonProperty("videostream_links_count")
	public Integer getVideostreamLinksCount() {
		return videostreamLinksCount;
	}

	@JsonProperty("videostream_links_count")
	public void setVideostreamLinksCount(Integer videostreamLinksCount) {
		this.videostreamLinksCount = videostreamLinksCount;
	}

	public Data_ withVideostreamLinksCount(Integer videostreamLinksCount) {
		this.videostreamLinksCount = videostreamLinksCount;
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

	@JsonProperty("hide_ads")
	public Boolean getHideAds() {
		return hideAds;
	}

	@JsonProperty("hide_ads")
	public void setHideAds(Boolean hideAds) {
		this.hideAds = hideAds;
	}

	public Data_ withHideAds(Boolean hideAds) {
		this.hideAds = hideAds;
		return this;
	}

	@JsonProperty("emojis_enabled")
	public Boolean getEmojisEnabled() {
		return emojisEnabled;
	}

	@JsonProperty("emojis_enabled")
	public void setEmojisEnabled(Boolean emojisEnabled) {
		this.emojisEnabled = emojisEnabled;
	}

	public Data_ withEmojisEnabled(Boolean emojisEnabled) {
		this.emojisEnabled = emojisEnabled;
		return this;
	}

	@JsonProperty("advertiser_category")
	public String getAdvertiserCategory() {
		return advertiserCategory;
	}

	@JsonProperty("advertiser_category")
	public void setAdvertiserCategory(String advertiserCategory) {
		this.advertiserCategory = advertiserCategory;
	}

	public Data_ withAdvertiserCategory(String advertiserCategory) {
		this.advertiserCategory = advertiserCategory;
		return this;
	}

	@JsonProperty("public_description")
	public String getPublicDescription() {
		return publicDescription;
	}

	@JsonProperty("public_description")
	public void setPublicDescription(String publicDescription) {
		this.publicDescription = publicDescription;
	}

	public Data_ withPublicDescription(String publicDescription) {
		this.publicDescription = publicDescription;
		return this;
	}

	@JsonProperty("comment_score_hide_mins")
	public Integer getCommentScoreHideMins() {
		return commentScoreHideMins;
	}

	@JsonProperty("comment_score_hide_mins")
	public void setCommentScoreHideMins(Integer commentScoreHideMins) {
		this.commentScoreHideMins = commentScoreHideMins;
	}

	public Data_ withCommentScoreHideMins(Integer commentScoreHideMins) {
		this.commentScoreHideMins = commentScoreHideMins;
		return this;
	}

	@JsonProperty("user_has_favorited")
	public Boolean getUserHasFavorited() {
		return userHasFavorited;
	}

	@JsonProperty("user_has_favorited")
	public void setUserHasFavorited(Boolean userHasFavorited) {
		this.userHasFavorited = userHasFavorited;
	}

	public Data_ withUserHasFavorited(Boolean userHasFavorited) {
		this.userHasFavorited = userHasFavorited;
		return this;
	}

	@JsonProperty("user_flair_template_id")
	public Object getUserFlairTemplateId() {
		return userFlairTemplateId;
	}

	@JsonProperty("user_flair_template_id")
	public void setUserFlairTemplateId(Object userFlairTemplateId) {
		this.userFlairTemplateId = userFlairTemplateId;
	}

	public Data_ withUserFlairTemplateId(Object userFlairTemplateId) {
		this.userFlairTemplateId = userFlairTemplateId;
		return this;
	}

	@JsonProperty("community_icon")
	public String getCommunityIcon() {
		return communityIcon;
	}

	@JsonProperty("community_icon")
	public void setCommunityIcon(String communityIcon) {
		this.communityIcon = communityIcon;
	}

	public Data_ withCommunityIcon(String communityIcon) {
		this.communityIcon = communityIcon;
		return this;
	}

	@JsonProperty("banner_background_image")
	public String getBannerBackgroundImage() {
		return bannerBackgroundImage;
	}

	@JsonProperty("banner_background_image")
	public void setBannerBackgroundImage(String bannerBackgroundImage) {
		this.bannerBackgroundImage = bannerBackgroundImage;
	}

	public Data_ withBannerBackgroundImage(String bannerBackgroundImage) {
		this.bannerBackgroundImage = bannerBackgroundImage;
		return this;
	}

	@JsonProperty("original_content_tag_enabled")
	public Boolean getOriginalContentTagEnabled() {
		return originalContentTagEnabled;
	}

	@JsonProperty("original_content_tag_enabled")
	public void setOriginalContentTagEnabled(Boolean originalContentTagEnabled) {
		this.originalContentTagEnabled = originalContentTagEnabled;
	}

	public Data_ withOriginalContentTagEnabled(Boolean originalContentTagEnabled) {
		this.originalContentTagEnabled = originalContentTagEnabled;
		return this;
	}

	@JsonProperty("submit_text")
	public String getSubmitText() {
		return submitText;
	}

	@JsonProperty("submit_text")
	public void setSubmitText(String submitText) {
		this.submitText = submitText;
	}

	public Data_ withSubmitText(String submitText) {
		this.submitText = submitText;
		return this;
	}

	@JsonProperty("description_html")
	public String getDescriptionHtml() {
		return descriptionHtml;
	}

	@JsonProperty("description_html")
	public void setDescriptionHtml(String descriptionHtml) {
		this.descriptionHtml = descriptionHtml;
	}

	public Data_ withDescriptionHtml(String descriptionHtml) {
		this.descriptionHtml = descriptionHtml;
		return this;
	}

	@JsonProperty("spoilers_enabled")
	public Boolean getSpoilersEnabled() {
		return spoilersEnabled;
	}

	@JsonProperty("spoilers_enabled")
	public void setSpoilersEnabled(Boolean spoilersEnabled) {
		this.spoilersEnabled = spoilersEnabled;
	}

	public Data_ withSpoilersEnabled(Boolean spoilersEnabled) {
		this.spoilersEnabled = spoilersEnabled;
		return this;
	}

	@JsonProperty("header_title")
	public String getHeaderTitle() {
		return headerTitle;
	}

	@JsonProperty("header_title")
	public void setHeaderTitle(String headerTitle) {
		this.headerTitle = headerTitle;
	}

	public Data_ withHeaderTitle(String headerTitle) {
		this.headerTitle = headerTitle;
		return this;
	}

	@JsonProperty("header_size")
	public List<Integer> getHeaderSize() {
		return headerSize;
	}

	@JsonProperty("header_size")
	public void setHeaderSize(List<Integer> headerSize) {
		this.headerSize = headerSize;
	}

	public Data_ withHeaderSize(List<Integer> headerSize) {
		this.headerSize = headerSize;
		return this;
	}

	@JsonProperty("user_flair_position")
	public String getUserFlairPosition() {
		return userFlairPosition;
	}

	@JsonProperty("user_flair_position")
	public void setUserFlairPosition(String userFlairPosition) {
		this.userFlairPosition = userFlairPosition;
	}

	public Data_ withUserFlairPosition(String userFlairPosition) {
		this.userFlairPosition = userFlairPosition;
		return this;
	}

	@JsonProperty("all_original_content")
	public Boolean getAllOriginalContent() {
		return allOriginalContent;
	}

	@JsonProperty("all_original_content")
	public void setAllOriginalContent(Boolean allOriginalContent) {
		this.allOriginalContent = allOriginalContent;
	}

	public Data_ withAllOriginalContent(Boolean allOriginalContent) {
		this.allOriginalContent = allOriginalContent;
		return this;
	}

	@JsonProperty("has_menu_widget")
	public Boolean getHasMenuWidget() {
		return hasMenuWidget;
	}

	@JsonProperty("has_menu_widget")
	public void setHasMenuWidget(Boolean hasMenuWidget) {
		this.hasMenuWidget = hasMenuWidget;
	}

	public Data_ withHasMenuWidget(Boolean hasMenuWidget) {
		this.hasMenuWidget = hasMenuWidget;
		return this;
	}

	@JsonProperty("is_enrolled_in_new_modmail")
	public Object getIsEnrolledInNewModmail() {
		return isEnrolledInNewModmail;
	}

	@JsonProperty("is_enrolled_in_new_modmail")
	public void setIsEnrolledInNewModmail(Object isEnrolledInNewModmail) {
		this.isEnrolledInNewModmail = isEnrolledInNewModmail;
	}

	public Data_ withIsEnrolledInNewModmail(Object isEnrolledInNewModmail) {
		this.isEnrolledInNewModmail = isEnrolledInNewModmail;
		return this;
	}

	@JsonProperty("key_color")
	public String getKeyColor() {
		return keyColor;
	}

	@JsonProperty("key_color")
	public void setKeyColor(String keyColor) {
		this.keyColor = keyColor;
	}

	public Data_ withKeyColor(String keyColor) {
		this.keyColor = keyColor;
		return this;
	}

	@JsonProperty("can_assign_user_flair")
	public Boolean getCanAssignUserFlair() {
		return canAssignUserFlair;
	}

	@JsonProperty("can_assign_user_flair")
	public void setCanAssignUserFlair(Boolean canAssignUserFlair) {
		this.canAssignUserFlair = canAssignUserFlair;
	}

	public Data_ withCanAssignUserFlair(Boolean canAssignUserFlair) {
		this.canAssignUserFlair = canAssignUserFlair;
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

	@JsonProperty("show_media_preview")
	public Boolean getShowMediaPreview() {
		return showMediaPreview;
	}

	@JsonProperty("show_media_preview")
	public void setShowMediaPreview(Boolean showMediaPreview) {
		this.showMediaPreview = showMediaPreview;
	}

	public Data_ withShowMediaPreview(Boolean showMediaPreview) {
		this.showMediaPreview = showMediaPreview;
		return this;
	}

	@JsonProperty("submission_type")
	public String getSubmissionType() {
		return submissionType;
	}

	@JsonProperty("submission_type")
	public void setSubmissionType(String submissionType) {
		this.submissionType = submissionType;
	}

	public Data_ withSubmissionType(String submissionType) {
		this.submissionType = submissionType;
		return this;
	}

	@JsonProperty("user_is_subscriber")
	public Boolean getUserIsSubscriber() {
		return userIsSubscriber;
	}

	@JsonProperty("user_is_subscriber")
	public void setUserIsSubscriber(Boolean userIsSubscriber) {
		this.userIsSubscriber = userIsSubscriber;
	}

	public Data_ withUserIsSubscriber(Boolean userIsSubscriber) {
		this.userIsSubscriber = userIsSubscriber;
		return this;
	}

	@JsonProperty("disable_contributor_requests")
	public Boolean getDisableContributorRequests() {
		return disableContributorRequests;
	}

	@JsonProperty("disable_contributor_requests")
	public void setDisableContributorRequests(Boolean disableContributorRequests) {
		this.disableContributorRequests = disableContributorRequests;
	}

	public Data_ withDisableContributorRequests(Boolean disableContributorRequests) {
		this.disableContributorRequests = disableContributorRequests;
		return this;
	}

	@JsonProperty("allow_videogifs")
	public Boolean getAllowVideogifs() {
		return allowVideogifs;
	}

	@JsonProperty("allow_videogifs")
	public void setAllowVideogifs(Boolean allowVideogifs) {
		this.allowVideogifs = allowVideogifs;
	}

	public Data_ withAllowVideogifs(Boolean allowVideogifs) {
		this.allowVideogifs = allowVideogifs;
		return this;
	}

	@JsonProperty("user_flair_type")
	public String getUserFlairType() {
		return userFlairType;
	}

	@JsonProperty("user_flair_type")
	public void setUserFlairType(String userFlairType) {
		this.userFlairType = userFlairType;
	}

	public Data_ withUserFlairType(String userFlairType) {
		this.userFlairType = userFlairType;
		return this;
	}

	@JsonProperty("allow_polls")
	public Boolean getAllowPolls() {
		return allowPolls;
	}

	@JsonProperty("allow_polls")
	public void setAllowPolls(Boolean allowPolls) {
		this.allowPolls = allowPolls;
	}

	public Data_ withAllowPolls(Boolean allowPolls) {
		this.allowPolls = allowPolls;
		return this;
	}

	@JsonProperty("collapse_deleted_comments")
	public Boolean getCollapseDeletedComments() {
		return collapseDeletedComments;
	}

	@JsonProperty("collapse_deleted_comments")
	public void setCollapseDeletedComments(Boolean collapseDeletedComments) {
		this.collapseDeletedComments = collapseDeletedComments;
	}

	public Data_ withCollapseDeletedComments(Boolean collapseDeletedComments) {
		this.collapseDeletedComments = collapseDeletedComments;
		return this;
	}

	@JsonProperty("emojis_custom_size")
	public Object getEmojisCustomSize() {
		return emojisCustomSize;
	}

	@JsonProperty("emojis_custom_size")
	public void setEmojisCustomSize(Object emojisCustomSize) {
		this.emojisCustomSize = emojisCustomSize;
	}

	public Data_ withEmojisCustomSize(Object emojisCustomSize) {
		this.emojisCustomSize = emojisCustomSize;
		return this;
	}

	@JsonProperty("public_description_html")
	public String getPublicDescriptionHtml() {
		return publicDescriptionHtml;
	}

	@JsonProperty("public_description_html")
	public void setPublicDescriptionHtml(String publicDescriptionHtml) {
		this.publicDescriptionHtml = publicDescriptionHtml;
	}

	public Data_ withPublicDescriptionHtml(String publicDescriptionHtml) {
		this.publicDescriptionHtml = publicDescriptionHtml;
		return this;
	}

	@JsonProperty("allow_videos")
	public Boolean getAllowVideos() {
		return allowVideos;
	}

	@JsonProperty("allow_videos")
	public void setAllowVideos(Boolean allowVideos) {
		this.allowVideos = allowVideos;
	}

	public Data_ withAllowVideos(Boolean allowVideos) {
		this.allowVideos = allowVideos;
		return this;
	}

	@JsonProperty("is_crosspostable_subreddit")
	public Object getIsCrosspostableSubreddit() {
		return isCrosspostableSubreddit;
	}

	@JsonProperty("is_crosspostable_subreddit")
	public void setIsCrosspostableSubreddit(Object isCrosspostableSubreddit) {
		this.isCrosspostableSubreddit = isCrosspostableSubreddit;
	}

	public Data_ withIsCrosspostableSubreddit(Object isCrosspostableSubreddit) {
		this.isCrosspostableSubreddit = isCrosspostableSubreddit;
		return this;
	}

	@JsonProperty("suggested_comment_sort")
	public Object getSuggestedCommentSort() {
		return suggestedCommentSort;
	}

	@JsonProperty("suggested_comment_sort")
	public void setSuggestedCommentSort(Object suggestedCommentSort) {
		this.suggestedCommentSort = suggestedCommentSort;
	}

	public Data_ withSuggestedCommentSort(Object suggestedCommentSort) {
		this.suggestedCommentSort = suggestedCommentSort;
		return this;
	}

	@JsonProperty("can_assign_link_flair")
	public Boolean getCanAssignLinkFlair() {
		return canAssignLinkFlair;
	}

	@JsonProperty("can_assign_link_flair")
	public void setCanAssignLinkFlair(Boolean canAssignLinkFlair) {
		this.canAssignLinkFlair = canAssignLinkFlair;
	}

	public Data_ withCanAssignLinkFlair(Boolean canAssignLinkFlair) {
		this.canAssignLinkFlair = canAssignLinkFlair;
		return this;
	}

	@JsonProperty("accounts_active_is_fuzzed")
	public Boolean getAccountsActiveIsFuzzed() {
		return accountsActiveIsFuzzed;
	}

	@JsonProperty("accounts_active_is_fuzzed")
	public void setAccountsActiveIsFuzzed(Boolean accountsActiveIsFuzzed) {
		this.accountsActiveIsFuzzed = accountsActiveIsFuzzed;
	}

	public Data_ withAccountsActiveIsFuzzed(Boolean accountsActiveIsFuzzed) {
		this.accountsActiveIsFuzzed = accountsActiveIsFuzzed;
		return this;
	}

	@JsonProperty("submit_text_label")
	public String getSubmitTextLabel() {
		return submitTextLabel;
	}

	@JsonProperty("submit_text_label")
	public void setSubmitTextLabel(String submitTextLabel) {
		this.submitTextLabel = submitTextLabel;
	}

	public Data_ withSubmitTextLabel(String submitTextLabel) {
		this.submitTextLabel = submitTextLabel;
		return this;
	}

	@JsonProperty("link_flair_position")
	public String getLinkFlairPosition() {
		return linkFlairPosition;
	}

	@JsonProperty("link_flair_position")
	public void setLinkFlairPosition(String linkFlairPosition) {
		this.linkFlairPosition = linkFlairPosition;
	}

	public Data_ withLinkFlairPosition(String linkFlairPosition) {
		this.linkFlairPosition = linkFlairPosition;
		return this;
	}

	@JsonProperty("user_sr_flair_enabled")
	public Object getUserSrFlairEnabled() {
		return userSrFlairEnabled;
	}

	@JsonProperty("user_sr_flair_enabled")
	public void setUserSrFlairEnabled(Object userSrFlairEnabled) {
		this.userSrFlairEnabled = userSrFlairEnabled;
	}

	public Data_ withUserSrFlairEnabled(Object userSrFlairEnabled) {
		this.userSrFlairEnabled = userSrFlairEnabled;
		return this;
	}

	@JsonProperty("user_flair_enabled_in_sr")
	public Boolean getUserFlairEnabledInSr() {
		return userFlairEnabledInSr;
	}

	@JsonProperty("user_flair_enabled_in_sr")
	public void setUserFlairEnabledInSr(Boolean userFlairEnabledInSr) {
		this.userFlairEnabledInSr = userFlairEnabledInSr;
	}

	public Data_ withUserFlairEnabledInSr(Boolean userFlairEnabledInSr) {
		this.userFlairEnabledInSr = userFlairEnabledInSr;
		return this;
	}

	@JsonProperty("allow_chat_post_creation")
	public Boolean getAllowChatPostCreation() {
		return allowChatPostCreation;
	}

	@JsonProperty("allow_chat_post_creation")
	public void setAllowChatPostCreation(Boolean allowChatPostCreation) {
		this.allowChatPostCreation = allowChatPostCreation;
	}

	public Data_ withAllowChatPostCreation(Boolean allowChatPostCreation) {
		this.allowChatPostCreation = allowChatPostCreation;
		return this;
	}

	@JsonProperty("allow_discovery")
	public Boolean getAllowDiscovery() {
		return allowDiscovery;
	}

	@JsonProperty("allow_discovery")
	public void setAllowDiscovery(Boolean allowDiscovery) {
		this.allowDiscovery = allowDiscovery;
	}

	public Data_ withAllowDiscovery(Boolean allowDiscovery) {
		this.allowDiscovery = allowDiscovery;
		return this;
	}

	@JsonProperty("user_sr_theme_enabled")
	public Boolean getUserSrThemeEnabled() {
		return userSrThemeEnabled;
	}

	@JsonProperty("user_sr_theme_enabled")
	public void setUserSrThemeEnabled(Boolean userSrThemeEnabled) {
		this.userSrThemeEnabled = userSrThemeEnabled;
	}

	public Data_ withUserSrThemeEnabled(Boolean userSrThemeEnabled) {
		this.userSrThemeEnabled = userSrThemeEnabled;
		return this;
	}

	@JsonProperty("link_flair_enabled")
	public Boolean getLinkFlairEnabled() {
		return linkFlairEnabled;
	}

	@JsonProperty("link_flair_enabled")
	public void setLinkFlairEnabled(Boolean linkFlairEnabled) {
		this.linkFlairEnabled = linkFlairEnabled;
	}

	public Data_ withLinkFlairEnabled(Boolean linkFlairEnabled) {
		this.linkFlairEnabled = linkFlairEnabled;
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

	@JsonProperty("notification_level")
	public Object getNotificationLevel() {
		return notificationLevel;
	}

	@JsonProperty("notification_level")
	public void setNotificationLevel(Object notificationLevel) {
		this.notificationLevel = notificationLevel;
	}

	public Data_ withNotificationLevel(Object notificationLevel) {
		this.notificationLevel = notificationLevel;
		return this;
	}

	@JsonProperty("banner_img")
	public String getBannerImg() {
		return bannerImg;
	}

	@JsonProperty("banner_img")
	public void setBannerImg(String bannerImg) {
		this.bannerImg = bannerImg;
	}

	public Data_ withBannerImg(String bannerImg) {
		this.bannerImg = bannerImg;
		return this;
	}

	@JsonProperty("user_flair_text")
	public Object getUserFlairText() {
		return userFlairText;
	}

	@JsonProperty("user_flair_text")
	public void setUserFlairText(Object userFlairText) {
		this.userFlairText = userFlairText;
	}

	public Data_ withUserFlairText(Object userFlairText) {
		this.userFlairText = userFlairText;
		return this;
	}

	@JsonProperty("banner_background_color")
	public String getBannerBackgroundColor() {
		return bannerBackgroundColor;
	}

	@JsonProperty("banner_background_color")
	public void setBannerBackgroundColor(String bannerBackgroundColor) {
		this.bannerBackgroundColor = bannerBackgroundColor;
	}

	public Data_ withBannerBackgroundColor(String bannerBackgroundColor) {
		this.bannerBackgroundColor = bannerBackgroundColor;
		return this;
	}

	@JsonProperty("show_media")
	public Boolean getShowMedia() {
		return showMedia;
	}

	@JsonProperty("show_media")
	public void setShowMedia(Boolean showMedia) {
		this.showMedia = showMedia;
	}

	public Data_ withShowMedia(Boolean showMedia) {
		this.showMedia = showMedia;
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

	@JsonProperty("user_is_contributor")
	public Boolean getUserIsContributor() {
		return userIsContributor;
	}

	@JsonProperty("user_is_contributor")
	public void setUserIsContributor(Boolean userIsContributor) {
		this.userIsContributor = userIsContributor;
	}

	public Data_ withUserIsContributor(Boolean userIsContributor) {
		this.userIsContributor = userIsContributor;
		return this;
	}

	@JsonProperty("over18")
	public Boolean getOver18() {
		return over18;
	}

	@JsonProperty("over18")
	public void setOver18(Boolean over18) {
		this.over18 = over18;
	}

	public Data_ withOver18(Boolean over18) {
		this.over18 = over18;
		return this;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	public Data_ withDescription(String description) {
		this.description = description;
		return this;
	}

	@JsonProperty("is_chat_post_feature_enabled")
	public Boolean getIsChatPostFeatureEnabled() {
		return isChatPostFeatureEnabled;
	}

	@JsonProperty("is_chat_post_feature_enabled")
	public void setIsChatPostFeatureEnabled(Boolean isChatPostFeatureEnabled) {
		this.isChatPostFeatureEnabled = isChatPostFeatureEnabled;
	}

	public Data_ withIsChatPostFeatureEnabled(Boolean isChatPostFeatureEnabled) {
		this.isChatPostFeatureEnabled = isChatPostFeatureEnabled;
		return this;
	}

	@JsonProperty("submit_link_label")
	public String getSubmitLinkLabel() {
		return submitLinkLabel;
	}

	@JsonProperty("submit_link_label")
	public void setSubmitLinkLabel(String submitLinkLabel) {
		this.submitLinkLabel = submitLinkLabel;
	}

	public Data_ withSubmitLinkLabel(String submitLinkLabel) {
		this.submitLinkLabel = submitLinkLabel;
		return this;
	}

	@JsonProperty("user_flair_text_color")
	public Object getUserFlairTextColor() {
		return userFlairTextColor;
	}

	@JsonProperty("user_flair_text_color")
	public void setUserFlairTextColor(Object userFlairTextColor) {
		this.userFlairTextColor = userFlairTextColor;
	}

	public Data_ withUserFlairTextColor(Object userFlairTextColor) {
		this.userFlairTextColor = userFlairTextColor;
		return this;
	}

	@JsonProperty("restrict_commenting")
	public Boolean getRestrictCommenting() {
		return restrictCommenting;
	}

	@JsonProperty("restrict_commenting")
	public void setRestrictCommenting(Boolean restrictCommenting) {
		this.restrictCommenting = restrictCommenting;
	}

	public Data_ withRestrictCommenting(Boolean restrictCommenting) {
		this.restrictCommenting = restrictCommenting;
		return this;
	}

	@JsonProperty("user_flair_css_class")
	public Object getUserFlairCssClass() {
		return userFlairCssClass;
	}

	@JsonProperty("user_flair_css_class")
	public void setUserFlairCssClass(Object userFlairCssClass) {
		this.userFlairCssClass = userFlairCssClass;
	}

	public Data_ withUserFlairCssClass(Object userFlairCssClass) {
		this.userFlairCssClass = userFlairCssClass;
		return this;
	}

	@JsonProperty("allow_images")
	public Boolean getAllowImages() {
		return allowImages;
	}

	@JsonProperty("allow_images")
	public void setAllowImages(Boolean allowImages) {
		this.allowImages = allowImages;
	}

	public Data_ withAllowImages(Boolean allowImages) {
		this.allowImages = allowImages;
		return this;
	}

	@JsonProperty("lang")
	public String getLang() {
		return lang;
	}

	@JsonProperty("lang")
	public void setLang(String lang) {
		this.lang = lang;
	}

	public Data_ withLang(String lang) {
		this.lang = lang;
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

	@JsonProperty("banner_size")
	public Object getBannerSize() {
		return bannerSize;
	}

	@JsonProperty("banner_size")
	public void setBannerSize(Object bannerSize) {
		this.bannerSize = bannerSize;
	}

	public Data_ withBannerSize(Object bannerSize) {
		this.bannerSize = bannerSize;
		return this;
	}

	@JsonProperty("mobile_banner_image")
	public String getMobileBannerImage() {
		return mobileBannerImage;
	}

	@JsonProperty("mobile_banner_image")
	public void setMobileBannerImage(String mobileBannerImage) {
		this.mobileBannerImage = mobileBannerImage;
	}

	public Data_ withMobileBannerImage(String mobileBannerImage) {
		this.mobileBannerImage = mobileBannerImage;
		return this;
	}

	@JsonProperty("user_is_moderator")
	public Boolean getUserIsModerator() {
		return userIsModerator;
	}

	@JsonProperty("user_is_moderator")
	public void setUserIsModerator(Boolean userIsModerator) {
		this.userIsModerator = userIsModerator;
	}

	public Data_ withUserIsModerator(Boolean userIsModerator) {
		this.userIsModerator = userIsModerator;
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
