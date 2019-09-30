package com.example.springapi.repository;

import com.example.springapi.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductsRepository
        extends JpaRepository<Products, Long> {


    @Query(
            value = "SELECT * FROM products ORDER BY  id desc limit 12",
            nativeQuery = true
    )
    List<Products> getLatestProducts();


    @Query(
            value="select * from products where category_id = 1",
            nativeQuery = true
    )
    List<Products> getLaptops();

    @Query(
            value="select * from products where category_id = 2",
            nativeQuery = true
    )
    List<Products> getDesktops();

    @Query(
            value="select * from products where category_id = 3",
            nativeQuery = true
    )
    List<Products> getTV();

    @Query(
            value="select * from products where category_id = 4",
            nativeQuery = true
    )
    List<Products> getAllinOne();










}
