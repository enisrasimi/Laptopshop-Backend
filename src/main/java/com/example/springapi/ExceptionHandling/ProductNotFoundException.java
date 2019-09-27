package com.example.springapi.ExceptionHandling;

public class ProductNotFoundException extends Exception{
    private long product_id;
        public ProductNotFoundException(long product_id){
            super(String.format("product not found"));
        }
}
