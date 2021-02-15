package keven.springframework.msscbeermservice.web.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import keven.springframework.msscbeermservice.web.mode.BeerDto;
import lombok.val;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

/**
 * @author MikeWen
 * @date 2/15/2021 8:41 AM
 **/

//@JsonTest
public class JsonSerTest extends BeerControllerTest {

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void SerializeTest() throws JsonProcessingException {
        BeerDto beerDto = getDto();
        var jsonString = objectMapper.writeValueAsString(beerDto);
        System.out.println(jsonString);
    }

    @Test
    void DeSerializeTest() throws JsonProcessingException {
        String jsonString = "{\"id\":\"1a01f834-6765-408d-8ba0-bfae1a9885d1\",\"version\":null,\"createdDate\":\"2021-02-15T08:53:22.9483151+08:00\",\"lastModifiedDated\":\"2021-02-15T08:53:22.9483151+08:00\",\"beerName\":\"BeerName\",\"beerStyleEnum\":\"LAGER\",\"upc\":12341234112,\"price\":12.99,\"quantityOnHand\":null}";
        String jsonString1 = "{\"version\":null,\"createdDate\":\"2021-02-15T11:29:18.0596894+08:00\",\"lastModifiedDated\":\"2021-02-15T11:29:18.0596894+08:00\",\"beerName\":\"BeerName\",\"beerStyleEnum\":\"LAGER\",\"upc\":12341234112,\"price\":12.99,\"quantityOnHand\":null,\"beerId\":\"a1c246f1-bc7d-4075-a618-130a35dd02f4\"}";
        BeerDto beer = objectMapper.readValue(jsonString1,BeerDto.class);
        System.out.println(beer);
    }

}
