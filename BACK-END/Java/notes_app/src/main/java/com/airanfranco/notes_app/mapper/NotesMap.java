/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.airanfranco.notes_app.mapper;

import com.airanfranco.notes_app.DTO.NotesDTO;
import com.airanfranco.notes_app.model.Notes;
import java.util.List;
import org.mapstruct.Mapper;

/**
 *
 * @author stevenfranco
 */
@Mapper(componentModel = "spring")
public interface NotesMap {
    
    public List<NotesDTO> mappAllNotesToNotesDTOs(List<Notes> notes);
    public NotesDTO mapNotesToDTO(Notes notes);
    
}
