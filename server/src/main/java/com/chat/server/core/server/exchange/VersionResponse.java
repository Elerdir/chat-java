package com.chat.server.core.server.exchange;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class VersionResponse {

    private String version;

    private String buildTimestampLabel;
}
