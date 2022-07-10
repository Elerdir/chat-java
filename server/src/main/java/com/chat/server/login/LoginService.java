package com.chat.server.login;

import com.chat.server.login.exchange.LoginRequest;
import com.chat.server.login.exchange.LoginResponse;
import com.chat.server.login.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private LoginRepository loginRepository;

    public LoginResponse login(LoginRequest loginRequest) {
        // TODO check exist username
        // TODO check confirm password
        // return user object with all users from his list
        return null;
    }
}
