package com.example.demo.security;

import com.example.demo.user.UserRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static java.util.Collections.emptyList;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    private final UserRepository userRepository;

    public UserDetailsServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<com.example.demo.user.User> oUser = userRepository.getByEmail(username);

        com.example.demo.user.User user = oUser
                .orElseThrow(() -> new UsernameNotFoundException(username));

        return new User(user.getEmail(), user.getPassword(), emptyList());
    }

}