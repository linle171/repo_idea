package com.linle.dao;

import com.linle.domain.Employee;

import java.util.List;

/**
 * @author LinLe
 * @create 2021-02-03 11:15
 */
public interface EmployeeDao {
    void addEmployee(Employee emp);
    List<Employee> findAllEmployee();
    Employee findById(Integer id);
    void deleteById(Integer id);
    
    void deleteBatch(Integer[] ids);
    
    void updateEmployee(Employee emp);
}
