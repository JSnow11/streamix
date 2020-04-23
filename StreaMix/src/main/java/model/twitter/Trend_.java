
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
@JsonPropertyOrder({
    "name",
    "url",
    "promoted_content",
    "query",
    "tweet_volume"
})
public class Trend_ {

    @JsonProperty("name")
    private String name;
    @JsonProperty("url")
    private String url;
    @JsonProperty("promoted_content")
    private Object promotedContent;
    @JsonProperty("query")
    private String query;
    @JsonProperty("tweet_volume")
    private Integer tweetVolume;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Trend_ withName(String name) {
        this.name = name;
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

    public Trend_ withUrl(String url) {
        this.url = url;
        return this;
    }

    @JsonProperty("promoted_content")
    public Object getPromotedContent() {
        return promotedContent;
    }

    @JsonProperty("promoted_content")
    public void setPromotedContent(Object promotedContent) {
        this.promotedContent = promotedContent;
    }

    public Trend_ withPromotedContent(Object promotedContent) {
        this.promotedContent = promotedContent;
        return this;
    }

    @JsonProperty("query")
    public String getQuery() {
        return query;
    }

    @JsonProperty("query")
    public void setQuery(String query) {
        this.query = query;
    }

    public Trend_ withQuery(String query) {
        this.query = query;
        return this;
    }

    @JsonProperty("tweet_volume")
    public Integer getTweetVolume() {
        return tweetVolume;
    }

    @JsonProperty("tweet_volume")
    public void setTweetVolume(Integer tweetVolume) {
        this.tweetVolume = tweetVolume;
    }

    public Trend_ withTweetVolume(Integer tweetVolume) {
        this.tweetVolume = tweetVolume;
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

    public Trend_ withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
