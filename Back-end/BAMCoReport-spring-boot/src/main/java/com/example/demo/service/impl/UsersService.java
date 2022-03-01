package com.example.demo.service.impl;


import com.example.demo.dto.UsersDTO;
import com.example.demo.repository.UsersRepository;
import com.example.demo.entities.Users;
import com.example.demo.service.IUsersService;
import com.example.demo.service.generic.ServiceGenericImpl;
import org.aspectj.bridge.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService extends ServiceGenericImpl<Users, UsersDTO>  {

    public UsersRepository userRepository;
    private static final Class<Users> entityClass = Users.class;
    private static final Class<UsersDTO> dtoClass = UsersDTO.class;
    public UsersService() {
        super( entityClass, dtoClass);
    }


}
