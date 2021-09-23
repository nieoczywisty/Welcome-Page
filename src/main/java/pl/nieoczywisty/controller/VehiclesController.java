package pl.nieoczywisty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehiclesController {

    @GetMapping
    public String getCoordinates(){

        return null;
    }
}
