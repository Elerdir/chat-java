package com.chat.server.login;

import com.chat.server.login.dto.Login;
import com.chat.server.login.exchange.LoginRequest;
import com.chat.server.login.exchange.LoginResponse;
import com.chat.server.login.repository.LoginRepository;
import jakarta.annotation.Resource;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.context.SecurityContextImpl;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class LoginService {

    @Autowired
    private LoginRepository loginRepository;



    public LoginResponse login(LoginRequest loginRequest) {
        // TODO check exist username
        Login login = Login.fromEntity(loginRepository.findById(loginRequest.getUsername())
                .orElseThrow(() -> new RuntimeException(
                        String.format("Username %s doesn't exist.", loginRequest.getUsername()))));

        // TODO check confirm password
        if (login.getPassword().equals(loginRequest.getPassword())) {
            throw new RuntimeException("Incorrect password");
        }

        setSecurity(login);
        // return user object with all users from his list
        return null;
    }

    private void setSecurity(Login login) {
        SecurityContext context = new SecurityContextImpl();
        Authentication auth = new UsernamePasswordAuthenticationToken(login.getUsername(), login.getPassword());
        context.setAuthentication(auth);
    }
}
