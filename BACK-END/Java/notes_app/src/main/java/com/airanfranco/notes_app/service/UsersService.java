/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.airanfranco.notes_app.service;

import com.airanfranco.notes_app.DTO.UsersDTO;
import com.airanfranco.notes_app.mapper.UsersMap;
import com.airanfranco.notes_app.model.Users;
import com.airanfranco.notes_app.repository.UsersRepository;
import java.util.List;
import com.airanfranco.notes_app.service.iService.IUsersService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author stevenfranco
 */
@Service
public class UsersService implements IUsersService {
    
    
    @Autowired
    private UsersRepository usersRepository;
    @Autowired
    private UsersMap usersMap;


    @Override
    public List<UsersDTO> findAllUserss() {
        return usersMap.mappAllUsersToUsersDTOs(usersRepository.findUserss());
    }

    public Optional<UsersDTO> findUsersById(Long id){
        Optional<Users> oUsers = usersRepository.findUsersById(id);
        return Optional.of(usersMap.mapUsersToDTO(oUsers.get()));
    }

    @Override
    public UsersDTO updateUsers(UsersDTO usersDTO, Long id){
        
        Optional<Users> oUsers = usersRepository.findUsersById(id);
        if (oUsers.isPresent()) {
            
            if (usersDTO.getUsername()!= null) {
                oUsers.get().setUsername(usersDTO.getUsername());
            }
            
            if (usersDTO.getFirstname()!= null) {
                oUsers.get().setFirstname(usersDTO.getFirstname());
            }
                    
            if (usersDTO.getLastname()!= null) {
                oUsers.get().setLastname(usersDTO.getLastname());
            }
            
            if (usersDTO.getPassword()!= null) {
                oUsers.get().setPassword(usersDTO.getPassword());
            }
            
            if (usersDTO.getEmail()!= null) {
                oUsers.get().setEmail(usersDTO.getEmail());
            }
            
            return usersMap.mapUsersToDTO(usersRepository.saveUsers(oUsers.get())) ;
        }
        return null;			
    }

    @Override
    public UsersDTO deleteUsersById(Long id) {
        Optional<Users> usersDeleted = usersRepository.findUsersById(id);
        if(usersDeleted.isPresent()) {
            usersRepository.deleteUsersById(id);
            return usersMap.mapUsersToDTO(usersDeleted.get());
            }
        return null;
    }

    @Override
    public Users saveUsers(Users users) {
        usersRepository.saveUsers(users);
        return users;
    }
    
}
