/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.airanfranco.notes_app.DTO;

import java.util.Date;
import lombok.Data;

/**
 *
 * @author stevenfranco
 */
@Data
public class NotesDTO {
    
    	private Long id;  
	private String title;
	private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Date getLastedited() {
        return lastedited;
    }

    public void setLastedited(Date lastedited) {
        this.lastedited = lastedited;
    }
	private Boolean active;
	private Long userid;
	private Date lastedited;
    
}
