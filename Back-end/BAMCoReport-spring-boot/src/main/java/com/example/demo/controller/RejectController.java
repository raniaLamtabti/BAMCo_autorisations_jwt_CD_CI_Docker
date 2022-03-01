package com.example.demo.controller;

import com.example.demo.controller.generic.ControllerGenericImpl;
import com.example.demo.dto.RejectDTO;
import com.example.demo.entities.Reject;
import com.example.demo.service.generic.ServiceGeneric;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/Reject") @Slf4j
public class RejectController extends ControllerGenericImpl<Reject, RejectDTO> {

    protected RejectController(ServiceGeneric<Reject, RejectDTO> genericService) {
        super(genericService);
    }

}
