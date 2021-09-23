package pl.nieoczywisty.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.nieoczywisty.model.Vehicle0;

import java.util.ArrayList;
import java.util.List;

@RestController
public class VehiclesControllerRest {

    List<Vehicle0> vehList;

    public VehiclesControllerRest() {

        this.vehList = new ArrayList<>();
        Vehicle0 veh1 = new Vehicle0("jeden");
        Vehicle0 veh2 = new Vehicle0("dwa");
        vehList.add(veh1);
        vehList.add(veh2);
    }

    @GetMapping(value = "/api/vehicles", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Vehicle0> vehiclesList() {
        return vehList;
    }

    @PostMapping(value = "/api/vehicles", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void vehiclesCreate(@RequestBody Vehicle0 temp) {
        vehList.add(temp);
    }
}
