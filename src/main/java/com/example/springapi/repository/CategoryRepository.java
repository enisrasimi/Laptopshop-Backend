package com.example.springapi.repository;

import com.example.springapi.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    @Query(
            value="select * from products p  where p.category_name= :category_id",
            nativeQuery = true
    )
    List<Category> findAllByCategory(@Param("category_id")int category_id);
}
