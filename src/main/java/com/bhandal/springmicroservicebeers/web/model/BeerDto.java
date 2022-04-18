package com.bhandal.springmicroservicebeers.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BeerDto {
    private UUID          id;
    private int           version;
    private LocalDateTime createdDate;
    private LocalDateTime lastModifiedDate;
    private String        beerName;
    private BeerStyleEnum beerStyle;
    private Long          upc;
    private BigDecimal    price;
    private int           quantityOnHand;
}
