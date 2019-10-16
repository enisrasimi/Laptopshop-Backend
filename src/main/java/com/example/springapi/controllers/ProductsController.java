package com.example.springapi.controllers;

import com.example.springapi.entity.Products;
import com.example.springapi.repository.ProductsRepository;
import com.example.springapi.services.ProductsService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")

public class ProductsController {
    @Autowired
    ProductsService productsService;

    //all
    // Get All Products
    @CrossOrigin(origins = "*")
    @GetMapping
    public ResponseEntity<List<Products>> getAllProducts() {
        List<Products> list = productsService.getAllProducts();
        return new ResponseEntity<List<Products>>(list, new HttpHeaders(), HttpStatus.OK);
    }

    //Get 6 last records on table
    @CrossOrigin(origins = "*")
    @GetMapping("/latestProducts")
    public List<Products> getLatestProducts() {
        List<Products> list = productsService.getLatestProducts();
        return list;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/laptops")
    public List<Products> getLaptops() {
        List<Products> list = productsService.getLaptops();
        return list;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/desktops")
    public List<Products> getDesktops() {
        List<Products> list = productsService.getDesktops();
        return list;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/allinone")
    public List<Products> getAllinOne() {
        List<Products> list = productsService.getAllinOne();
        return list;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/tv")
    public List<Products> getTV() {
        List<Products> list = productsService.getTV();
        return list;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("{id}")
    public ResponseEntity<Products> getProductById(@PathVariable("id") Long id) {
        Products product = productsService.getProductById(id);
        return new ResponseEntity<Products>(product, new HttpHeaders(), HttpStatus.OK);
    }


}
