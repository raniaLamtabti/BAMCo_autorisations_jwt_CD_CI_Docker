package com.example.demo.dto;


import com.example.demo.entities.Users;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@ApiModel("$table.tableComment")
public class RoleDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;

    private String name;
    private Long createdById;
    private String displayName;
    private String description;
    private Users createdBy;
    private LocalDate creationDate;
    private LocalDate lastUpdate;
}
