package com.tom.scratch.dao;

import com.tom.scratch.domain.Student;
import com.tom.scratch.mappers.StudentMappers;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class StudentService {

    @Autowired
    private StudentMappers studentMappers;

    public Student findById(String id) {
        return studentMappers.findById(id);
    }
}
