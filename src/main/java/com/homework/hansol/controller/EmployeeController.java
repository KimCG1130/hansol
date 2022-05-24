package com.homework.hansol.controller;

import com.homework.hansol.model.Employee;
import com.homework.hansol.service.EmployeeService;
import io.swagger.annotations.Api;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/hansol")
@Api(tags = {"Test API"})
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;


    @GetMapping
    public List<Employee> getEmployeeList() {
        return employeeService.getEmployeeList();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getEmployee(@PathVariable Long id) {

        final Optional<Employee> employee = employeeService.getEmployeeById(id);

        return ResponseEntity.ok(employee);


    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateEmployee(@PathVariable Long id, @RequestBody EmployeeDto request) {

        employeeService.updateEmployee(id, request.getName(), request.getPosition(), request.getCompany(), request.getTelephone(), request.getTask_name(), request.sort);

        return ResponseEntity.noContent().build();
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable Long id) {

        employeeService.deleteEmployee(id);

        return ResponseEntity.noContent().build();
    }



    @Getter
    static class EmployeeDto {

        private String name;
        private String position;
        private String company;
        private String telephone;
        private String task_name;
        private String sort;
    }


}

