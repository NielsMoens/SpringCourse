package com.nielsmoens.mycoolapp.service;

import com.nielsmoens.mycoolapp.entity.Employee;
import jakarta.transaction.Transactional;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    @Transactional
    Employee save(Employee theEmployee);

    @Transactional
    void deleteById(int theId);
}
