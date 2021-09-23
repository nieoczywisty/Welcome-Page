package pl.nieoczywisty.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "DataGenerated",
        "Line",
        "Route",
        "VehicleCode",
        "VehicleService",
        "VehicleId",
        "Speed",
        "Delay",
        "Lat",
        "Lon",
        "GPSQuality"
})

@Getter
@Setter
@NoArgsConstructor

public class Vehicle {

    @JsonProperty("DataGenerated")
    private String dataGenerated;
    @JsonProperty("Line")
    private String line;
    @JsonProperty("Route")
    private String route;
    @JsonProperty("VehicleCode")
    private String vehicleCode;
    @JsonProperty("VehicleService")
    private String vehicleService;
    @JsonProperty("VehicleId")
    private Integer vehicleId;
    @JsonProperty("Speed")
    private Integer speed;
    @JsonProperty("Delay")
    private Integer delay;
    @JsonProperty("Lat")
    private Double lat;
    @JsonProperty("Lon")
    private Double lon;
    @JsonProperty("GPSQuality")
    private Integer gPSQuality;
//    @JsonIgnore
//    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


}
