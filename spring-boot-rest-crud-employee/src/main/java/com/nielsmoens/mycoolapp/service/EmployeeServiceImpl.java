package com.nielsmoens.mycoolapp.service;

import com.nielsmoens.mycoolapp.dao.EmployeeRepository;
import com.nielsmoens.mycoolapp.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(final EmployeeRepository EmployeeRepository) {
        employeeRepository = EmployeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(final int theId) {
        final Optional<Employee> result = employeeRepository.findById(theId);

        Employee theEmployee = null;
        if (result.isPresent()) {
            theEmployee = result.get();
        } else {
            // we didnt find the employee

            throw new RuntimeException("did not find employee id - " + theId);
        }

        return theEmployee;
    }

    @Override
    public Employee save(final Employee theEmployee) {
        return employeeRepository.save(theEmployee);
    }


    @Override
    public void deleteById(final int theId) {
        employeeRepository.deleteById(theId);
    }
}






