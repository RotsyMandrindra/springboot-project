package com.example.finalexam.entity;

import lombok.*;

import java.time.LocalDateTime;
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@ToString
public class Client {
    private int idClient;
    private String clientFullname;
    private String address;
    private String emailAddress;
    private String phoneNumber;
    private LocalDateTime birthdate;
    private char gender;
    private String occupation;
}
