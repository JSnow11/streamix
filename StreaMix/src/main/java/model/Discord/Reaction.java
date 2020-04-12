
package model.Discord;

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
    "count",
    "me",
    "emoji"
})
public class Reaction {

    @JsonProperty("count")
    private Integer count;
    @JsonProperty("me")
    private Boolean me;
    @JsonProperty("emoji")
    private Emoji emoji;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    @JsonProperty("me")
    public Boolean getMe() {
        return me;
    }

    @JsonProperty("me")
    public void setMe(Boolean me) {
        this.me = me;
    }

    @JsonProperty("emoji")
    public Emoji getEmoji() {
        return emoji;
    }

    @JsonProperty("emoji")
    public void setEmoji(Emoji emoji) {
        this.emoji = emoji;
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
