package com.example.springapi.Services;

import com.example.springapi.Entity.Products;
import com.example.springapi.Repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductsService {
    @Autowired
    ProductsRepository productsRepository;


    public List<Products> getAllProducts() {
          List<Products> productsList = productsRepository.findAll();
    if(productsList.size() > 0) {
        return productsList;
    }else {
        return new ArrayList<Products>();
    }

    }



}
