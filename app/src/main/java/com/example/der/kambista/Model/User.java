package com.example.der.kambista.Model;

import java.io.Serializable;

public class User implements Serializable {

    private String email;
    private String name;

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
