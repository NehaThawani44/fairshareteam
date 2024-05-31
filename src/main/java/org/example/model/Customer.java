package org.example.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="customers")
@Getter
@Setter
@NoArgsConstructor
public class Customer {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Id Long id;
    //condition

    private Long coupleId;
    private Integer age;
    //condition
    private Boolean isEmployed;
    private Boolean pensionPlan;
    private Integer workingHours;
    //Condition
    private Boolean maritalStatus;













}
