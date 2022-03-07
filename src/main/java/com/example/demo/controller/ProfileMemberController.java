package com.example.demo.controller;

import com.example.demo.controller.generic.ControllerGenericImpl;
import com.example.demo.dto.ProfileMemberDTO;
import com.example.demo.entities.ProfileMember;
import com.example.demo.service.generic.ServiceGeneric;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ProfileMember")
public class ProfileMemberController extends ControllerGenericImpl<ProfileMember, ProfileMemberDTO> {
    protected ProfileMemberController(ServiceGeneric<ProfileMember, ProfileMemberDTO> genericService) {
        super(genericService);
    }
}