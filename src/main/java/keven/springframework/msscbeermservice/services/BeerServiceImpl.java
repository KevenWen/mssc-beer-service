package keven.springframework.msscbeermservice.services;

import keven.springframework.msscbeermservice.domain.Beer;
import keven.springframework.msscbeermservice.repositories.BeerRepository;
import keven.springframework.msscbeermservice.web.mappers.BeerMapper;
import keven.springframework.msscbeermservice.web.mode.BeerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author MikeWen
 * @date 2/15/2021 11:57 AM
 **/
@Service("beerService")
@RequiredArgsConstructor
public class BeerServiceImpl implements BeerService {

    private final BeerRepository beerRepository;
    private final BeerMapper beerMapper;

    @Override
    public BeerDto getById(UUID beerId) {
        return beerMapper.beerToBeerDTO(
                beerRepository.findById(beerId).orElseThrow(NotFoundException::new)
        );
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return beerMapper.beerToBeerDTO(
                beerRepository.save(beerMapper.beerDTOToBeer(beerDto))
        );
    }

    @Override
    public BeerDto updateBeerById(UUID beerId, BeerDto beerDto) {
        Beer beer = beerRepository.findById(beerId).orElseThrow(NotFoundException::new);

        beer.setBeerName(beerDto.getBeerName());
        beer.setBeerStyle(beerDto.getBeerStyleEnum().name());
        beer.setPrice(beerDto.getPrice());
        beer.setUpc(beerDto.getUpc());

        return beerMapper.beerToBeerDTO(
                beerRepository.save(beer));
    }
}
