package com.guilhermedev.springboot.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;


//@notblank valor não pode ser null
//@notnull valor nao pode ser null
public record ProductRecordDto(@NotBlank String name, @NotNull BigDecimal valor) {


}
