package com.chat.server.core.server;

import com.chat.server.core.server.exchange.VersionResponse;
import com.chat.server.util.ChatProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServerService {

    @Autowired
    private ChatProperties chatProperties;

    public VersionResponse getVersion() {
        return VersionResponse.builder()
                .version(chatProperties.getVersion())
                .buildTimestampLabel(chatProperties.getBuildTimestampLabel())
                .build();
    }
}
