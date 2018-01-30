package com.example.demo.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
public class UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserService(UserRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public User createUser(UserCreationForm userCreationForm) {
        User user = new User();
        user.setEmail(userCreationForm.getEmail());
        user.setFirstName(userCreationForm.getFirstName());
        user.setLastName(userCreationForm.getLastName());
        user.setRole(Role.STUDENT);

        String password =  1000000 + new Random().nextInt(9000000) + "";

        String encodedPassword = bCryptPasswordEncoder.encode(password);

        user.setPassword(encodedPassword);

        logger.info("Creating user[email=" + user.getEmail() + ", password=" + password + "]");

        return userRepository.save(user);
    }

    public Page<User> findAll(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    public Optional<User> getUserByEmail(String email) {
        return userRepository.getByEmail(email);
    }
}
