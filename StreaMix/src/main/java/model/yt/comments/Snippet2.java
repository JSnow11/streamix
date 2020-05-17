
package model.yt.comments;

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
    "videoId",
    "textDisplay",
    "textOriginal",
    "authorDisplayName",
    "authorProfileImageUrl",
    "authorChannelUrl",
    "authorChannelId",
    "canRate",
    "viewerRating",
    "likeCount",
    "publishedAt",
    "updatedAt"
})
public class Snippet2 {

    @JsonProperty("videoId")
    private String videoId;
    @JsonProperty("textDisplay")
    private String textDisplay;
    @JsonProperty("textOriginal")
    private String textOriginal;
    @JsonProperty("authorDisplayName")
    private String authorDisplayName;
    @JsonProperty("authorProfileImageUrl")
    private String authorProfileImageUrl;
    @JsonProperty("authorChannelUrl")
    private String authorChannelUrl;
    @JsonProperty("authorChannelId")
    private AuthorChannelId authorChannelId;
    @JsonProperty("canRate")
    private Boolean canRate;
    @JsonProperty("viewerRating")
    private String viewerRating;
    @JsonProperty("likeCount")
    private Integer likeCount;
    @JsonProperty("publishedAt")
    private String publishedAt;
    @JsonProperty("updatedAt")
    private String updatedAt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("videoId")
    public String getVideoId() {
        return videoId;
    }

    @JsonProperty("videoId")
    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public Snippet2 withVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }

    @JsonProperty("textDisplay")
    public String getTextDisplay() {
        return textDisplay;
    }

    @JsonProperty("textDisplay")
    public void setTextDisplay(String textDisplay) {
        this.textDisplay = textDisplay;
    }

    public Snippet2 withTextDisplay(String textDisplay) {
        this.textDisplay = textDisplay;
        return this;
    }

    @JsonProperty("textOriginal")
    public String getTextOriginal() {
        return textOriginal;
    }

    @JsonProperty("textOriginal")
    public void setTextOriginal(String textOriginal) {
        this.textOriginal = textOriginal;
    }

    public Snippet2 withTextOriginal(String textOriginal) {
        this.textOriginal = textOriginal;
        return this;
    }

    @JsonProperty("authorDisplayName")
    public String getAuthorDisplayName() {
        return authorDisplayName;
    }

    @JsonProperty("authorDisplayName")
    public void setAuthorDisplayName(String authorDisplayName) {
        this.authorDisplayName = authorDisplayName;
    }

    public Snippet2 withAuthorDisplayName(String authorDisplayName) {
        this.authorDisplayName = authorDisplayName;
        return this;
    }

    @JsonProperty("authorProfileImageUrl")
    public String getAuthorProfileImageUrl() {
        return authorProfileImageUrl;
    }

    @JsonProperty("authorProfileImageUrl")
    public void setAuthorProfileImageUrl(String authorProfileImageUrl) {
        this.authorProfileImageUrl = authorProfileImageUrl;
    }

    public Snippet2 withAuthorProfileImageUrl(String authorProfileImageUrl) {
        this.authorProfileImageUrl = authorProfileImageUrl;
        return this;
    }

    @JsonProperty("authorChannelUrl")
    public String getAuthorChannelUrl() {
        return authorChannelUrl;
    }

    @JsonProperty("authorChannelUrl")
    public void setAuthorChannelUrl(String authorChannelUrl) {
        this.authorChannelUrl = authorChannelUrl;
    }

    public Snippet2 withAuthorChannelUrl(String authorChannelUrl) {
        this.authorChannelUrl = authorChannelUrl;
        return this;
    }

    @JsonProperty("authorChannelId")
    public AuthorChannelId getAuthorChannelId() {
        return authorChannelId;
    }

    @JsonProperty("authorChannelId")
    public void setAuthorChannelId(AuthorChannelId authorChannelId) {
        this.authorChannelId = authorChannelId;
    }

    public Snippet2 withAuthorChannelId(AuthorChannelId authorChannelId) {
        this.authorChannelId = authorChannelId;
        return this;
    }

    @JsonProperty("canRate")
    public Boolean getCanRate() {
        return canRate;
    }

    @JsonProperty("canRate")
    public void setCanRate(Boolean canRate) {
        this.canRate = canRate;
    }

    public Snippet2 withCanRate(Boolean canRate) {
        this.canRate = canRate;
        return this;
    }

    @JsonProperty("viewerRating")
    public String getViewerRating() {
        return viewerRating;
    }

    @JsonProperty("viewerRating")
    public void setViewerRating(String viewerRating) {
        this.viewerRating = viewerRating;
    }

    public Snippet2 withViewerRating(String viewerRating) {
        this.viewerRating = viewerRating;
        return this;
    }

    @JsonProperty("likeCount")
    public Integer getLikeCount() {
        return likeCount;
    }

    @JsonProperty("likeCount")
    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public Snippet2 withLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
        return this;
    }

    @JsonProperty("publishedAt")
    public String getPublishedAt() {
        return publishedAt;
    }

    @JsonProperty("publishedAt")
    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public Snippet2 withPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
        return this;
    }

    @JsonProperty("updatedAt")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updatedAt")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Snippet2 withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
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

    public Snippet2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
