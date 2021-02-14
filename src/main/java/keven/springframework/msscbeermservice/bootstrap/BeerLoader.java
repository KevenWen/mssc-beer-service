package keven.springframework.msscbeermservice.bootstrap;

import keven.springframework.msscbeermservice.domain.Beer;
import keven.springframework.msscbeermservice.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * @author MikeWen
 * @date 2/14/2021 5:08 PM
 **/
@Component
public class BeerLoader implements CommandLineRunner {

    public static final Long BEER_1_UPC = 1063123436L;
    public static final Long BEER_2_UPC = 1063123419L;
    public static final Long BEER_3_UPC = 1008378313L;

    public static final UUID BEER_1_UUID = UUID.fromString("0a818933-087d-47f2-ad83-2f986ed087eb");
    public static final UUID BEER_2_UUID = UUID.fromString("a712d914-61ea-4623-8bd0-32c0f6545bfd");
    public static final UUID BEER_3_UUID = UUID.fromString("026cc3c8-3a0c-4083-a05b-e908048c1b08");


    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args){
        loadBeerOjbect();
    }

    private void loadBeerOjbect() {
        if(beerRepository.count() == 0){

            beerRepository.save(Beer.builder()
                    .beerName("Mango Bobs")
                    .beerStyle("IPA")
                    .quantityToBrew(200)
                    .minOnHand(12)
                    .upc(BEER_1_UPC)
                    .price(new BigDecimal("12.95"))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Galaxy Cat")
                    .beerStyle("PALE_ALE")
                    .quantityToBrew(200)
                    .minOnHand(12)
                    .upc(BEER_2_UPC)
                    .price(new BigDecimal("11.95"))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("No Hammers On The Bar")
                    .beerStyle("PALE_ALE")
                    .quantityToBrew(200)
                    .minOnHand(12)
                    .upc(BEER_3_UPC)
                    .price(new BigDecimal("21.95"))
                    .build());
        }

    }
}