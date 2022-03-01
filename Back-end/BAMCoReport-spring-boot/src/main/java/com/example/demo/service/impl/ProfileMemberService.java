package com.example.demo.service.impl;


import com.example.demo.dto.ProfileMemberDTO;
import com.example.demo.entities.ProfileMember;
import com.example.demo.service.IProfileMemberService;
import com.example.demo.service.generic.ServiceGenericImpl;
import org.springframework.stereotype.Service;

@Service
public class ProfileMemberService extends ServiceGenericImpl<ProfileMember, ProfileMemberDTO> implements IProfileMemberService {


    private static final Class<ProfileMember> entityClass = ProfileMember.class;
    private static final Class<ProfileMemberDTO> dtoClass = ProfileMemberDTO.class;


    public ProfileMemberService() {
        super( entityClass, dtoClass);
    }
}
