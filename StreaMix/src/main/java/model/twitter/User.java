
package model.twitter;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "id_str", "name", "screen_name", "location", "description", "url", "entities", "protected",
		"followers_count", "friends_count", "listed_count", "created_at", "favourites_count", "utc_offset", "time_zone",
		"geo_enabled", "verified", "statuses_count", "lang", "contributors_enabled", "is_translator",
		"is_translation_enabled", "profile_background_color", "profile_background_image_url",
		"profile_background_image_url_https", "profile_background_tile", "profile_image_url", "profile_image_url_https",
		"profile_banner_url", "profile_link_color", "profile_sidebar_border_color", "profile_sidebar_fill_color",
		"profile_text_color", "profile_use_background_image", "has_extended_profile", "default_profile",
		"default_profile_image", "following", "follow_request_sent", "notifications", "translator_type" })
public class User {

	@JsonProperty("id")
	private Integer id;
	@JsonProperty("id_str")
	private String idStr;
	@JsonProperty("name")
	private String name;
	@JsonProperty("screen_name")
	private String screenName;
	@JsonProperty("location")
	private String location;
	@JsonProperty("description")
	private String description;
	@JsonProperty("url")
	private Object url;
	@JsonProperty("entities")
	private Entities_ entities;
	@JsonProperty("protected")
	private Boolean _protected;
	@JsonProperty("followers_count")
	private Integer followersCount;
	@JsonProperty("friends_count")
	private Integer friendsCount;
	@JsonProperty("listed_count")
	private Integer listedCount;
	@JsonProperty("created_at")
	private String createdAt;
	@JsonProperty("favourites_count")
	private Integer favouritesCount;
	@JsonProperty("utc_offset")
	private Object utcOffset;
	@JsonProperty("time_zone")
	private Object timeZone;
	@JsonProperty("geo_enabled")
	private Boolean geoEnabled;
	@JsonProperty("verified")
	private Boolean verified;
	@JsonProperty("statuses_count")
	private Integer statusesCount;
	@JsonProperty("lang")
	private Object lang;
	@JsonProperty("contributors_enabled")
	private Boolean contributorsEnabled;
	@JsonProperty("is_translator")
	private Boolean isTranslator;
	@JsonProperty("is_translation_enabled")
	private Boolean isTranslationEnabled;
	@JsonProperty("profile_background_color")
	private String profileBackgroundColor;
	@JsonProperty("profile_background_image_url")
	private String profileBackgroundImageUrl;
	@JsonProperty("profile_background_image_url_https")
	private String profileBackgroundImageUrlHttps;
	@JsonProperty("profile_background_tile")
	private Boolean profileBackgroundTile;
	@JsonProperty("profile_image_url")
	private String profileImageUrl;
	@JsonProperty("profile_image_url_https")
	private String profileImageUrlHttps;
	@JsonProperty("profile_banner_url")
	private String profileBannerUrl;
	@JsonProperty("profile_link_color")
	private String profileLinkColor;
	@JsonProperty("profile_sidebar_border_color")
	private String profileSidebarBorderColor;
	@JsonProperty("profile_sidebar_fill_color")
	private String profileSidebarFillColor;
	@JsonProperty("profile_text_color")
	private String profileTextColor;
	@JsonProperty("profile_use_background_image")
	private Boolean profileUseBackgroundImage;
	@JsonProperty("has_extended_profile")
	private Boolean hasExtendedProfile;
	@JsonProperty("default_profile")
	private Boolean defaultProfile;
	@JsonProperty("default_profile_image")
	private Boolean defaultProfileImage;
	@JsonProperty("following")
	private Object following;
	@JsonProperty("follow_request_sent")
	private Object followRequestSent;
	@JsonProperty("notifications")
	private Object notifications;
	@JsonProperty("translator_type")
	private String translatorType;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(Integer id) {
		this.id = id;
	}

	@JsonProperty("id_str")
	public String getIdStr() {
		return idStr;
	}

