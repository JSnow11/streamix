
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
@JsonPropertyOrder({ "url", "author_name", "author_url", "html", "width", "height", "type", "cache_age",
		"provider_name", "provider_url", "version" })
public class Embeed {

	@JsonProperty("url")
	private String url;
	@JsonProperty("author_name")
	private String authorName;
	@JsonProperty("author_url")
	private String authorUrl;
	@JsonProperty("html")
	private String html;
	@JsonProperty("width")
	private Integer width;
	@JsonProperty("height")
	private Object height;
	@JsonProperty("type")
	private String type;
	@JsonProperty("cache_age")
	private String cacheAge;
	@JsonProperty("provider_name")
	private String providerName;
	@JsonProperty("provider_url")
	private String providerUrl;
	@JsonProperty("version")
	private String version;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("url")
	public String getUrl() {
		return url;
	}

	@JsonProperty("url")
	public void setUrl(String url) {
		this.url = url;
	}

	public Embeed withUrl(String url) {
		this.url = url;
		return this;
	}

	@JsonProperty("author_name")
	public String getAuthorName() {
		return authorName;
	}

	@JsonProperty("author_name")
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public Embeed withAuthorName(String authorName) {
		this.authorName = authorName;
		return this;
	}

	@JsonProperty("author_url")
	public String getAuthorUrl() {
		return authorUrl;
	}

	@JsonProperty("author_url")
	public void setAuthorUrl(String authorUrl) {
		this.authorUrl = authorUrl;
	}

	public Embeed withAuthorUrl(String authorUrl) {
		this.authorUrl = authorUrl;
		return this;
	}

	@JsonProperty("html")
	public String getHtml() {
		return html;
	}

	@JsonProperty("html")
	public void setHtml(String html) {
		this.html = html;
	}

	public Embeed withHtml(String html) {
		this.html = html;
		return this;
	}

	@JsonProperty("width")
	public Integer getWidth() {
		return width;
	}

	@JsonProperty("width")
	public void setWidth(Integer width) {
		this.width = width;
	}

	public Embeed withWidth(Integer width) {
		this.width = width;
		return this;
	}

	@JsonProperty("height")
	public Object getHeight() {
		return height;
	}

	@JsonProperty("height")
	public void setHeight(Object height) {
		this.height = height;
	}

	public Embeed withHeight(Object height) {
		this.height = height;
		return this;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}

	public Embeed withType(String type) {
		this.type = type;
		return this;
	}

	@JsonProperty("cache_age")
	public String getCacheAge() {
		return cacheAge;
	}

	@JsonProperty("cache_age")
	public void setCacheAge(String cacheAge) {
		this.cacheAge = cacheAge;
	}

	public Embeed withCacheAge(String cacheAge) {
		this.cacheAge = cacheAge;
		return this;
	}

	@JsonProperty("provider_name")
	public String getProviderName() {
		return providerName;
	}

	@JsonProperty("provider_name")
	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public Embeed withProviderName(String providerName) {
		this.providerName = providerName;
		return this;
	}

	@JsonProperty("provider_url")
	public String getProviderUrl() {
		return providerUrl;
	}

	@JsonProperty("provider_url")
	public void setProviderUrl(String providerUrl) {
		this.providerUrl = providerUrl;
	}

	public Embeed withProviderUrl(String providerUrl) {
		this.providerUrl = providerUrl;
		return this;
	}

	@JsonProperty("version")
	public String getVersion() {
		return version;
	}

	@JsonProperty("version")
	public void setVersion(String version) {
		this.version = version;
	}

	public Embeed withVersion(String version) {
		this.version = version;
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

	public Embeed withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}
