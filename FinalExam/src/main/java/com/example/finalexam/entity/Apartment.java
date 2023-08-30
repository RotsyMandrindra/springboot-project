package com.example.finalexam.entity;

import lombok.*;

import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Apartment {
    private int idApartment;
    private int apartmentNumber;
    private float area;
    private float monthlyRent;
    private String location;
    private boolean availabilityStatus;
    private LocalDateTime dateAdded;
    private String description;
}
