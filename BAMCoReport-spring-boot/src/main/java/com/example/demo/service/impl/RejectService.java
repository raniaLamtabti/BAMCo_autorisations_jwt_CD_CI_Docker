package com.example.demo.service.impl;

import com.example.demo.dto.RejectDTO;
import com.example.demo.dto.RoleDTO;
import com.example.demo.entities.Reject;
import com.example.demo.entities.Role;
import com.example.demo.service.IRoleService;
import com.example.demo.service.generic.ServiceGenericImpl;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class RejectService extends ServiceGenericImpl<Reject, RejectDTO>  {


    private static final Class<Reject> entityClass = Reject.class;
    private static final Class<RejectDTO> dtoClass = RejectDTO.class;

    public RejectService() {
        super(entityClass, dtoClass);
    }


}
