package com.example.demo;

import com.example.demo.user.*;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.EmbeddedServletContainerAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.annotation.PostConstruct;
import javax.persistence.*;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(UserService userService) {
		return arg -> {
			UserCreationForm superAdmin = new UserCreationForm();
			superAdmin.setEmail("super-admin@gmail.com");
			superAdmin.setFirstName("Admin");
			superAdmin.setLastName("Super");
			superAdmin.setRole(Role.ADMIN);

			userService.createUser(superAdmin);
		};
	}
}
