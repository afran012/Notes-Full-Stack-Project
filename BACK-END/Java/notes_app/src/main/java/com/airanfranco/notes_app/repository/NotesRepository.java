/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.airanfranco.notes_app.repository;

import com.airanfranco.notes_app.model.Notes;
import com.airanfranco.notes_app.repository.iRepository.INotesRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author stevenfranco
 */
@Repository
public class NotesRepository {
    
    @Autowired
    private INotesRepository notesRepository;

    public List<Notes> findNotess(){
        System.out.println("Aca");
        //System.out.println(notesRepository.findAll());
        return notesRepository.findAll();
    }


    public Optional<Notes> findNotesById(Long id){
        return notesRepository.findById(id);
    }

    public Notes saveNotes (Notes notes) {
        return notesRepository.save(notes);
    }


    public void deleteNotesById(Long id){
        notesRepository.deleteById(id);
    }
    
}
