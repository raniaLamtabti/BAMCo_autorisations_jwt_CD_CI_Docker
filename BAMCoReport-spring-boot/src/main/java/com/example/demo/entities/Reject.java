package com.example.demo.entities;

import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Table(name = "reject")
@Entity @Data
public class Reject implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String flowType;
    private String rejectNature;
    private String entity;
    private LocalDate declarationDate;
    private String agencyCode;
    private Long userRegistrationNumber;
    private String bu;
    private String su;
    private String regionalDelegation;
    private String subDelegationType;
    private String subDelegationName;
    private Long cliFileCode;
    private Long clientCode;
    private Long  rib;
    private String gravity;
    private Long zoneCode;
    private boolean isWrongField;
    private String errorCode;
    private String errorLabel;
    private boolean isRequestTaken;
    private String actionDetail;
    @Column(nullable = true)
    private String file;

    @ManyToOne()
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "takenby", nullable = true)
    private Users takenBy;
}
