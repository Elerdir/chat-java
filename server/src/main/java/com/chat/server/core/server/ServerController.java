package com.chat.server.core.server;

import com.chat.server.core.server.exchange.VersionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/core/server")
@Controller
public class ServerController {

    @Autowired
    private ServerService serverService;

    @GetMapping("/version")
    public VersionResponse getVersion() {
        return serverService.getVersion();
    }
}
