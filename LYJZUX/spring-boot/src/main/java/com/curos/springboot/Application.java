package com.curos.springboot;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	@Bean
	public
	SecurityFilterChain myFilter(HttpSecurity http) throws Exception {
		return http
				.authorizeHttpRequests(
					auth -> {
						auth.requestMatchers("/secret").authenticated();
						auth.requestMatchers("/*").permitAll();
					}
				)
				.oauth2Login(withDefaults())
				.build()
		;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
