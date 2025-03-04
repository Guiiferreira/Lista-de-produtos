package com.guilhermedev.springboot.models;

import jakarta.persistence.*;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "TB_PRODUCTS")
public class ProductModel extends RepresentationModel<ProductModel> implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private UUID idProduct;
    private String name;
    private BigDecimal valor;

    public ProductModel() {
    }

    public ProductModel(UUID idProduct, String name, BigDecimal valor) {
        this.idProduct = idProduct;
        this.name = name;
        this.valor = valor;
    }

    public UUID getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(UUID idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
