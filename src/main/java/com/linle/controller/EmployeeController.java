package com.linle.controller;

import com.linle.domain.Employee;
import com.linle.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import java.util.List;

/**
 * @author LinLe
 * @create 2021-02-03 11:21
 */
@Controller
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    
    @RequestMapping("/addEmployee")
    public String addEmployee(Employee emp){
        employeeService.addEmployee(emp);
        return "forward:findAllEmployee";
    }
    
    @RequestMapping("/findAllEmployee")
    public ModelAndView findAllEmployee(){
        ModelAndView modelAndView = new ModelAndView();
        List<Employee> empList = employeeService.findAllEmployee();
        modelAndView.addObject("empList",empList);
        modelAndView.setViewName("list");
        return modelAndView;
    }
    
    @RequestMapping("/findById")
    public ModelAndView findById(Integer id){
        ModelAndView modelAndView = new ModelAndView();
        Employee emp = employeeService.findById(id);
        modelAndView.addObject("emp",emp);
        modelAndView.setViewName("update");
        return modelAndView;
    }
    
    
    @RequestMapping("/deleteById")
    public String deleteById(Integer id){
        
        employeeService.deleteById(id);
        return "forward:findAllEmployee";
    }
    
    @RequestMapping("/deleteBatch")
    public String deleteBatch(Integer[] ids){
        
        employeeService.deleteBatch(ids);
        return "forward:findAllEmployee";
    }
    
    @RequestMapping("/updateEmployee")
    public String updateEmployee(Employee emp){
        
        employeeService.updateEmployee(emp);
        return "forward:findAllEmployee";
    }
    
    
}
