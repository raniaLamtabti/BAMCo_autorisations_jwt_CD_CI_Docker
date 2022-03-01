package com.example.demo.dto;


import com.example.demo.entities.Groups;
import com.example.demo.entities.Role;
import com.example.demo.entities.Users;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel("$table.tableComment")
public class ProfileMemberDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;

    private Users userId;
    private Role roleId;
    private Groups groupId;
    private Long profileId;

}
