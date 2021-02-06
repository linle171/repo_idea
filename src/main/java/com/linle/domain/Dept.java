package com.linle.domain;

/**
 * @author LinLe
 * @create 2021-02-03 8:58
 */

public class Dept {
    private Integer dept_id;
    private String dept_name;
    private String major_name;
    private String telephone;
    private String email;
    
    
    public Dept() {
    }
    
    public Dept(Integer dept_id, String dept_name, String major_name, String telephone, String email) {
        this.dept_id = dept_id;
        this.dept_name = dept_name;
        this.major_name = major_name;
        this.telephone = telephone;
        this.email = email;
    }
    
    public Integer getDept_id() {
        return dept_id;
    }
    
    public void setDept_id(Integer dept_id) {
        this.dept_id = dept_id;
    }
    
    public String getDept_name() {
        return dept_name;
    }
    
    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }
    
    public String getMajor_name() {
        return major_name;
    }
    
    public void setMajor_name(String major_name) {
        this.major_name = major_name;
    }
    
    public String getTelephone() {
        return telephone;
    }
    
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public String toString() {
        return "Department{" +
                "dept_id=" + dept_id +
                ", dept_name='" + dept_name + '\'' +
                ", major_name='" + major_name + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
