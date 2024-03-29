package pl.nieoczywisty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.nieoczywisty.service.VehicleService;


@Controller
public class HomeController {

    @Autowired
    private VehicleService vehicleService;


    @GetMapping("/")
    public String displayMainPage(Model model) {

        model.addAttribute("gpsTableData",vehicleService.getGpsData());
        model.addAttribute("gps","gps");
        return "indexNew";
    }
}
