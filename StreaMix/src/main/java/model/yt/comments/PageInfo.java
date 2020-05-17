
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
    "totalResults",
    "resultsPerPage"
})
public class PageInfo {

    @JsonProperty("totalResults")
    private Integer totalResults;
    @JsonProperty("resultsPerPage")
    private Integer resultsPerPage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("totalResults")
    public Integer getTotalResults() {
        return totalResults;
    }

    @JsonProperty("totalResults")
    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    public PageInfo withTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
        return this;
    }

    @JsonProperty("resultsPerPage")
    public Integer getResultsPerPage() {
        return resultsPerPage;
    }

    @JsonProperty("resultsPerPage")
    public void setResultsPerPage(Integer resultsPerPage) {
        this.resultsPerPage = resultsPerPage;
    }

    public PageInfo withResultsPerPage(Integer resultsPerPage) {
        this.resultsPerPage = resultsPerPage;
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

    public PageInfo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
