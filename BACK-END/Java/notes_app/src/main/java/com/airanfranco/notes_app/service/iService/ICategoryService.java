/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.airanfranco.notes_app.service.iService;

import com.airanfranco.notes_app.DTO.CategoryDTO;
import com.airanfranco.notes_app.model.Category;
import java.util.List;

/**
 *
 * @author stevenfranco
 */
public interface ICategoryService {
    
    public List<CategoryDTO> findAllCategorys();
    public CategoryDTO updateCategory(CategoryDTO categoryDTO, Long id);
    public CategoryDTO deleteCategoryById(Long id);
    public Category saveCategory(Category category);
    
}
