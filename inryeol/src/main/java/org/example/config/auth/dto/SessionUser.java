package org.example.config.auth.dto;


import lombok.Getter;
import org.example.domain.user.User;

import javax.mail.Session;
import java.io.Serializable;

// 5.3장
@Getter
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;

    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}
