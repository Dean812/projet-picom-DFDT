package org.formation.picom.configuration.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import lombok.AllArgsConstructor;

@Configuration
@AllArgsConstructor
public class SecurityConfiguration {

	 @Bean
	    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
	        http.csrf().disable()
	        
	        .headers().frameOptions().disable();
	        
	       return http.build();
	    }
	
}