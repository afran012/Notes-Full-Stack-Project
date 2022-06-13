/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.airanfranco.notes_app.controller;

import com.airanfranco.notes_app.DTO.UsersDTO;
import com.airanfranco.notes_app.model.Users;
import com.airanfranco.notes_app.repository.iRepository.IUsersRepository;
import com.airanfranco.notes_app.service.UsersService;
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
@RequestMapping("api/users")
public class UsersController {
    
    @Autowired
    private UsersService usersService;
    
    @Autowired
    public IUsersRepository iUsersRepository;
    
    @GetMapping
    public List<UsersDTO> findAllUserss(){
            System.out.println("controller");
            //System.out.println(usersService.findAllUserss());
        return usersService.findAllUserss();
    }
    
    @GetMapping("/{id}")
    public Optional<UsersDTO> findUsersById(@PathVariable("id") Long id){
        return usersService.findUsersById(id);
    }
    
    @PutMapping("/{id}")
    public UsersDTO updateUsers(@RequestBody UsersDTO usersDTO,@PathVariable("id") Long id){
        System.out.println(usersDTO);
        return usersService.updateUsers(usersDTO , id);
    }
    
    @DeleteMapping("/{id}")
    public UsersDTO deleteUsers(@PathVariable("id") Long id){
        return usersService.deleteUsersById(id);
    }
    
    @PostMapping("")
    public Users saveUsers(@RequestBody Users users) {
        System.out.println(users);
        usersService.saveUsers(users);
        return users;
    }
    
}
