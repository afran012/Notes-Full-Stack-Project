/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.airanfranco.notes_app.mapper;

import com.airanfranco.notes_app.DTO.CategoryDTO;
import com.airanfranco.notes_app.model.Category;
import java.util.List;
import org.mapstruct.Mapper;

/**
 *
 * @author stevenfranco
 * 
 * 
 
 */
@Mapper(componentModel = "spring")
public interface CategoryMap {
    
    public List<CategoryDTO> mappAllCategoryToCategoryDTOs(List<Category> category);
    public CategoryDTO mapCategoryToDTO(Category category);
    
}
