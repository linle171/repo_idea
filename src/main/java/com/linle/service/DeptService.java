package com.linle.service;

import com.linle.domain.Dept;

import java.util.List;

/**
 * @author LinLe
 * @create 2021-02-03 10:38
 */
public interface DeptService {
    List<Dept> findByIdOrName(Dept dept);
    Integer findByNameToId(String dept_name);
}
