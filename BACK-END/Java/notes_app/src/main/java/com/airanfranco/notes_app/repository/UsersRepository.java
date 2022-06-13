/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.airanfranco.notes_app.repository;

import com.airanfranco.notes_app.model.Users;
import com.airanfranco.notes_app.repository.iRepository.IUsersRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author stevenfranco
 */
@Repository
public class UsersRepository {
    
    @Autowired
    private IUsersRepository usersRepository;

    public List<Users> findUserss(){
        System.out.println("Aca");
        //System.out.println(usersRepository.findAll());
        return usersRepository.findAll();
    }


    public Optional<Users> findUsersById(Long id){
        return usersRepository.findById(id);
    }

    public Users saveUsers (Users users) {
        return usersRepository.save(users);
    }


    public void deleteUsersById(Long id){
        usersRepository.deleteById(id);
    }
    
}
