package com.ayoh.coreshop.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ProductDto {

    private String name;
    private Long price;
    private String details;
    private LocalDateTime createDate;

}
