package com.example.demo.dto;


import com.example.demo.entities.UserContactInfo;
import com.example.demo.entities.Users;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;

@Data
@ApiModel("$table.tableComment")
public class UsersDTO implements Serializable {
    private static final long serialVersionUID = 1L;
/*
    private UserContactInfo userContactInfo;
    private boolean enabled;
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private String title;
    private String jobTitle;
    private Users managerUserId;
    private Users createdBy;

 */

    //private UserContactInfo userContactInfo;


    private String firstName;
    private String jobTitle;
    private String lastName;
    private String password;
    private String title;
    private String username;
    private Long createdBy;
    private Long managerUserId;


}
