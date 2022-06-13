/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.airanfranco.notes_app.service;

import com.airanfranco.notes_app.DTO.CategoryDTO;
import com.airanfranco.notes_app.model.Category;
import com.airanfranco.notes_app.mapper.CategoryMap;
import com.airanfranco.notes_app.repository.CategoryRepository;
import com.airanfranco.notes_app.service.iService.ICategoryService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author stevenfranco
 */
@Service
public class CategoryService implements ICategoryService {
    
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private CategoryMap categoryMap;


    @Override
    public List<CategoryDTO> findAllCategorys() {
        return categoryMap.mappAllCategoryToCategoryDTOs(categoryRepository.findCategorys());
    }

    public Optional<CategoryDTO> findCategoryById(Long id){
        Optional<Category> oCategory = categoryRepository.findCategoryById(id);
        return Optional.of(categoryMap.mapCategoryToDTO(oCategory.get()));
    }

    @Override
    public CategoryDTO updateCategory(CategoryDTO categoryDTO, Long id){
        
        Optional<Category> oCategory = categoryRepository.findCategoryById(id);
        if (oCategory.isPresent()) {
            
            if (categoryDTO.getName()!= null) {
                oCategory.get().setName(categoryDTO.getName());
            }      

            return categoryMap.mapCategoryToDTO(categoryRepository.saveCategory(oCategory.get())) ;
        }
        return null;			
    }

    @Override
    public CategoryDTO deleteCategoryById(Long id) {
        Optional<Category> categoryDeleted = categoryRepository.findCategoryById(id);
        if(categoryDeleted.isPresent()) {
            categoryRepository.deleteCategoryById(id);
            return categoryMap.mapCategoryToDTO(categoryDeleted.get());
            }
        return null;
    }

    @Override
    public Category saveCategory(Category category) {
        categoryRepository.saveCategory(category);
        return category;
    }
    
}
