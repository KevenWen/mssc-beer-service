package keven.springframework.msscbeermservice.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import keven.springframework.msscbeermservice.web.mode.BeerDto;
import keven.springframework.msscbeermservice.web.mode.BeerStyleEnum;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(BearController.class)
@Slf4j
class BeerControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

//    @MockBean
//    BeerService beerService;

    @Test
    void getBeerByid() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/beer/" + UUID.randomUUID().toString()).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
                //.andDo();
    }


    @Test
    void saveNewBeer() {
    }

    @Test
    void updateBeerById() {
    }

    public BeerDto getDto(){
        return BeerDto.builder()
                .beerName("BeerName")
                .beerStyleEnum(BeerStyleEnum.LAGER)
                .id(UUID.randomUUID())
                .createdDate(OffsetDateTime.now())
                .lastModifiedDated(OffsetDateTime.now())
                .price(new BigDecimal("12.99"))
                .upc(12341234112L)
                .build();

    }

}