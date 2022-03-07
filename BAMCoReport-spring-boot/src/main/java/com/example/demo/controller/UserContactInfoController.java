package com.example.demo.controller;

import com.example.demo.controller.generic.ControllerGenericImpl;
import com.example.demo.dto.UserContactInfoDTO;
import com.example.demo.entities.UserContactInfo;
import com.example.demo.service.generic.ServiceGeneric;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/UserContactInfo")
public class UserContactInfoController extends ControllerGenericImpl<UserContactInfo, UserContactInfoDTO> {
    protected UserContactInfoController(ServiceGeneric<UserContactInfo, UserContactInfoDTO> genericService) {
        super(genericService);
    }
}