	@JsonProperty("id_str")
	public void setIdStr(String idStr) {
		this.idStr = idStr;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("screen_name")
	public String getScreenName() {
		return screenName;
	}

	@JsonProperty("screen_name")
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	@JsonProperty("location")
	public String getLocation() {
		return location;
	}

	@JsonProperty("location")
	public void setLocation(String location) {
		this.location = location;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("url")
	public Object getUrl() {
		return url;
	}

	@JsonProperty("url")
	public void setUrl(Object url) {
		this.url = url;
	}

	@JsonProperty("entities")
	public Entities_ getEntities() {
		return entities;
	}

	@JsonProperty("entities")
	public void setEntities(Entities_ entities) {
		this.entities = entities;
	}

	@JsonProperty("protected")
	public Boolean getProtected() {
		return _protected;
	}

	@JsonProperty("protected")
	public void setProtected(Boolean _protected) {
		this._protected = _protected;
	}

	@JsonProperty("followers_count")
	public Integer getFollowersCount() {
		return followersCount;
	}

	@JsonProperty("followers_count")
	public void setFollowersCount(Integer followersCount) {
		this.followersCount = followersCount;
	}

	@JsonProperty("friends_count")
	public Integer getFriendsCount() {
		return friendsCount;
	}

	@JsonProperty("friends_count")
	public void setFriendsCount(Integer friendsCount) {
		this.friendsCount = friendsCount;
	}

	@JsonProperty("listed_count")
	public Integer getListedCount() {
		return listedCount;
	}

	@JsonProperty("listed_count")
	public void setListedCount(Integer listedCount) {
		this.listedCount = listedCount;
	}

	@JsonProperty("created_at")
	public String getCreatedAt() {
		return createdAt;
	}

	@JsonProperty("created_at")
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	@JsonProperty("favourites_count")
	public Integer getFavouritesCount() {
		return favouritesCount;
	}

	@JsonProperty("favourites_count")
	public void setFavouritesCount(Integer favouritesCount) {
		this.favouritesCount = favouritesCount;
	}

	@JsonProperty("utc_offset")
	public Object getUtcOffset() {
		return utcOffset;
	}

	@JsonProperty("utc_offset")
	public void setUtcOffset(Object utcOffset) {
		this.utcOffset = utcOffset;
	}

	@JsonProperty("time_zone")
	public Object getTimeZone() {
		return timeZone;
	}

	@JsonProperty("time_zone")
	public void setTimeZone(Object timeZone) {
		this.timeZone = timeZone;
	}

	@JsonProperty("geo_enabled")
	public Boolean getGeoEnabled() {
		return geoEnabled;
	}

	@JsonProperty("geo_enabled")
	public void setGeoEnabled(Boolean geoEnabled) {
		this.geoEnabled = geoEnabled;
	}

	@JsonProperty("verified")
	public Boolean getVerified() {
		return verified;
	}

	@JsonProperty("verified")
	public void setVerified(Boolean verified) {
		this.verified = verified;
	}

	@JsonProperty("statuses_count")
	public Integer getStatusesCount() {
		return statusesCount;
	}

	@JsonProperty("statuses_count")
	public void setStatusesCount(Integer statusesCount) {
		this.statusesCount = statusesCount;
	}

	@JsonProperty("lang")
	public Object getLang() {
		return lang;
	}

	@JsonProperty("lang")
	public void setLang(Object lang) {
		this.lang = lang;
	}

	@JsonProperty("contributors_enabled")
	public Boolean getContributorsEnabled() {
		return contributorsEnabled;
	}

	@JsonProperty("contributors_enabled")
	public void setContributorsEnabled(Boolean contributorsEnabled) {
		this.contributorsEnabled = contributorsEnabled;
	}

	@JsonProperty("is_translator")
	public Boolean getIsTranslator() {
		return isTranslator;
	}

	@JsonProperty("is_translator")
	public void setIsTranslator(Boolean isTranslator) {
		this.isTranslator = isTranslator;
	}

	@JsonProperty("is_translation_enabled")
	public Boolean getIsTranslationEnabled() {
		return isTranslationEnabled;
	}

	@JsonProperty("is_translation_enabled")
	public void setIsTranslationEnabled(Boolean isTranslationEnabled) {
		this.isTranslationEnabled = isTranslationEnabled;
	}

	@JsonProperty("profile_background_color")
	public String getProfileBackgroundColor() {
		return profileBackgroundColor;
	}

	@JsonProperty("profile_background_color")
	public void setProfileBackgroundColor(String profileBackgroundColor) {
		this.profileBackgroundColor = profileBackgroundColor;
	}

	@JsonProperty("profile_background_image_url")
	public String getProfileBackgroundImageUrl() {
		return profileBackgroundImageUrl;
	}

	@JsonProperty("profile_background_image_url")
	public void setProfileBackgroundImageUrl(String profileBackgroundImageUrl) {
		this.profileBackgroundImageUrl = profileBackgroundImageUrl;
	}

	@JsonProperty("profile_background_image_url_https")
	public String getProfileBackgroundImageUrlHttps() {
		return profileBackgroundImageUrlHttps;
	}

	@JsonProperty("profile_background_image_url_https")
	public void setProfileBackgroundImageUrlHttps(String profileBackgroundImageUrlHttps) {
		this.profileBackgroundImageUrlHttps = profileBackgroundImageUrlHttps;
	}

	@JsonProperty("profile_background_tile")
	public Boolean getProfileBackgroundTile() {
		return profileBackgroundTile;
	}

	@JsonProperty("profile_background_tile")
	public void setProfileBackgroundTile(Boolean profileBackgroundTile) {
		this.profileBackgroundTile = profileBackgroundTile;
	}

	@JsonProperty("profile_image_url")
	public String getProfileImageUrl() {
		return profileImageUrl;
	}

	@JsonProperty("profile_image_url")
	public void setProfileImageUrl(String profileImageUrl) {
		this.profileImageUrl = profileImageUrl;
	}

	@JsonProperty("profile_image_url_https")
	public String getProfileImageUrlHttps() {
		return profileImageUrlHttps;
	}

	@JsonProperty("profile_image_url_https")
	public void setProfileImageUrlHttps(String profileImageUrlHttps) {
		this.profileImageUrlHttps = profileImageUrlHttps;
	}

	@JsonProperty("profile_banner_url")
	public String getProfileBannerUrl() {
		return profileBannerUrl;
	}

	@JsonProperty("profile_banner_url")
	public void setProfileBannerUrl(String profileBannerUrl) {
		this.profileBannerUrl = profileBannerUrl;
	}

	@JsonProperty("profile_link_color")
	public String getProfileLinkColor() {
		return profileLinkColor;
	}

	@JsonProperty("profile_link_color")
	public void setProfileLinkColor(String profileLinkColor) {
		this.profileLinkColor = profileLinkColor;
	}

	@JsonProperty("profile_sidebar_border_color")
	public String getProfileSidebarBorderColor() {
		return profileSidebarBorderColor;
	}

	@JsonProperty("profile_sidebar_border_color")
	public void setProfileSidebarBorderColor(String profileSidebarBorderColor) {
		this.profileSidebarBorderColor = profileSidebarBorderColor;
	}

	@JsonProperty("profile_sidebar_fill_color")
	public String getProfileSidebarFillColor() {
		return profileSidebarFillColor;
	}

	@JsonProperty("profile_sidebar_fill_color")
	public void setProfileSidebarFillColor(String profileSidebarFillColor) {
		this.profileSidebarFillColor = profileSidebarFillColor;
	}

	@JsonProperty("profile_text_color")
	public String getProfileTextColor() {
		return profileTextColor;
	}

	@JsonProperty("profile_text_color")
	public void setProfileTextColor(String profileTextColor) {
		this.profileTextColor = profileTextColor;
	}

	@JsonProperty("profile_use_background_image")
	public Boolean getProfileUseBackgroundImage() {
		return profileUseBackgroundImage;
	}

	@JsonProperty("profile_use_background_image")
	public void setProfileUseBackgroundImage(Boolean profileUseBackgroundImage) {
		this.profileUseBackgroundImage = profileUseBackgroundImage;
	}

	@JsonProperty("has_extended_profile")
	public Boolean getHasExtendedProfile() {
		return hasExtendedProfile;
	}

	@JsonProperty("has_extended_profile")
	public void setHasExtendedProfile(Boolean hasExtendedProfile) {
		this.hasExtendedProfile = hasExtendedProfile;
	}

	@JsonProperty("default_profile")
	public Boolean getDefaultProfile() {
		return defaultProfile;
	}

	@JsonProperty("default_profile")
	public void setDefaultProfile(Boolean defaultProfile) {
		this.defaultProfile = defaultProfile;
	}

	@JsonProperty("default_profile_image")
	public Boolean getDefaultProfileImage() {
		return defaultProfileImage;
	}

	@JsonProperty("default_profile_image")
	public void setDefaultProfileImage(Boolean defaultProfileImage) {
		this.defaultProfileImage = defaultProfileImage;
	}

	@JsonProperty("following")
	public Object getFollowing() {
		return following;
	}

	@JsonProperty("following")
	public void setFollowing(Object following) {
		this.following = following;
	}

	@JsonProperty("follow_request_sent")
	public Object getFollowRequestSent() {
		return followRequestSent;
	}

	@JsonProperty("follow_request_sent")
	public void setFollowRequestSent(Object followRequestSent) {
		this.followRequestSent = followRequestSent;
	}

	@JsonProperty("notifications")
	public Object getNotifications() {
		return notifications;
	}

	@JsonProperty("notifications")
	public void setNotifications(Object notifications) {
		this.notifications = notifications;
	}

	@JsonProperty("translator_type")
	public String getTranslatorType() {
		return translatorType;
	}

	@JsonProperty("translator_type")
	public void setTranslatorType(String translatorType) {
		this.translatorType = translatorType;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
