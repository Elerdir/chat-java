package com.chat.server.login.model;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Entity
public class LoginEntity {

    @Id
    private String username;

    private String password;
}
