package org.formation.picom.configuration.security;

import org.formation.picom.security.CustomAuthenticationManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import lombok.AllArgsConstructor;

/*
 * https://spring.io/blog/2022/02/21/spring-security-without-the-websecurityconfigureradapter
 */
@Configuration
@AllArgsConstructor
public class SecurityConfiguration {

    private UserDetailsService userDetailsService;
    private PasswordEncoder passwordEncoder;
    
    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf().disable()

      .authenticationManager(new CustomAuthenticationManager(userDetailsService, passwordEncoder))

        .formLogin()
            // On fait référence à une URL
            .loginPage("/index")
            .loginProcessingUrl("/login")
            .defaultSuccessUrl("/calendrier")
            .failureForwardUrl("/index?notification=Email%20ou%20mot%20de%20passe%20incorrect")
            .and()
            .logout()
            .logoutUrl("/deconnexion")
            .logoutSuccessUrl("/index?notification=Au%20revoir")
            .and()
        .authorizeRequests()
        .antMatchers("/h2-console").permitAll()  
        .antMatchers("/calendrier").authenticated()
        .antMatchers("/placerGifDistant").authenticated()
        .antMatchers("/televerserGif").authenticated()
        .antMatchers("/reagir").authenticated()
        // Pour la console H2 (à ne pas utiliser en prod)
        .and()
        .headers().frameOptions().disable();
        
       return http.build();
    }
    
}