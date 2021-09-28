package pl.nieoczywisty.service;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.GsonFactoryBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import pl.nieoczywisty.model.Vehicle;
import pl.nieoczywisty.model.VehicleContainer;

@Controller
public class VehicleWebClient {

    @Autowired
    private WebClient.Builder webClientBuilder;

    @Autowired
    private VehicleService vehicleService;

    @GetMapping("/getGpsData")
    public String getGpsData(Model model) {

        Gson gson = new Gson();
        String vehListJson = gson.toJson(vehicleService.getGpsData().getVehicles());

        model.addAttribute("page","gpsData");
        model.addAttribute("gpsData",vehListJson);

        return "GPSDATA";
    }


}
