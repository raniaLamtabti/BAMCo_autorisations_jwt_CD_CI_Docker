package com.example.demo.controller;

import com.example.demo.controller.generic.ControllerGenericImpl;
import com.example.demo.dto.ProfileDTO;
import com.example.demo.entities.Profile;
import com.example.demo.service.generic.ServiceGeneric;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/Profile")
public class ProfileController extends ControllerGenericImpl<Profile, ProfileDTO> {
    protected ProfileController(ServiceGeneric<Profile, ProfileDTO> genericService) {
        super(genericService);
    }
}