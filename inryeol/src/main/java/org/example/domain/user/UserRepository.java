package org.example.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional; //직접입력

// 5.3장
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
