package com.linle.domain;

import java.util.Date;

/**
 * @author LinLe
 * @create 2021-02-03 9:03
 */
public class Employee {
    private Integer emp_id;
    private String emp_name;
    private String dept_id;
    private String job_name;
    private Date join_date;
    private String telephone;
    
    public Employee() {
    }
    
    public Employee(Integer emp_id, String emp_name, String dept_id, String job_name, Date join_date, String telephone) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.dept_id = dept_id;
        this.job_name = job_name;
        this.join_date = join_date;
        this.telephone = telephone;
    }
    
    public Integer getEmp_id() {
        return emp_id;
    }
    
    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }
    
    public String getEmp_name() {
        return emp_name;
    }
    
    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }
    
    public String getDept_id() {
        return dept_id;
    }
    
    public void setDept_id(String dept_id) {
        this.dept_id = dept_id;
    }
    
    public String getJob_name() {
        return job_name;
    }
    
    public void setJob_name(String job_name) {
        this.job_name = job_name;
    }
    
    public Date getJoin_date() {
        return join_date;
    }
    
    public void setJoin_date(Date join_date) {
        this.join_date = join_date;
    }
    
    public String getTelephone() {
        return telephone;
    }
    
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", emp_name='" + emp_name + '\'' +
                ", dept_id='" + dept_id + '\'' +
                ", job_name='" + job_name + '\'' +
                ", join_date=" + join_date +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
