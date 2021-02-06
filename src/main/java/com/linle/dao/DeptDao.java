package com.linle.dao;

import com.linle.domain.Dept;

import java.util.List;

/**
 * @author LinLe
 * @create 2021-02-03 9:05
 */
public interface DeptDao {
    List<Dept> findByIdOrName(Dept dept);
    Integer findByNameToId(String dept_name);
    
}
