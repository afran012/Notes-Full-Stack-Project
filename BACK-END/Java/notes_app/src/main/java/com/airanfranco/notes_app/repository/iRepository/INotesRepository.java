/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.airanfranco.notes_app.repository.iRepository;

import com.airanfranco.notes_app.model.Notes;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author stevenfranco
 */
public interface INotesRepository extends JpaRepository<Notes,Long> {
    
}
