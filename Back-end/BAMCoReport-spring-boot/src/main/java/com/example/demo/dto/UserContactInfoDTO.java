package com.example.demo.dto;


import com.example.demo.entities.Users;
import lombok.Data;

import java.io.Serializable;

@Data
public class UserContactInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;

    private Users userId;

    private String email;
    private String phone;
    private String mobile;
    private String fax;
    private String building;
    private String room;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String country;
    private String website;
    private boolean personal;

    public Boolean getPersonal() {
        return this.personal;
    }
}
