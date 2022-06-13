/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.airanfranco.notes_app.mapper;

import com.airanfranco.notes_app.DTO.CategoryNotesDTO;
import com.airanfranco.notes_app.model.CategoryNotes;
import java.util.List;
import org.mapstruct.Mapper;

/**
 *
 * @author stevenfranco
 */
@Mapper(componentModel = "spring")
public interface CategoryNotesMap {
    
    public List<CategoryNotesDTO> mappAllCategoryNotesToCategoryNotesDTOs(List<CategoryNotes> categoryNotes);
    public CategoryNotesDTO mapCategoryNotesToDTO(CategoryNotes categoryNotes);

}
