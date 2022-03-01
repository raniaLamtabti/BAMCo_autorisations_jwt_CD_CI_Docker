package com.example.demo.dto;


import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

@Data
public class RejectDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;

    private Long rib;

    private String actionDetail;

    private String agencyCode;

    private String bu;

    private Long cliFileCode;

    private Long clientCode;

    private Date declarationDate;

    private String entity;

    private String errorCode;

    private String errorLabel;

    private String file;

    private String flowType;

    private String gravity;

    private Boolean requestTaken;

    private Boolean wrongField;

    private String regionalDelegation;

    private String rejectNature;

    private String su;

    private String subDelegationName;

    private String subDelegationType;

    private Long userRegistrationNumber;

    private Long zoneCode;

    private Long takenby;

}
