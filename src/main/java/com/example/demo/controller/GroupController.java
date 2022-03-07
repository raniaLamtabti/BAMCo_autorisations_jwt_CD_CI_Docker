package com.example.demo.controller;

import com.example.demo.controller.generic.ControllerGenericImpl;
import com.example.demo.dto.GroupsDTO;
import com.example.demo.entities.Groups;
import com.example.demo.service.generic.ServiceGeneric;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/Group")
public class GroupController extends ControllerGenericImpl<Groups, GroupsDTO> {
    protected GroupController(ServiceGeneric<Groups, GroupsDTO> genericService) {
        super(genericService);
    }
}