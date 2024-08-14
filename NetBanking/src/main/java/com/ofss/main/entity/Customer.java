package com.ofss.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    private String customerId;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String panNumber;
    private String addressLineOne;
    private String addressLineTwo;
    private String addressLineThree;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private String cell;
    private String email;
    private int unsuccessfulLoginAttempts;
    private String status;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    @OneToMany(mappedBy = "customerId")
    private Set<LoginAttempt> loginAttempts;
}
