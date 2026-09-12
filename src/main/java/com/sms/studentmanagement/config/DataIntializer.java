package com.sms.studentmanagement.config;

import com.sms.studentmanagement.model.Users;
import com.sms.studentmanagement.repository.UsersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class DataIntializer {
    @Bean
    CommandLineRunner loadSampleData(UsersRepository usersRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            if(!usersRepository.existsByUsername("admin")) {
                Users users = new Users();
                users.setUsername("admin");
                users.setPassword(passwordEncoder.encode("admin@12345"));
                users.setActive(true);
                usersRepository.save(users);
            }
        };

    }
}
