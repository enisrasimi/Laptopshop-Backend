package com.example.springapi.Controllers;

import com.example.springapi.Entity.Products;
import com.example.springapi.Services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")


public class ProductsController {
    @Autowired
    ProductsService productsService;

    // Get All Products
    @GetMapping
    public ResponseEntity<List<Products>> getAllProducts() {
        List<Products> list = productsService.getAllProducts();
        return new ResponseEntity<List<Products>>(list, new HttpHeaders(), HttpStatus.OK);
    }

}
