/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.airanfranco.notes_app.model;

import java.io.Serializable;
import java.util.Date;
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
@Table(name="notes")
@Data
public class Notes implements Serializable{
    
        @Id
	@Column(name="notesid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;  
	@Column(name="title")
	private String title;

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

	@Column(name="content")
	private String content;
        @Column(name="active")
	private Boolean active;
	@Column(name="userid")
	private Long userid;
        @Column(name="lastedited")
	private Date lastedited;

    public Date getLastedited() {
        return lastedited;
    }

    public void setLastedited(Date lastedited) {
        this.lastedited = lastedited;
    }
    
}
