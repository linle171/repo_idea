package com.linle.service.impl;

import com.linle.dao.DeptDao;
import com.linle.domain.Dept;
import com.linle.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LinLe
 * @create 2021-02-03 10:38
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;
    @Override
    public List<Dept> findByIdOrName(Dept dept) {
        return deptDao.findByIdOrName(dept);
    }
    
    @Override
    public Integer findByNameToId(String dept_name) {
        return deptDao.findByNameToId(dept_name);
    }
}
