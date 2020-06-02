
package model.twitter;

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
@JsonPropertyOrder({ "hashtags", "symbols", "user_mentions", "urls" })
public class Entities {

	@JsonProperty("hashtags")
	private List<Object> hashtags = null;
	@JsonProperty("symbols")
	private List<Object> symbols = null;
	@JsonProperty("user_mentions")
	private List<UserMention> userMentions = null;
	@JsonProperty("urls")
	private List<Url> urls = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("hashtags")
	public List<Object> getHashtags() {
		return hashtags;
	}

	@JsonProperty("hashtags")
	public void setHashtags(List<Object> hashtags) {
		this.hashtags = hashtags;
	}

	@JsonProperty("symbols")
	public List<Object> getSymbols() {
		return symbols;
	}

	@JsonProperty("symbols")
	public void setSymbols(List<Object> symbols) {
		this.symbols = symbols;
	}

	@JsonProperty("user_mentions")
	public List<UserMention> getUserMentions() {
		return userMentions;
	}

	@JsonProperty("user_mentions")
	public void setUserMentions(List<UserMention> userMentions) {
		this.userMentions = userMentions;
	}

	@JsonProperty("urls")
	public List<Url> getUrls() {
		return urls;
	}

	@JsonProperty("urls")
	public void setUrls(List<Url> urls) {
		this.urls = urls;
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
