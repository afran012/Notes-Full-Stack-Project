/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.airanfranco.notes_app.DTO;

import lombok.Data;

/**
 *
 * @author stevenfranco
 */
@Data
public class CategoryNotesDTO {
    
    	private Long id;  
	private Long categoryid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Long categoryid) {
        this.categoryid = categoryid;
    }

    public Long getNotesid() {
        return notesid;
    }

    public void setNotesid(Long notesid) {
        this.notesid = notesid;
    }
	private Long notesid;
    
}
