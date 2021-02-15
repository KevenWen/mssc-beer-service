package keven.springframework.msscbeermservice.web.mappers;

import keven.springframework.msscbeermservice.domain.Beer;
import keven.springframework.msscbeermservice.web.mode.BeerDto;
import org.mapstruct.Mapper;

/**
 * @author MikeWen
 * @date 2/15/2021 12:04 PM
 **/
@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDTO(Beer beer);
    Beer beerDTOToBeer(BeerDto dto);

}