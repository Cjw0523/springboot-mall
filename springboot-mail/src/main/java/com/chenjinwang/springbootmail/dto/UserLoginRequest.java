package com.chenjinwang.springbootmail.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class UserLoginRequest {

    @NotBlank
    @Email
    private String Email;
    @NotBlank
    private String password;

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
