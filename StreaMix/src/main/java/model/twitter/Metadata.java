
package model.twitter;

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
    "iso_language_code",
    "result_type"
})
public class Metadata {

    @JsonProperty("iso_language_code")
    private String isoLanguageCode;
    @JsonProperty("result_type")
    private String resultType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("iso_language_code")
    public String getIsoLanguageCode() {
        return isoLanguageCode;
    }

    @JsonProperty("iso_language_code")
    public void setIsoLanguageCode(String isoLanguageCode) {
        this.isoLanguageCode = isoLanguageCode;
    }

    @JsonProperty("result_type")
    public String getResultType() {
        return resultType;
    }

    @JsonProperty("result_type")
    public void setResultType(String resultType) {
        this.resultType = resultType;
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
