package com.example.demo.service.impl;


import com.example.demo.dto.UserMembershipDTO;
import com.example.demo.entities.UserMembership;
import com.example.demo.service.IUserMembershipService;
import com.example.demo.service.generic.ServiceGenericImpl;
import org.springframework.stereotype.Service;

@Service
public class UserMembershipService extends ServiceGenericImpl<UserMembership, UserMembershipDTO> implements IUserMembershipService {

    private static final Class<UserMembership> entityClass = UserMembership.class;
    private static final Class<UserMembershipDTO> dtoClass = UserMembershipDTO.class;
    public UserMembershipService() {
        super( entityClass, dtoClass);
    }
}
