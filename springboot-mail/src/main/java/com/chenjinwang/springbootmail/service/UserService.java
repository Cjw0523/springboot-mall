package com.chenjinwang.springbootmail.service;

import com.chenjinwang.springbootmail.dto.UserLoginRequest;
import com.chenjinwang.springbootmail.dto.UserRegisterRequest;
import com.chenjinwang.springbootmail.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);
}
