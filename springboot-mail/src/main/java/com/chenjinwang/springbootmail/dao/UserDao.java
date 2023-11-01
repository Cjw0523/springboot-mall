package com.chenjinwang.springbootmail.dao;

import com.chenjinwang.springbootmail.dto.UserRegisterRequest;
import com.chenjinwang.springbootmail.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
