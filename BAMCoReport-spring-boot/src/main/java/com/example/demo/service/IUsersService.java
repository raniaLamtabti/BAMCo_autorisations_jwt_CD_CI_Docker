package com.example.demo.service;

import com.example.demo.dto.UsersDTO;
import com.example.demo.entities.Users;
import com.example.demo.service.generic.ServiceGeneric;

import java.util.Optional;

public interface IUsersService extends ServiceGeneric<Users, UsersDTO> {
    Users save(Users user);
}
