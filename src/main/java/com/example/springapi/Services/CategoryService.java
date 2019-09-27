package com.example.springapi.Services;

import com.example.springapi.Entity.Category;
import com.example.springapi.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> getAllCategories() {
         List<Category> categoryList = categoryRepository.findAll();
               if(categoryList.size() > 0) {
                   return categoryList;
               }else {
                   return new ArrayList<Category>();
               }
    };

    public List<Category> findAllByCategory() {
        List<Category> categoryList = categoryRepository.findAllByCategory(1);
        return categoryList;
    }
}
