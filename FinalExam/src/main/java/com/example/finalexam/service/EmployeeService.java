package com.example.finalexam.service;

import com.example.finalexam.entity.Employee;
import com.example.finalexam.repository.EmployeeDAOInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements EmployeeServiceInterface {

    private final EmployeeDAOInterface employeeDAO;

    @Autowired
    public EmployeeService(EmployeeDAOInterface employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    @Override
    public Employee getEmployeeById(int id) {
        return employeeDAO.getEmployeeById(id);
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeDAO.addEmployee(employee);
    }

    @Override
    public void updateEmployee(int id, Employee employee) {
        employeeDAO.updateEmployee(id, employee);
    }

    @Override
    public void deleteEmployee(int id) {
        employeeDAO.deleteEmployee(id);
    }
}
