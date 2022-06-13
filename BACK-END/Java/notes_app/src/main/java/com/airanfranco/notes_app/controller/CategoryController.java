/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.airanfranco.notes_app.controller;

import com.airanfranco.notes_app.DTO.CategoryDTO;
import com.airanfranco.notes_app.model.Category;
import com.airanfranco.notes_app.repository.iRepository.ICategoryRepository;
import com.airanfranco.notes_app.service.CategoryService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author stevenfranco
 */
@RestController
@CrossOrigin(origins= {"*"})
@RequestMapping("api/category")
public class CategoryController {
    

    @Autowired
    private CategoryService categoryService;
    
    @Autowired
    public ICategoryRepository iCategoryRepository;
    
    @GetMapping
    public List<CategoryDTO> findAllCategorys(){
            System.out.println("controller");
            //System.out.println(categoryService.findAllCategorys());
        return categoryService.findAllCategorys();
    }
    
    @GetMapping("/{id}")
    public Optional<CategoryDTO> findCategoryById(@PathVariable("id") Long id){
        return categoryService.findCategoryById(id);
    }
    
    @PutMapping("/{id}")
    public CategoryDTO updateCategory(@RequestBody CategoryDTO categoryDTO,@PathVariable("id") Long id){
        System.out.println(categoryDTO);
        return categoryService.updateCategory(categoryDTO , id);
    }
    
    @DeleteMapping("/{id}")
    public CategoryDTO deleteCategory(@PathVariable("id") Long id){
        return categoryService.deleteCategoryById(id);
    }
    
    @PostMapping("")
    public Category saveCategory(@RequestBody Category category) {
        System.out.println(category);
        categoryService.saveCategory(category);
        return category;
    }
    
}
