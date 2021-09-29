package pl.nieoczywisty.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import pl.nieoczywisty.model.VehicleContainer;

@Component
public class VehicleWebClient {

    @Autowired
    private WebClient.Builder webClientBuilder;


    public VehicleContainer getVehicleContainerFromUri() {

        VehicleContainer vehicleContainer = webClientBuilder.build()
                .get()
                .uri("https://ckan2.multimediagdansk.pl/gpsPositions")
                .retrieve()
                .bodyToMono(VehicleContainer.class)
                .block();

        return vehicleContainer;
    }
}
