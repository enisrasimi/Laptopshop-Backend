package com.example.springapi.controllers;

import com.example.springapi.entity.Category;
import com.example.springapi.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;


    @GetMapping
    public List<Category> getAllCategories() {
     List<Category> list = categoryService.getAllCategories();
     return list;
    }

    @GetMapping("/byCategorie")
        public List<Category> getAllByCategory(@PathVariable(value = "id") int id){
        List<Category> lisByCategory = categoryService.findAllByCategory();
        return lisByCategory;
    }



}
