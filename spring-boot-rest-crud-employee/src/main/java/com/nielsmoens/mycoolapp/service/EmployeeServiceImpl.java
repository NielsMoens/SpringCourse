package com.nielsmoens.mycoolapp.service;

import com.nielsmoens.mycoolapp.dao.EmployeeDAO;
import com.nielsmoens.mycoolapp.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(final EmployeeDAO theEmployeeDAO) {
        employeeDAO = theEmployeeDAO;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    public Employee findById(final int theId) {
        return employeeDAO.findById(theId);
    }

    @Transactional
    @Override
    public Employee save(final Employee theEmployee) {
        return employeeDAO.save(theEmployee);
    }

    @Transactional
    @Override
    public void deleteById(final int theId) {
        employeeDAO.deleteById(theId);
    }
}






