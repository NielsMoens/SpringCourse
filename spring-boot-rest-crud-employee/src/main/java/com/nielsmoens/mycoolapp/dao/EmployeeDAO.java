package com.nielsmoens.mycoolapp.dao;


import com.nielsmoens.mycoolapp.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

}
