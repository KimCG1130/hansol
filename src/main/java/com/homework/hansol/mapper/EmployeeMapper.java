package com.homework.hansol.mapper;


import com.homework.hansol.model.Employee;
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
    List<Employee> getEmployeeList();

    @Select("select * from employee where employee_id = #{id}")
    Optional<Employee> selectEmployeeById(Long id);

    @Update("UPDATE employee " +
            "SET name=#{name}, position=#{position}, company=#{company}, telephone=#{telephone},task_name=#{task_name}, sort=#{sort}"+
            "WHERE EMPLOYEE_ID = #{id}")
    void updateEmployee(Employee employee);

    @Select("delete from employee where employee_id = #{id}")
    void deleteEmployee(Long employee);




}
