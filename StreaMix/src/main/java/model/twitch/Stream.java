
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
@JsonPropertyOrder({
    "_id",
    "average_fps",
    "channel",
    "created_at",
    "delay",
    "game",
    "is_playlist",
    "preview",
    "video_height",
    "viewers"
})
public class Stream {

    @JsonProperty("_id")
    private Integer id;
    @JsonProperty("average_fps")
    private Double averageFps;
    @JsonProperty("channel")
    private Channel channel;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("delay")
    private Integer delay;
    @JsonProperty("game")
    private String game;
    @JsonProperty("is_playlist")
    private Boolean isPlaylist;
    @JsonProperty("preview")
    private Preview preview;
    @JsonProperty("video_height")
    private Integer videoHeight;
    @JsonProperty("viewers")
    private Integer viewers;
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

    @JsonProperty("average_fps")
    public Double getAverageFps() {
        return averageFps;
    }

    @JsonProperty("average_fps")
    public void setAverageFps(Double averageFps) {
        this.averageFps = averageFps;
    }

    @JsonProperty("channel")
    public Channel getChannel() {
        return channel;
    }

    @JsonProperty("channel")
    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("delay")
    public Integer getDelay() {
        return delay;
    }

    @JsonProperty("delay")
    public void setDelay(Integer delay) {
        this.delay = delay;
    }

    @JsonProperty("game")
    public String getGame() {
        return game;
    }

    @JsonProperty("game")
    public void setGame(String game) {
        this.game = game;
    }

    @JsonProperty("is_playlist")
    public Boolean getIsPlaylist() {
        return isPlaylist;
    }

    @JsonProperty("is_playlist")
    public void setIsPlaylist(Boolean isPlaylist) {
        this.isPlaylist = isPlaylist;
    }

    @JsonProperty("preview")
    public Preview getPreview() {
        return preview;
    }

    @JsonProperty("preview")
    public void setPreview(Preview preview) {
        this.preview = preview;
    }

    @JsonProperty("video_height")
    public Integer getVideoHeight() {
        return videoHeight;
    }

    @JsonProperty("video_height")
    public void setVideoHeight(Integer videoHeight) {
        this.videoHeight = videoHeight;
    }

    @JsonProperty("viewers")
    public Integer getViewers() {
        return viewers;
    }

    @JsonProperty("viewers")
    public void setViewers(Integer viewers) {
        this.viewers = viewers;
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
