/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.airanfranco.notes_app.service;

import com.airanfranco.notes_app.DTO.CategoryNotesDTO;
import com.airanfranco.notes_app.model.CategoryNotes;
import com.airanfranco.notes_app.mapper.CategoryNotesMap;
import com.airanfranco.notes_app.repository.CategoryNotesRepository;
import com.airanfranco.notes_app.service.iService.ICategoryNotesService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author stevenfranco
 */
@Service
public class CategoryNotesService implements ICategoryNotesService {
    
    @Autowired
    private CategoryNotesRepository categoryNotesRepository;
    @Autowired
    private CategoryNotesMap categoryNotesMap;


    @Override
    public List<CategoryNotesDTO> findAllCategoryNotess() {
        return categoryNotesMap.mappAllCategoryNotesToCategoryNotesDTOs(categoryNotesRepository.findCategoryNotess());
    }

    public Optional<CategoryNotesDTO> findCategoryNotesById(Long id){
        Optional<CategoryNotes> oCategoryNotes = categoryNotesRepository.findCategoryNotesById(id);
        return Optional.of(categoryNotesMap.mapCategoryNotesToDTO(oCategoryNotes.get()));
    }

    @Override
    public CategoryNotesDTO updateCategoryNotes(CategoryNotesDTO categoryNotesDTO, Long id){
        
        Optional<CategoryNotes> oCategoryNotes = categoryNotesRepository.findCategoryNotesById(id);
        if (oCategoryNotes.isPresent()) {
            
            if (categoryNotesDTO.getCategoryid()!= null) {
                oCategoryNotes.get().setCategoryid(categoryNotesDTO.getCategoryid());
            }
            
            if (categoryNotesDTO.getNotesid()!= null) {
                oCategoryNotes.get().setNotesid(categoryNotesDTO.getNotesid());
            }

            return categoryNotesMap.mapCategoryNotesToDTO(categoryNotesRepository.saveCategoryNotes(oCategoryNotes.get())) ;
        }
        return null;			
    }

    @Override
    public CategoryNotesDTO deleteCategoryNotesById(Long id) {
        Optional<CategoryNotes> categoryNotesDeleted = categoryNotesRepository.findCategoryNotesById(id);
        if(categoryNotesDeleted.isPresent()) {
            categoryNotesRepository.deleteCategoryNotesById(id);
            return categoryNotesMap.mapCategoryNotesToDTO(categoryNotesDeleted.get());
            }
        return null;
    }

    @Override
    public CategoryNotes saveCategoryNotes(CategoryNotes categoryNotes) {
        categoryNotesRepository.saveCategoryNotes(categoryNotes);
        return categoryNotes;
    }
    
}
