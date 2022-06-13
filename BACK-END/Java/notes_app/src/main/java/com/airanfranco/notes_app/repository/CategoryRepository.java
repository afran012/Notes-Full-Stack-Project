/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.airanfranco.notes_app.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.airanfranco.notes_app.model.Category;
import com.airanfranco.notes_app.repository.iRepository.ICategoryRepository;

/**
 *
 * @author stevenfranco
 */
@Repository
public class CategoryRepository {
    
    @Autowired
    private ICategoryRepository categoryRepository;

    public List<Category> findCategorys(){
        System.out.println("Aca");
        //System.out.println(categoryRepository.findAll());
        return categoryRepository.findAll();
    }


    public Optional<Category> findCategoryById(Long id){
        return categoryRepository.findById(id);
    }

    public Category saveCategory (Category category) {
        return categoryRepository.save(category);
    }


    public void deleteCategoryById(Long id){
        categoryRepository.deleteById(id);
    }
    
}
