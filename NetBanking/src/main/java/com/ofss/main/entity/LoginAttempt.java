package com.ofss.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginAttempt {
    @Id
    private String id;
    private Timestamp timestamp;
    private String attemptStatus;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customerId;
}
