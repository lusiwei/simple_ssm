package com.lusiwei.dao;

import com.lusiwei.pojo.Student;
import org.apache.ibatis.annotations.Param;

public interface IStudentMapper {
    Student selectByPrimaryKey(@Param("id") Integer id);
}
