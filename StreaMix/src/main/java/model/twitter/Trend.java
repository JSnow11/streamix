
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
@JsonPropertyOrder({
    "trends",
    "as_of",
    "created_at",
    "locations"
})
public class Trend {

    @JsonProperty("trends")
    private List<Trend> trends = null;
    @JsonProperty("as_of")
    private String asOf;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("locations")
    private List<Location> locations = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("trends")
    public List<Trend> getTrends() {
        return trends;
    }

    @JsonProperty("trends")
    public void setTrends(List<Trend> trends) {
        this.trends = trends;
    }

    public Trend withTrends(List<Trend> trends) {
        this.trends = trends;
        return this;
    }

    @JsonProperty("as_of")
    public String getAsOf() {
        return asOf;
    }

    @JsonProperty("as_of")
    public void setAsOf(String asOf) {
        this.asOf = asOf;
    }

    public Trend withAsOf(String asOf) {
        this.asOf = asOf;
        return this;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Trend withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @JsonProperty("locations")
    public List<Location> getLocations() {
        return locations;
    }

    @JsonProperty("locations")
    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public Trend withLocations(List<Location> locations) {
        this.locations = locations;
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

    public Trend withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
