package com.example.demo.controller;

import com.example.demo.controller.generic.ControllerGenericImpl;
import com.example.demo.dto.RoleDTO;
import com.example.demo.entities.Role;
import com.example.demo.service.generic.ServiceGeneric;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/Role")
public class RoleController extends ControllerGenericImpl<Role, RoleDTO> {
    protected RoleController(ServiceGeneric<Role, RoleDTO> genericService) {
        super(genericService);
    }
}