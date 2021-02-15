package keven.springframework.msscbeermservice.web.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import keven.springframework.msscbeermservice.web.mode.BeerDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;

import java.util.concurrent.Callable;

/**
 * @author MikeWen
 * @date 2/15/2021 9:03 AM
 **/

@ActiveProfiles("snake")
public class BeerSnakeTest extends BeerControllerTest {

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void testSnake() throws JsonProcessingException {
        BeerDto beerDto = getDto();
        String json = objectMapper.writeValueAsString(beerDto);
        System.out.println(json);

    }

}
