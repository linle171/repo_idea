package com.linle.dao;

import com.linle.domain.Dept;
import com.linle.service.DeptService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author LinLe
 * @create 2021-02-03 9:29
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class DeptTest {
    @Autowired
    private DeptService deptService;
    @Test
    public void test01(){
    
        Integer i = deptService.findByNameToId("市场部");
        System.out.println(i);
        
    }
}
