package com.homework.hansol.service;


import com.homework.hansol.model.Employee;


import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    boolean insertEmployee(Employee employee) throws Exception;

    List<Employee> getEmployeeList();

    Optional<Employee> getEmployeeById(Long id);

    void updateEmployee(Long id, String name, String position, String company, String telephone, String task_name, String sort);

    void deleteEmployee(Long id);



}
