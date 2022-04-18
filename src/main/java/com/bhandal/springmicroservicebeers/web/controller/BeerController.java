package com.bhandal.springmicroservicebeers.web.controller;

import com.bhandal.springmicroservicebeers.web.model.BeerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer/")
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable UUID beerId) {
        return new ResponseEntity<>(BeerDto.builder().beerName("Corona").build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBeer(@RequestBody BeerDto beerDto) {

        final HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/beer/");
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @PutMapping("{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity updateBeerById(@PathVariable UUID beerId, @RequestBody BeerDto beerDto) {
        BeerDto updatedBeerDto = new BeerDto();
        return new ResponseEntity(updatedBeerDto, HttpStatus.CREATED);
    }

    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeerById(@PathVariable UUID beerId) {

    }
}
