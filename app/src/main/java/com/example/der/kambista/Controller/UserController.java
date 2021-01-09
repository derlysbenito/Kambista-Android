package com.example.der.kambista.Controller;

import com.example.der.kambista.Model.User;

public class UserController {

    private User user;

    public void setUserInfo(String name, String email){
        user.setName(name);
        user.setEmail(email);
    }
}
