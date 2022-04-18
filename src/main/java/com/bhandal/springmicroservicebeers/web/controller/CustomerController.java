package com.bhandal.springmicroservicebeers.web.controller;

import com.bhandal.springmicroservicebeers.web.model.CustomerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @GetMapping("/{uuid}")
    public CustomerDto getCustomerById(@PathVariable UUID uuid) {
        return CustomerDto.builder()
                .id(uuid)
                .firstName("Aj")
                .lastName("Bhandal")
                .build();
    }

    @PostMapping
    public ResponseEntity saveCustomer(@RequestBody CustomerDto customerDto) {

        final HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/customer/" + customerDto.getId().toString());
        return new ResponseEntity(headers, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public CustomerDto updateCusomter(@PathVariable UUID id, @RequestBody CustomerDto cusomterDto) {
        return CustomerDto.builder()
                .id(id)
                .firstName(cusomterDto.getFirstName())
                .lastName(cusomterDto.getLastName())
                .build();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCustomer(@PathVariable UUID id) {

    }
}
