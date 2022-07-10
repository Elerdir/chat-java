package com.chat.server.login;

import com.chat.server.login.exchange.LoginRequest;
import com.chat.server.login.exchange.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@Controller
@RestController("/api/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping
    public LoginResponse login(@RequestBody LoginRequest loginRequest)
    {
        return loginService.login(loginRequest);
    }
}
