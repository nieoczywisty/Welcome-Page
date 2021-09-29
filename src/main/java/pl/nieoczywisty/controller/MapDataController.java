package pl.nieoczywisty.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.nieoczywisty.service.VehicleService;

@Controller
public class MapDataController {

    @Autowired
    private VehicleService vehicleService;

    @GetMapping("/getGpsData")
    public String getGpsData(Model model) {

        model.addAttribute("gpsData",vehicleService.getGpsData());

        return "GPSDATA";
    }
}
