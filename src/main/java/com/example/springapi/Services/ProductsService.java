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
        if (productsList.size() > 0) {
            return productsList;
        } else {
            return new ArrayList<Products>();
        }
    };

    public List<Products> getLatestProducts () {
        return  productsRepository.getLatestProducts();
    };

    public List<Products> getLaptops() {
        return productsRepository.getLaptops();
    };
    public List<Products> getDesktops() {
        return productsRepository.getDesktops();
    };

    public List<Products> getAllinOne() {
        return productsRepository.getAllinOne();
    };

    public List<Products> getTV() {
        return productsRepository.getTV();
    };



}
