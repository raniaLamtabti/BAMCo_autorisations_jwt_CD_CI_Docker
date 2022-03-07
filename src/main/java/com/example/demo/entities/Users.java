package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor @AllArgsConstructor
public class Users implements Serializable {
    @Id
    @SequenceGenerator(name = "user_seq", sequenceName = "user_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    private Long id;

    private String username;

    private String password;

    private String firstName;

    private String lastName;

    private String title;

    private String jobTitle;

    @OneToMany(mappedBy = "user")
    Set<UserMembership> user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "managerUserId")
    private Users managerUserId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "createdBy")
    private Users createdBy;

    @CreationTimestamp
    private LocalDate createdDate;

    @UpdateTimestamp
    private LocalDate lastUpdate;




}
