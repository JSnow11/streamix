
package model.twitch;

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
@JsonPropertyOrder({ "data", "pagination" })
public class Streams {

	@JsonProperty("data")
	private List<DatumS> data = null;
	@JsonProperty("pagination")
	private Pagination pagination;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("data")
	public List<DatumS> getData() {
		return data;
	}

	@JsonProperty("data")
	public void setData(List<DatumS> data) {
		this.data = data;
	}

	public Streams withData(List<DatumS> data) {
		this.data = data;
		return this;
	}

	@JsonProperty("pagination")
	public Pagination getPagination() {
		return pagination;
	}

	@JsonProperty("pagination")
	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}

	public Streams withPagination(Pagination pagination) {
		this.pagination = pagination;
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

	public Streams withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}
