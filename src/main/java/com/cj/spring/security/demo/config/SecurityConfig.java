package com.cj.spring.security.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

  @Bean
  public SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
    System.out.println("configuring security checks in custom filter chain...");
    http.authorizeHttpRequests().anyRequest().authenticated();
    http.formLogin();
    http.httpBasic();
    return http.build();
  }
}
