package com.tom.scratch.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserImpl implements UserService {

    @Autowired
    private SqlSessionTemplate sqlsession;

    @Override
    public boolean insert(UserDTO userDTO) {
        sqlsession.insert("add_user", userDTO);
        return false;
    }

    @Override
    public UserDTO findByName(String name) {
        return sqlsession.selectOne("select_user_by_name", name);
    }

}
