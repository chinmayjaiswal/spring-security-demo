package com.cj.spring.security.demo.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Slf4j
@Configuration
public class SecurityConfig {

  @Bean
  public SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
    log.info("configuring security checks in custom filter chain...");

    http.authorizeHttpRequests((authRequest) ->
            authRequest.requestMatchers("/myAccount").authenticated()
                .requestMatchers("/contact").permitAll()
        )
        .httpBasic().and()
        .formLogin();

    return http.build();
  }
}
