
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
@JsonPropertyOrder({ "kind", "videoId", "channelId" })
public class Id {

	@JsonProperty("kind")
	private String kind;
	@JsonProperty("videoId")
	private String videoId;
	@JsonProperty("channelId")
	private String channelId;
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

	@JsonProperty("videoId")
	public String getVideoId() {
		return videoId;
	}

	@JsonProperty("videoId")
	public void setVideoId(String videoId) {
		this.videoId = videoId;
	}

	@JsonProperty("channelId")
	public String getChannelId() {
		return channelId;
	}

	@JsonProperty("channelId")
	public void setChannelId(String channelId) {
		this.channelId = channelId;
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
