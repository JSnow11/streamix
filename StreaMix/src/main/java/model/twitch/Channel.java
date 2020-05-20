
package model.twitch;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "_id", "broadcaster_language", "created_at", "display_name", "followers", "game", "language",
		"logo", "mature", "name", "partner", "profile_banner", "profile_banner_background_color", "status",
		"updated_at", "url", "video_banner", "views" })
public class Channel {

	@JsonProperty("_id")
	private Integer id;
	@JsonProperty("broadcaster_language")
	private String broadcasterLanguage;
	@JsonProperty("created_at")
	private String createdAt;
	@JsonProperty("display_name")
	private String displayName;
	@JsonProperty("followers")
	private Integer followers;
	@JsonProperty("game")
	private String game;
	@JsonProperty("language")
	private String language;
	@JsonProperty("logo")
	private String logo;
	@JsonProperty("mature")
	private Boolean mature;
	@JsonProperty("name")
	private String name;
	@JsonProperty("partner")
	private Boolean partner;
	@JsonProperty("profile_banner")
	private String profileBanner;
	@JsonProperty("profile_banner_background_color")
	private Object profileBannerBackgroundColor;
	@JsonProperty("status")
	private String status;
	@JsonProperty("updated_at")
	private String updatedAt;
	@JsonProperty("url")
	private String url;
	@JsonProperty("video_banner")
	private String videoBanner;
	@JsonProperty("views")
	private Integer views;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("_id")
	public Integer getId() {
		return id;
	}

	@JsonProperty("_id")
	public void setId(Integer id) {
		this.id = id;
	}

	public Channel withId(Integer id) {
		this.id = id;
		return this;
	}

	@JsonProperty("broadcaster_language")
	public String getBroadcasterLanguage() {
		return broadcasterLanguage;
	}

	@JsonProperty("broadcaster_language")
	public void setBroadcasterLanguage(String broadcasterLanguage) {
		this.broadcasterLanguage = broadcasterLanguage;
	}

	public Channel withBroadcasterLanguage(String broadcasterLanguage) {
		this.broadcasterLanguage = broadcasterLanguage;
		return this;
	}

	@JsonProperty("created_at")
	public String getCreatedAt() {
		return createdAt;
	}

	@JsonProperty("created_at")
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public Channel withCreatedAt(String createdAt) {
		this.createdAt = createdAt;
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

	public Channel withDisplayName(String displayName) {
		this.displayName = displayName;
		return this;
	}

	@JsonProperty("followers")
	public Integer getFollowers() {
		return followers;
	}

	@JsonProperty("followers")
	public void setFollowers(Integer followers) {
		this.followers = followers;
	}

	public Channel withFollowers(Integer followers) {
		this.followers = followers;
		return this;
	}

	@JsonProperty("game")
	public String getGame() {
		return game;
	}

	@JsonProperty("game")
	public void setGame(String game) {
		this.game = game;
	}

	public Channel withGame(String game) {
		this.game = game;
		return this;
	}

	@JsonProperty("language")
	public String getLanguage() {
		return language;
	}

	@JsonProperty("language")
	public void setLanguage(String language) {
		this.language = language;
	}

	public Channel withLanguage(String language) {
		this.language = language;
		return this;
	}

	@JsonProperty("logo")
	public String getLogo() {
		return logo;
	}

	@JsonProperty("logo")
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public Channel withLogo(String logo) {
		this.logo = logo;
		return this;
	}

	@JsonProperty("mature")
	public Boolean getMature() {
		return mature;
	}

	@JsonProperty("mature")
	public void setMature(Boolean mature) {
		this.mature = mature;
	}

	public Channel withMature(Boolean mature) {
		this.mature = mature;
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

	public Channel withName(String name) {
		this.name = name;
		return this;
	}

	@JsonProperty("partner")
	public Boolean getPartner() {
		return partner;
	}

	@JsonProperty("partner")
	public void setPartner(Boolean partner) {
		this.partner = partner;
	}

	public Channel withPartner(Boolean partner) {
		this.partner = partner;
		return this;
	}

	@JsonProperty("profile_banner")
	public String getProfileBanner() {
		return profileBanner;
	}

	@JsonProperty("profile_banner")
	public void setProfileBanner(String profileBanner) {
		this.profileBanner = profileBanner;
	}

	public Channel withProfileBanner(String profileBanner) {
		this.profileBanner = profileBanner;
		return this;
	}

	@JsonProperty("profile_banner_background_color")
	public Object getProfileBannerBackgroundColor() {
		return profileBannerBackgroundColor;
	}

	@JsonProperty("profile_banner_background_color")
	public void setProfileBannerBackgroundColor(Object profileBannerBackgroundColor) {
		this.profileBannerBackgroundColor = profileBannerBackgroundColor;
	}

	public Channel withProfileBannerBackgroundColor(Object profileBannerBackgroundColor) {
		this.profileBannerBackgroundColor = profileBannerBackgroundColor;
		return this;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(String status) {
		this.status = status;
	}

	public Channel withStatus(String status) {
		this.status = status;
		return this;
	}

	@JsonProperty("updated_at")
	public String getUpdatedAt() {
		return updatedAt;
	}

	@JsonProperty("updated_at")
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Channel withUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
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

	public Channel withUrl(String url) {
		this.url = url;
		return this;
	}

	@JsonProperty("video_banner")
	public String getVideoBanner() {
		return videoBanner;
	}

	@JsonProperty("video_banner")
	public void setVideoBanner(String videoBanner) {
		this.videoBanner = videoBanner;
	}

	public Channel withVideoBanner(String videoBanner) {
		this.videoBanner = videoBanner;
		return this;
	}

	@JsonProperty("views")
	public Integer getViews() {
		return views;
	}

	@JsonProperty("views")
	public void setViews(Integer views) {
		this.views = views;
	}

	public Channel withViews(Integer views) {
		this.views = views;
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

	public Channel withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}
