package com.chat.server.login.dto;

import com.chat.server.login.model.LoginEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

@Getter
@Builder
public class Login {

    private String username;

    private String password;

    public static Login fromEntity(@NonNull LoginEntity loginEntity) {
        return Login.builder()
                .username(loginEntity.getUsername())
                .password(loginEntity.getPassword())
                .build();
    }
}
