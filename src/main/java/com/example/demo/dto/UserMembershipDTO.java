package com.example.demo.dto;


import com.example.demo.entities.Groups;
import com.example.demo.entities.Role;
import com.example.demo.entities.Users;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@ApiModel("$table.tableComment")
public class UserMembershipDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;

    private Users user;
    private Role role;
    private Groups group;
    private Users assignedBy;
    private LocalDateTime assignedDate;
    private Long assignedById;
    private Long groupId;
    private Long roleId;
    private Long userId;

}
