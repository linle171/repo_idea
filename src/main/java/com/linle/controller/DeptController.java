package com.linle.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.linle.domain.Dept;
import com.linle.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author LinLe
 * @create 2021-02-03 11:03
*/
@Controller
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    private DeptService deptService;
    
    @RequestMapping("/findByIdOrName")
    public ModelAndView findByIdOrName(Dept dept){
        ModelAndView modelAndView = new ModelAndView();
        List<Dept> deptList = deptService.findByIdOrName(dept);
        modelAndView.addObject("deptList",deptList);
        modelAndView.setViewName("");
        return modelAndView;
    }
    //produces = {"application/json;charset=UTF-8"} 用于设置返回字符及编码，防止中文乱码
    @RequestMapping(value = "/findByNameToId", produces = {"application/json;charset=UTF-8"})
    public @ResponseBody String findByNameToId(@RequestParam String dept_name){
//        try {
//            dept_name = URLDecoder.decode(dept_name, "UTF-8");
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
        System.out.println(dept_name);
        Integer id = deptService.findByNameToId(dept_name);
        Map<String, Object> map = new HashMap<>();
        if(id != null){
            map.put("flag",true);
            map.put("msg",dept_name+"职位存在,职位编码为："+id);
        }else{
            map.put("flag",false);
            map.put("msg","该职位不存在");
        }
        String s = JSONUtils.toJSONString(map);
        return s;
    }

    
}
