package com.chenjinwang.springbootmail.controller;

import com.chenjinwang.springbootmail.dto.UserLoginRequest;
import com.chenjinwang.springbootmail.dto.UserRegisterRequest;
import com.chenjinwang.springbootmail.model.User;
import com.chenjinwang.springbootmail.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@CrossOrigin(origins = "http://localhost:63342") // 假設你的前端跑在 localhost:8080
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/users/register")
    public ResponseEntity<User> register(@RequestBody @Valid UserRegisterRequest userRegisterRequest) {
        Integer userId = userService.register(userRegisterRequest);

        User user = userService.getUserById(userId);

        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @PostMapping("users/login")
    public ResponseEntity<User> login(@RequestBody @Valid UserLoginRequest userLoginRequest) {
       User user = userService.login(userLoginRequest);

       return ResponseEntity.status(HttpStatus.OK).body(user);
    }
}
