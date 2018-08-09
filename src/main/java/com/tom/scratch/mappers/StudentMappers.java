package com.tom.scratch.mappers;

import com.tom.scratch.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StudentMappers {

    @Select("select * from MY_USER where id = #{id}")
    Student findById(@Param("id") String id);
}
