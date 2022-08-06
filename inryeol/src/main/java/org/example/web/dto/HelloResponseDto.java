package org.example.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

// 2.4장
@Getter
@RequiredArgsConstructor
public class HelloResponseDto {
    private final String name;
    private final int amount;
}
