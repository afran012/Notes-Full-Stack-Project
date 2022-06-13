/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.airanfranco.notes_app.mapper;

import com.airanfranco.notes_app.DTO.UsersDTO;
import com.airanfranco.notes_app.model.Users;
import java.util.List;
import org.mapstruct.Mapper;

/**
 *
 * @author stevenfranco
 */
@Mapper(componentModel = "spring")
public interface UsersMap {
    
    public List<UsersDTO> mappAllUsersToUsersDTOs(List<Users> users);
    public UsersDTO mapUsersToDTO(Users users);
    
}
