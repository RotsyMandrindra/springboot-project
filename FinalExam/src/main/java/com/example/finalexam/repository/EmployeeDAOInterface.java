package com.example.finalexam.repository;

import com.example.finalexam.entity.Employee;

import java.util.List;

public interface EmployeeDAOInterface {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(int id);
    void addEmployee(Employee employee);
    void updateEmployee(int id, Employee employee);
    void deleteEmployee(int id);
}
