package com.linle.service.impl;

import com.linle.dao.EmployeeDao;
import com.linle.domain.Employee;
import com.linle.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author LinLe
 * @create 2021-02-03 11:19
 */
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;
    @Override
    public void addEmployee(Employee emp) {
        employeeDao.addEmployee(emp);
    }
    
    @Override
    public List<Employee> findAllEmployee() {
        return employeeDao.findAllEmployee();
    }
    
    @Override
    public Employee findById(Integer id) {
        return employeeDao.findById(id);
    }
    
    @Override
    public void deleteById(Integer id) {
        employeeDao.deleteById(id);
    }
    
    @Override
    public void deleteBatch(Integer[] ids) {
        employeeDao.deleteBatch(ids);
    }
    
    @Override
    public void updateEmployee(Employee emp) {
        employeeDao.updateEmployee(emp);
    }
}
