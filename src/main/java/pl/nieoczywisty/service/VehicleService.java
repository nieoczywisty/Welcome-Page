package pl.nieoczywisty.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.reactive.function.client.WebClient;
import pl.nieoczywisty.model.Vehicle;
import pl.nieoczywisty.model.VehicleContainer;

@Component
public class VehicleService {
    @Autowired
    private WebClient.Builder webClientBuilder;

    public VehicleContainer getGpsData() {

        VehicleContainer vehicleContainer = webClientBuilder.build()
                .get()
                .uri("https://ckan2.multimediagdansk.pl/gpsPositions")
                .retrieve()
                .bodyToMono(VehicleContainer.class)
                .block();

        return vehicleContainer;
    }
}
