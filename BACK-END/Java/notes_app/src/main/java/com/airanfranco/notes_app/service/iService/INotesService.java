/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.airanfranco.notes_app.service.iService;

import com.airanfranco.notes_app.DTO.NotesDTO;
import com.airanfranco.notes_app.model.Notes;
import java.util.List;

/**
 *
 * @author stevenfranco
 */
public interface INotesService {
    
    public List<NotesDTO> findAllNotess();
    public NotesDTO updateNotes(NotesDTO notesDTO, Long id);
    public NotesDTO deleteNotesById(Long id);
    public Notes saveNotes(Notes notes);
    
}
