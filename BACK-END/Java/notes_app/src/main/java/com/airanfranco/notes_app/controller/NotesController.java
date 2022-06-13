/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.airanfranco.notes_app.controller;

import com.airanfranco.notes_app.DTO.NotesDTO;
import com.airanfranco.notes_app.model.Notes;
import com.airanfranco.notes_app.repository.iRepository.INotesRepository;
import com.airanfranco.notes_app.service.NotesService;
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
@RequestMapping("api/notes")
public class NotesController {
    

    @Autowired
    private NotesService notesService;
    
    @Autowired
    public INotesRepository iNotesRepository;
    
    @GetMapping
    public List<NotesDTO> findAllNotess(){
            System.out.println("controller");
            //System.out.println(notesService.findAllNotess());
        return notesService.findAllNotess();
    }
    
    @GetMapping("/{id}")
    public Optional<NotesDTO> findNotesById(@PathVariable("id") Long id){
        return notesService.findNotesById(id);
    }
    
    @PutMapping("/{id}")
    public NotesDTO updateNotes(@RequestBody NotesDTO notesDTO,@PathVariable("id") Long id){
        System.out.println(notesDTO);
        return notesService.updateNotes(notesDTO , id);
    }
    
    @DeleteMapping("/{id}")
    public NotesDTO deleteNotes(@PathVariable("id") Long id){
        return notesService.deleteNotesById(id);
    }
    
    @PostMapping("")
    public Notes saveNotes(@RequestBody Notes notes) {
        System.out.println(notes);
        notesService.saveNotes(notes);
        return notes;
    }
    
}
