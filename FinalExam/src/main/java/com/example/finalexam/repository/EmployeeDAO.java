package com.example.finalexam.repository;

import com.example.finalexam.entity.Employee;
import com.example.finalexam.repository.EmployeeDAOInterface;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class EmployeeDAO implements EmployeeDAOInterface {

    private final Map<Integer, Employee> employeeMap = new HashMap<>();
    private int nextId = 1;

    @Override
    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employeeMap.values());
    }

    @Override
    public Employee getEmployeeById(int id) {
        return employeeMap.get(id);
    }

    @Override
    public void addEmployee(Employee employee) {
        employee.setIdEmployee(nextId++);
        employeeMap.put(employee.getIdEmployee(), employee);
    }

    @Override
    public void updateEmployee(int id, Employee updatedEmployee) {
        if (employeeMap.containsKey(id)) {
            updatedEmployee.setIdEmployee(id);
            employeeMap.put(id, updatedEmployee);
        }
    }

    @Override
    public void deleteEmployee(int id) {
        employeeMap.remove(id);
    }
}
