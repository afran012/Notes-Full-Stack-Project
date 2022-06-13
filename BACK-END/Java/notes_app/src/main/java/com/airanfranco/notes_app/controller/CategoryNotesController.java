/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.airanfranco.notes_app.controller;

import com.airanfranco.notes_app.DTO.CategoryNotesDTO;
import com.airanfranco.notes_app.model.CategoryNotes;
import com.airanfranco.notes_app.repository.iRepository.ICategoryNotesRepository;
import com.airanfranco.notes_app.service.CategoryNotesService;
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
@RequestMapping("api/categorynotes")
public class CategoryNotesController {
    
    

    @Autowired
    private CategoryNotesService categoryNotesService;
    
    @Autowired
    public ICategoryNotesRepository iCategoryNotesRepository;
    
    @GetMapping
    public List<CategoryNotesDTO> findAllCategoryNotess(){
            System.out.println("controller");
            //System.out.println(categoryNotesService.findAllCategoryNotess());
        return categoryNotesService.findAllCategoryNotess();
    }
    
    @GetMapping("/{id}")
    public Optional<CategoryNotesDTO> findCategoryNotesById(@PathVariable("id") Long id){
        return categoryNotesService.findCategoryNotesById(id);
    }
    
    @PutMapping("/{id}")
    public CategoryNotesDTO updateCategoryNotes(@RequestBody CategoryNotesDTO categoryNotesDTO,@PathVariable("id") Long id){
        System.out.println(categoryNotesDTO);
        return categoryNotesService.updateCategoryNotes(categoryNotesDTO , id);
    }
    
    @DeleteMapping("/{id}")
    public CategoryNotesDTO deleteCategoryNotes(@PathVariable("id") Long id){
        return categoryNotesService.deleteCategoryNotesById(id);
    }
    
    @PostMapping("")
    public CategoryNotes saveCategoryNotes(@RequestBody CategoryNotes categoryNotes) {
        System.out.println(categoryNotes);
        categoryNotesService.saveCategoryNotes(categoryNotes);
        return categoryNotes;
    }
    
}
