/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.airanfranco.notes_app.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author stevenfranco
 */

@Entity
@Table(name="categorynotes")
@Data
public class CategoryNotes implements Serializable{

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
    
        @Id
	@Column(name="categorynotesid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;  
	@Column(name="categoryid")
	private Long categoryid;
	@Column(name="notesid")
	private Long notesid;
        
    
}
