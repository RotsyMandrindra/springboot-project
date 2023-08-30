package com.example.finalexam.entity;

import lombok.*;

import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RentalContract {
    private int idContract;
    private LocalDateTime startDateRental;
    private LocalDateTime endDateRental;
    private float rentAmount;
    private boolean securityDeposit;
    private boolean paymentStatus;
    private String paymentMethod;
    private int idClientRentalContract;
    private int idApartmentRentalContract;
    private int idEmployeeRentalContract;
}
