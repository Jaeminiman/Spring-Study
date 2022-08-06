package org.example.domain.user;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

// 5.3장
@Getter
@RequiredArgsConstructor
public enum Role {
    GUEST("ROLE_GUEST", "손님"),
    USER("ROLE_USER", "일반 사용자");

    private final String key;
    private final String title;
}
