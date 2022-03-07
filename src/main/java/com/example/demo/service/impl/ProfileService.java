package com.example.demo.service.impl;


import com.example.demo.dto.ProfileDTO;
import com.example.demo.entities.Profile;
import com.example.demo.service.IProfileService;
import com.example.demo.service.generic.ServiceGenericImpl;
import org.springframework.stereotype.Service;

@Service
public class ProfileService extends ServiceGenericImpl<Profile, ProfileDTO> implements IProfileService {


    private static final Class<ProfileDTO> dtoClass = ProfileDTO.class;
    private static final Class<Profile> entityClass = Profile.class;


    public ProfileService() {
        super( entityClass, dtoClass);
    }
}


