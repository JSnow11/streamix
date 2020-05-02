
package model.reddit;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "provider_url",
    "version",
    "author_url",
    "title",
    "provider_name",
    "type",
    "html",
    "author_name"
})
public class REmbeed {

    @JsonProperty("provider_url")
    private String providerUrl;
    @JsonProperty("version")
    private String version;
    @JsonProperty("author_url")
    private String authorUrl;
    @JsonProperty("title")
    private String title;
    @JsonProperty("provider_name")
    private String providerName;
    @JsonProperty("type")
    private String type;
    @JsonProperty("html")
    private String html;
    @JsonProperty("author_name")
    private String authorName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("provider_url")
    public String getProviderUrl() {
        return providerUrl;
    }

    @JsonProperty("provider_url")
    public void setProviderUrl(String providerUrl) {
        this.providerUrl = providerUrl;
    }

    public REmbeed withProviderUrl(String providerUrl) {
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

    public REmbeed withVersion(String version) {
        this.version = version;
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

    public REmbeed withAuthorUrl(String authorUrl) {
        this.authorUrl = authorUrl;
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

    public REmbeed withTitle(String title) {
        this.title = title;
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

    public REmbeed withProviderName(String providerName) {
        this.providerName = providerName;
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

    public REmbeed withType(String type) {
        this.type = type;
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

    public REmbeed withHtml(String html) {
        this.html = html;
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

    public REmbeed withAuthorName(String authorName) {
        this.authorName = authorName;
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

    public REmbeed withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
