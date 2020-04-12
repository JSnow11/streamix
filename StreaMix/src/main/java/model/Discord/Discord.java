
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
    "id",
    "guild_id",
    "name",
    "type",
    "position",
    "permission_overwrites",
    "rate_limit_per_user",
    "nsfw",
    "topic",
    "last_message_id",
    "parent_id"
})
public class Discord {

    @JsonProperty("id")
    private String id;
    @JsonProperty("guild_id")
    private String guildId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private Integer type;
    @JsonProperty("position")
    private Integer position;
    @JsonProperty("permission_overwrites")
    private List<Object> permissionOverwrites = null;
    @JsonProperty("rate_limit_per_user")
    private Integer rateLimitPerUser;
    @JsonProperty("nsfw")
    private Boolean nsfw;
    @JsonProperty("topic")
    private String topic;
    @JsonProperty("last_message_id")
    private String lastMessageId;
    @JsonProperty("parent_id")
    private String parentId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("guild_id")
    public String getGuildId() {
        return guildId;
    }

    @JsonProperty("guild_id")
    public void setGuildId(String guildId) {
        this.guildId = guildId;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("type")
    public Integer getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(Integer type) {
        this.type = type;
    }

    @JsonProperty("position")
    public Integer getPosition() {
        return position;
    }

    @JsonProperty("position")
    public void setPosition(Integer position) {
        this.position = position;
    }

    @JsonProperty("permission_overwrites")
    public List<Object> getPermissionOverwrites() {
        return permissionOverwrites;
    }

    @JsonProperty("permission_overwrites")
    public void setPermissionOverwrites(List<Object> permissionOverwrites) {
        this.permissionOverwrites = permissionOverwrites;
    }

    @JsonProperty("rate_limit_per_user")
    public Integer getRateLimitPerUser() {
        return rateLimitPerUser;
    }

    @JsonProperty("rate_limit_per_user")
    public void setRateLimitPerUser(Integer rateLimitPerUser) {
        this.rateLimitPerUser = rateLimitPerUser;
    }

    @JsonProperty("nsfw")
    public Boolean getNsfw() {
        return nsfw;
    }

    @JsonProperty("nsfw")
    public void setNsfw(Boolean nsfw) {
        this.nsfw = nsfw;
    }

    @JsonProperty("topic")
    public String getTopic() {
        return topic;
    }

    @JsonProperty("topic")
    public void setTopic(String topic) {
        this.topic = topic;
    }

    @JsonProperty("last_message_id")
    public String getLastMessageId() {
        return lastMessageId;
    }

    @JsonProperty("last_message_id")
    public void setLastMessageId(String lastMessageId) {
        this.lastMessageId = lastMessageId;
    }

    @JsonProperty("parent_id")
    public String getParentId() {
        return parentId;
    }

    @JsonProperty("parent_id")
    public void setParentId(String parentId) {
        this.parentId = parentId;
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
