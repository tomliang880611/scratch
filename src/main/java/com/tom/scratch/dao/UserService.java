package com.tom.scratch.dao;

public interface UserService {

    boolean insert(UserDTO userDTO);
    UserDTO findByName(String name);
}
