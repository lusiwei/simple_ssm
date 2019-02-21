package com.lusiwei.service;

import com.lusiwei.dao.IStudentMapper;
import com.lusiwei.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private IStudentMapper iStudentMapper;

    //查询
    public Student queryById(Integer id){
        return iStudentMapper.selectByPrimaryKey(id);
    }
}
