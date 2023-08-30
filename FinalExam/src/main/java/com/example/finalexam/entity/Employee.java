package com.example.finalexam.entity;

import lombok.*;

import java.time.LocalDateTime;
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@ToString
public class Employee {
    private int idEmployee;
    private String employeeFullname;
    private String position;
    private float salary;
    private String address;
    private String emailAddress;
    private String phoneNumber;
    private LocalDateTime birthdate;
    private char gender;

}
