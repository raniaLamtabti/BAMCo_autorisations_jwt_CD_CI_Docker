package com.example.demo.controller;

import com.example.demo.controller.generic.ControllerGenericImpl;
import com.example.demo.dto.UserMembershipDTO;
import com.example.demo.entities.UserMembership;
import com.example.demo.service.generic.ServiceGeneric;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/UserMembership")
public class UserMembershipController extends ControllerGenericImpl<UserMembership, UserMembershipDTO> {
    protected UserMembershipController(ServiceGeneric<UserMembership, UserMembershipDTO> genericService) {
        super(genericService);
    }
}