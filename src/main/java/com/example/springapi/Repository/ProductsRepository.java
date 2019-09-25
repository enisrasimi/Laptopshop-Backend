package com.example.springapi.Repository;

import com.example.springapi.Entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository
        extends JpaRepository<Products, Long> {


}
