package com.example.springapi.Repository;

import com.example.springapi.Entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductsRepository
        extends JpaRepository<Products, Long> {

    @Query(
            value = "SELECT * FROM products ORDER BY  id desc limit 12",
            nativeQuery = true
    )
    List<Products> getLatestProducts();

}
