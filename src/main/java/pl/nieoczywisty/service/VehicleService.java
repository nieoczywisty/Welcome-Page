package pl.nieoczywisty.service;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class VehicleService {

    @Autowired
    private VehicleWebClient vehicleWebClient;

    public String getGpsData() {

        Gson gson = new Gson();
        String vehListJson = gson.toJson(vehicleWebClient.getVehicleContainerFromUri().getVehicles());

        return vehListJson;
    }


}
