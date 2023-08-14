--create a database
CREATE DATABASE apartment_managing;

--connect to the 
\c apartment_managing

--create table
CREATE TABLE apartment(
    id_apartment serial primary key,
    apartment_number int not null,
    area float not null,
    monthly_rent float not null,
    location varchar(200) not null,
    availability_status boolean not null,
    date_added date not null,
    description varchar(200) not null
);

CREATE TABLE client(
    id_client serial primary key,
    client_fullname varchar(200) not null,
    address varchar(200) not null,
    email_address varchar(200) not null,
    phone_number varchar(20) not null,
    birthdate date not null,
    gender char(1) not null,
    occupation varchar(50) not null
);

CREATE TABLE rent(
    id_rent serial primary key,
    id_apartment_rent int REFERENCES apartment(id_apartment) not null,
    id_client_rent int REFERENCES client(id_client) not null
);

CREATE TABLE rental_contract(
    id_contract serial primary key,
    start_date_rental date not null,
    end_date_rental date not null,
    rent_amount float not null,
    securit_deposit boolean not null,
    payment_status boolean not null,
    payment_method varchar(50) not null,
    id_client_rentale_contract int REFERENCES client(id_client),
    id_apartment_rental_contract int REFERENCES apartment(id_apartment),
    id_employee_rental_contract int REFERENCES employee(id_employee)
);

CREATE TABLE employee(
    id_employee serial primary key,
    employee_fullname varchar(200) not null,
    position varchar(50) not null,
    salary float not null,
    address varchar(200) not null,
    email_address varchar(200) not null,
    phone_number varchar(50) not null,
    birthdate date not null,
    gender char(5) not null
);

CREATE TABLE be_in_charge_of(
    id_be_in_charge_of serial primary key,
    id_apartment_be_in_charge_of int REFERENCES apartment(id_apartment) not null,
    id_employee_be_in_charge_of int REFERENCES employee(id_employee) not null
);