package com.guilhermedev.springboot.controllers;

import com.guilhermedev.springboot.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {


    @Autowired
    ProductRepository productRepository;

    // metodos CRUD


}
