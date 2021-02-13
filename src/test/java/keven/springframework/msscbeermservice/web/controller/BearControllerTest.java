package keven.springframework.msscbeermservice.web.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest(BearController.class)
class BearControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void getBeerByid() {

      //  mockMvc.perform(get());  //(get("/api/v1/beer/" + UUID.randomUUID().toString()).accpt)
    }

    @Test
    void saveNewBeer() {
    }

    @Test
    void updateBeerById() {
    }
}