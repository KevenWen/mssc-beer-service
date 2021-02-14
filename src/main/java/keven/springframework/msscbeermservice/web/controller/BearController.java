package keven.springframework.msscbeermservice.web.controller;

import keven.springframework.msscbeermservice.web.mode.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BearController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerByid(@PathVariable("beerId")  UUID beerId){

        //todo impl
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBeer(@RequestBody @Validated BeerDto beerDto){

        //todo impl
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerById(@PathVariable("beerId")  UUID beerId, @RequestBody @Validated BeerDto beerDto){

        //todo impl
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

}
