package com.chat.server.login.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

@Getter
@Entity
public class LoginEntity {

    @Id
    private String username;

    private String password;
}
