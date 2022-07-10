package com.chat.server.util;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
@Component
@SuppressWarnings("SpringPropertySource")
@PropertySource("classpath:chat-${spring.profiles.active}.properties")
public class ChatProperties {

    @Value("${app.version:unknown}")
    private String version;

    @Value("${app.buildTimestampLabel:unknown}")
    private String buildTimestampLabel;

}
