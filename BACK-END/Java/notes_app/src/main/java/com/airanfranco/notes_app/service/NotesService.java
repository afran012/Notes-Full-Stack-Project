/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.airanfranco.notes_app.service;

import com.airanfranco.notes_app.DTO.NotesDTO;
import com.airanfranco.notes_app.mapper.NotesMap;
import com.airanfranco.notes_app.model.Notes;
import com.airanfranco.notes_app.repository.NotesRepository;
import java.util.List;
import com.airanfranco.notes_app.service.iService.INotesService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author stevenfranco
 */
@Service
public class NotesService implements INotesService {
    
    @Autowired
    private NotesRepository notesRepository;
    @Autowired
    private NotesMap notesMap;


    @Override
    public List<NotesDTO> findAllNotess() {
        return notesMap.mappAllNotesToNotesDTOs(notesRepository.findNotess());
    }

    public Optional<NotesDTO> findNotesById(Long id){
        Optional<Notes> oNotes = notesRepository.findNotesById(id);
        return Optional.of(notesMap.mapNotesToDTO(oNotes.get()));
    }

    @Override
    public NotesDTO updateNotes(NotesDTO notesDTO, Long id){
        
        Optional<Notes> oNotes = notesRepository.findNotesById(id);
        if (oNotes.isPresent()) {
            
            if (notesDTO.getContent()!= null) {
                oNotes.get().setContent(notesDTO.getContent());
            }
            
            if (notesDTO.getActive()!= null) {
                oNotes.get().setActive(notesDTO.getActive());
            }
                    
            if (notesDTO.getTitle() != null) {
                oNotes.get().setTitle(notesDTO.getTitle());
            }
            
            if (notesDTO.getUserid()!= null) {
                oNotes.get().setUserid(notesDTO.getUserid());
            }
            
            if (notesDTO.getLastedited()!= null) {
                oNotes.get().setLastedited(notesDTO.getLastedited());
            }
            

            return notesMap.mapNotesToDTO(notesRepository.saveNotes(oNotes.get())) ;
        }
        return null;			
    }

    @Override
    public NotesDTO deleteNotesById(Long id) {
        Optional<Notes> notesDeleted = notesRepository.findNotesById(id);
        if(notesDeleted.isPresent()) {
            notesRepository.deleteNotesById(id);
            return notesMap.mapNotesToDTO(notesDeleted.get());
            }
        return null;
    }

    @Override
    public Notes saveNotes(Notes notes) {
        notesRepository.saveNotes(notes);
        return notes;
    }
    
}
