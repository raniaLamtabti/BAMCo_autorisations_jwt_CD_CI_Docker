package com.example.demo.service.impl;


import com.example.demo.dto.GroupsDTO;
import com.example.demo.entities.Groups;
import com.example.demo.service.IGroupsService;
import com.example.demo.service.generic.ServiceGenericImpl;
import org.springframework.stereotype.Service;

@Service
public class GroupsService extends ServiceGenericImpl<Groups, GroupsDTO> implements IGroupsService {


    private static final Class<Groups> entityClass = Groups.class;
    private static final Class<GroupsDTO> dtoClass = GroupsDTO.class;


    public GroupsService() {
        super( entityClass, dtoClass);
    }
}
