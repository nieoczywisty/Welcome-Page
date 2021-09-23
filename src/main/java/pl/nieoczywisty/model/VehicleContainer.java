package pl.nieoczywisty.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "LastUpdateData",
        "Vehicles"
})

@Getter
@Setter
@NoArgsConstructor
public class VehicleContainer {

    @JsonProperty("LastUpdateData")
    private String lastUpdateData;
    @JsonProperty("Vehicles")
    private List<Vehicle> vehicles = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();



}
