/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.airanfranco.notes_app.service.iService;

import com.airanfranco.notes_app.DTO.UsersDTO;
import com.airanfranco.notes_app.model.Users;
import java.util.List;

/**
 *
 * @author stevenfranco
 */
public interface IUsersService {
    
    public List<UsersDTO> findAllUserss();
    public UsersDTO updateUsers(UsersDTO usersDTO, Long id);
    public UsersDTO deleteUsersById(Long id);
    public Users saveUsers(Users users);
    
}
