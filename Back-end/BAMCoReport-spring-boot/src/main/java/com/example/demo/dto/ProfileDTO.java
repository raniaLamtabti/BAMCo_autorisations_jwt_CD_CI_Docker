package com.example.demo.dto;


import com.example.demo.entities.Users;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@ApiModel("$table.tableComment")
public class ProfileDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;

    private boolean isDefault;
    private String name;
    private Long createdById;
    private Long lastUpdatedById;
    private String description;
    private Boolean defaultField;
    private LocalDate creationDate;
    private Users createdBy;
    private LocalDate lastUpdate;
    private Users lastUpdatedBy;

}
