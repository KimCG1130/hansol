package com.homework.hansol.service.impl;


import com.homework.hansol.mapper.EmployeeMapper;
import com.homework.hansol.model.Employee;
import com.homework.hansol.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;


@Service
public class EmployeeServiceImpl implements EmployeeService {


    private final EmployeeMapper employeeMapper;

    @Autowired
    public EmployeeServiceImpl(EmployeeMapper employeeMapper) {

        this.employeeMapper = employeeMapper;
    }

    public boolean insertEmployee(Employee employee) {
        return this.employeeMapper.insertEmployee(employee);
    }


    public List<Employee> getEmployeeList() {

        return employeeMapper.getEmployeeList();
    }

    @Override
    public Optional<Employee> getEmployeeById(Long id) {

        return employeeMapper.selectEmployeeById(id);

    }


    @Override
    public void updateEmployee(Long id, String name, String position, String company, String telephone, String task_name, String sort) {

        final Employee employee = employeeMapper.selectEmployeeById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "employee can't found"));

        employee.setName(name);
        employee.setPosition(position);
        employee.setCompany(company);
        employee.setTelephone(telephone);
        employee.setTask_name(task_name);
        employee.setSort(sort);

        employeeMapper.updateEmployee(employee);
    }



    @Override
    public void deleteEmployee(Long id) {

        employeeMapper.deleteEmployee(id);
    }

}
