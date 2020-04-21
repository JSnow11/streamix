
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
    "statuses",
    "search_metadata"
})
public class TweetList {

    @JsonProperty("statuses")
    private List<Status> statuses = null;
    @JsonProperty("search_metadata")
    private SearchMetadata searchMetadata;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("statuses")
    public List<Status> getStatuses() {
        return statuses;
    }

    @JsonProperty("statuses")
    public void setStatuses(List<Status> statuses) {
        this.statuses = statuses;
    }

    @JsonProperty("search_metadata")
    public SearchMetadata getSearchMetadata() {
        return searchMetadata;
    }

    @JsonProperty("search_metadata")
    public void setSearchMetadata(SearchMetadata searchMetadata) {
        this.searchMetadata = searchMetadata;
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
