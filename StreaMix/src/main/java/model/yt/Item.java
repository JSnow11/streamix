
package model.yt;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "kind", "etag", "id", "snippet" })
public class Item {

	@JsonProperty("kind")
	private String kind;
	@JsonProperty("etag")
	private String etag;
	@JsonProperty("id")
	private Id id;
	@JsonProperty("snippet")
	private Snippet snippet;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("kind")
	public String getKind() {
		return kind;
	}

	@JsonProperty("kind")
	public void setKind(String kind) {
		this.kind = kind;
	}

	@JsonProperty("etag")
	public String getEtag() {
		return etag;
	}

	@JsonProperty("etag")
	public void setEtag(String etag) {
		this.etag = etag;
	}

	@JsonProperty("id")
	public Id getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(Id id) {
		this.id = id;
	}

	@JsonProperty("snippet")
	public Snippet getSnippet() {
		return snippet;
	}

	@JsonProperty("snippet")
	public void setSnippet(Snippet snippet) {
		this.snippet = snippet;
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
