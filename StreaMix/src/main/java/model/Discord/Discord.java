
package model.Discord;

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
@JsonPropertyOrder({
    "reactions",
    "attachments",
    "tts",
    "embeds",
    "timestamp",
    "mention_everyone",
    "id",
    "pinned",
    "edited_timestamp",
    "author",
    "mention_roles",
    "content",
    "channel_id",
    "mentions",
    "type"
})
public class Discord {

    @JsonProperty("reactions")
    private List<Reaction> reactions = null;
    @JsonProperty("attachments")
    private List<Object> attachments = null;
    @JsonProperty("tts")
    private Boolean tts;
    @JsonProperty("embeds")
    private List<Object> embeds = null;
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("mention_everyone")
    private Boolean mentionEveryone;
    @JsonProperty("id")
    private String id;
    @JsonProperty("pinned")
    private Boolean pinned;
    @JsonProperty("edited_timestamp")
    private Object editedTimestamp;
    @JsonProperty("author")
    private Author author;
    @JsonProperty("mention_roles")
    private List<Object> mentionRoles = null;
    @JsonProperty("content")
    private String content;
    @JsonProperty("channel_id")
    private String channelId;
    @JsonProperty("mentions")
    private List<Object> mentions = null;
    @JsonProperty("type")
    private Integer type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("reactions")
    public List<Reaction> getReactions() {
        return reactions;
    }

    @JsonProperty("reactions")
    public void setReactions(List<Reaction> reactions) {
        this.reactions = reactions;
    }

    @JsonProperty("attachments")
    public List<Object> getAttachments() {
        return attachments;
    }

    @JsonProperty("attachments")
    public void setAttachments(List<Object> attachments) {
        this.attachments = attachments;
    }

    @JsonProperty("tts")
    public Boolean getTts() {
        return tts;
    }

    @JsonProperty("tts")
    public void setTts(Boolean tts) {
        this.tts = tts;
    }

    @JsonProperty("embeds")
    public List<Object> getEmbeds() {
        return embeds;
    }

    @JsonProperty("embeds")
    public void setEmbeds(List<Object> embeds) {
        this.embeds = embeds;
    }

    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("mention_everyone")
    public Boolean getMentionEveryone() {
        return mentionEveryone;
    }

    @JsonProperty("mention_everyone")
    public void setMentionEveryone(Boolean mentionEveryone) {
        this.mentionEveryone = mentionEveryone;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("pinned")
    public Boolean getPinned() {
        return pinned;
    }

    @JsonProperty("pinned")
    public void setPinned(Boolean pinned) {
        this.pinned = pinned;
    }

    @JsonProperty("edited_timestamp")
    public Object getEditedTimestamp() {
        return editedTimestamp;
    }

    @JsonProperty("edited_timestamp")
    public void setEditedTimestamp(Object editedTimestamp) {
        this.editedTimestamp = editedTimestamp;
    }

    @JsonProperty("author")
    public Author getAuthor() {
        return author;
    }

    @JsonProperty("author")
    public void setAuthor(Author author) {
        this.author = author;
    }

    @JsonProperty("mention_roles")
    public List<Object> getMentionRoles() {
        return mentionRoles;
    }

    @JsonProperty("mention_roles")
    public void setMentionRoles(List<Object> mentionRoles) {
        this.mentionRoles = mentionRoles;
    }

    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    @JsonProperty("content")
    public void setContent(String content) {
        this.content = content;
    }

    @JsonProperty("channel_id")
    public String getChannelId() {
        return channelId;
    }

    @JsonProperty("channel_id")
    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    @JsonProperty("mentions")
    public List<Object> getMentions() {
        return mentions;
    }

    @JsonProperty("mentions")
    public void setMentions(List<Object> mentions) {
        this.mentions = mentions;
    }

    @JsonProperty("type")
    public Integer getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(Integer type) {
        this.type = type;
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
