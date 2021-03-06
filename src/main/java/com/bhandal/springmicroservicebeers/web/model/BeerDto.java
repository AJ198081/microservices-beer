package com.bhandal.springmicroservicebeers.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BeerDto {

    @Null
    private UUID          id;

    @Null
    private int           version;

    @Null
    private LocalDateTime createdDate;

    @Null
    private LocalDateTime lastModifiedDate;

    @NotBlank
    private String        beerName;

    @NotNull
    private BeerStyleEnum beerStyle;

    @Positive
    @NotNull
    private Long          upc;

    @Positive @NotNull
    private BigDecimal    price;
    private int           quantityOnHand;
}
