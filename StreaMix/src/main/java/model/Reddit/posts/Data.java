
package model.reddit.posts;

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
    "modhash",
    "dist",
    "children",
    "after",
    "before"
})
public class Data {

    @JsonProperty("modhash")
    private String modhash;
    @JsonProperty("dist")
    private Integer dist;
    @JsonProperty("children")
    private List<Child> children = null;
    @JsonProperty("after")
    private String after;
    @JsonProperty("before")
    private Object before;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("modhash")
    public String getModhash() {
        return modhash;
    }

    @JsonProperty("modhash")
    public void setModhash(String modhash) {
        this.modhash = modhash;
    }

    public Data withModhash(String modhash) {
        this.modhash = modhash;
        return this;
    }

    @JsonProperty("dist")
    public Integer getDist() {
        return dist;
    }

    @JsonProperty("dist")
    public void setDist(Integer dist) {
        this.dist = dist;
    }

    public Data withDist(Integer dist) {
        this.dist = dist;
        return this;
    }

    @JsonProperty("children")
    public List<Child> getChildren() {
        return children;
    }

    @JsonProperty("children")
    public void setChildren(List<Child> children) {
        this.children = children;
    }

    public Data withChildren(List<Child> children) {
        this.children = children;
        return this;
    }

    @JsonProperty("after")
    public String getAfter() {
        return after;
    }

    @JsonProperty("after")
    public void setAfter(String after) {
        this.after = after;
    }

    public Data withAfter(String after) {
        this.after = after;
        return this;
    }

    @JsonProperty("before")
    public Object getBefore() {
        return before;
    }

    @JsonProperty("before")
    public void setBefore(Object before) {
        this.before = before;
    }

    public Data withBefore(Object before) {
        this.before = before;
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

    public Data withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
