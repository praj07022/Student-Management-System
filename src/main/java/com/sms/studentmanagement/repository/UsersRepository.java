package com.sms.studentmanagement.repository;

import com.sms.studentmanagement.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.studentmanagement.model.Users;
import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Long> {
    boolean existsByUsername(String username);
    Optional<Users> findByUsername(String username);
}
