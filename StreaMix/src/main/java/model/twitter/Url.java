
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
@JsonPropertyOrder({ "url", "expanded_url", "display_url", "indices" })
public class Url {

	@JsonProperty("url")
	private String url;
	@JsonProperty("expanded_url")
	private String expandedUrl;
	@JsonProperty("display_url")
	private String displayUrl;
	@JsonProperty("indices")
	private List<Integer> indices = null;
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

	@JsonProperty("expanded_url")
	public String getExpandedUrl() {
		return expandedUrl;
	}

	@JsonProperty("expanded_url")
	public void setExpandedUrl(String expandedUrl) {
		this.expandedUrl = expandedUrl;
	}

	@JsonProperty("display_url")
	public String getDisplayUrl() {
		return displayUrl;
	}

	@JsonProperty("display_url")
	public void setDisplayUrl(String displayUrl) {
		this.displayUrl = displayUrl;
	}

	@JsonProperty("indices")
	public List<Integer> getIndices() {
		return indices;
	}

	@JsonProperty("indices")
	public void setIndices(List<Integer> indices) {
		this.indices = indices;
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
