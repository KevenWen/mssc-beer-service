package keven.springframework.msscbeermservice.services;

import keven.springframework.msscbeermservice.web.mode.BeerDto;

import java.util.UUID;

/**
 * @author MikeWen
 * @date 2/15/2021 11:51 AM
 **/
public interface BeerService {
    BeerDto getById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeerById(UUID beerId, BeerDto beerDto);
}
