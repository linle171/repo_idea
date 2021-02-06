package com.linle.service;

import com.linle.domain.Employee;

import java.util.List;

/**
 * @author LinLe
 * @create 2021-02-03 11:19
 */
public interface EmployeeService {
    void addEmployee(Employee emp);
    List<Employee> findAllEmployee();
    Employee findById(Integer id);
    void deleteById(Integer id);
    void deleteBatch(Integer[] ids);
    
    void updateEmployee(Employee emp);
}
