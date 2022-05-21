package com.homework.hansol.mapper;


import com.homework.hansol.model.Employee;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@Mapper
public interface EmployeeMapper {

    boolean insertEmployee(Employee employee);

    @Select("select * from employee")
    List<Employee> findAll();

    @Select("select * from employee where id = ")
    Optional<Employee> selectEmployeeById(Long id);

    @Update("update employee")
    void updateEmployee(Employee employee);

    @Delete("delete employee where id = ")
    void deleteEmployee(Long employee);




}
