package com.lusiwei.controller;

import com.lusiwei.dao.StudentMapper;
import com.lusiwei.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    private StudentMapper studentMapper;
    @RequestMapping("test")
    public List<Student> test(String id) {
        return studentMapper.selectAll();
    }
}
