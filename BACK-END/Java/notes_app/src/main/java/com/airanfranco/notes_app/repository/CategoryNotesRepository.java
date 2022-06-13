/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.airanfranco.notes_app.repository;

import com.airanfranco.notes_app.model.CategoryNotes;
import com.airanfranco.notes_app.repository.iRepository.ICategoryNotesRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author stevenfranco
 */
@Repository
public class CategoryNotesRepository {
    
    @Autowired
    private ICategoryNotesRepository categoryNotesRepository;

    public List<CategoryNotes> findCategoryNotess(){
        System.out.println("Aca");
        //System.out.println(categoryNotesRepository.findAll());
        return categoryNotesRepository.findAll();
    }


    public Optional<CategoryNotes> findCategoryNotesById(Long id){
        return categoryNotesRepository.findById(id);
    }

    public CategoryNotes saveCategoryNotes (CategoryNotes categoryNotes) {
        return categoryNotesRepository.save(categoryNotes);
    }


    public void deleteCategoryNotesById(Long id){
        categoryNotesRepository.deleteById(id);
    }
    
}
