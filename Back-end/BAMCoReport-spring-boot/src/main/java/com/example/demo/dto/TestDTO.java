package com.example.demo.dto;


import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

@Data
@ApiModel("$table.tableComment")
public class TestDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private Date creationDate;
    private Date lastUpdate;

    private String name;

}
