/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.airanfranco.notes_app.service.iService;

import com.airanfranco.notes_app.DTO.CategoryNotesDTO;
import com.airanfranco.notes_app.model.CategoryNotes;
import java.util.List;

/**
 *
 * @author stevenfranco
 */
public interface ICategoryNotesService {
    
    public List<CategoryNotesDTO> findAllCategoryNotess();
    public CategoryNotesDTO updateCategoryNotes(CategoryNotesDTO categoryNotesDTO, Long id);
    public CategoryNotesDTO deleteCategoryNotesById(Long id);
    public CategoryNotes saveCategoryNotes(CategoryNotes categoryNotes);
    
}
