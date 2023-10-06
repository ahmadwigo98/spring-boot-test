package com.example.demo;

import com.example.demo.model.AppUser;
import com.example.demo.repository.AppUserRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class RunApplication {
	@Autowired
	private AppUserRepository appUserRepository;

	public static void main(String[] args) {
		SpringApplication.run(RunApplication.class, args);
	}

	@Bean
	InitializingBean sendDatabase() {
		return () -> {
			appUserRepository.save(new AppUser(101, "userOne", "passwordOne"));
			appUserRepository.save(new AppUser(102, "userTwo", "passwordTwo"));
		};
	}
}
