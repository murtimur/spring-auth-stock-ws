package com.muratyildirim.app.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@EnableWebSecurity
@Configuration
@EnableMethodSecurity(prePostEnabled = false)
public class SecurityConfiguration {

  @Autowired
  TokenFilter tokenFilter;

  @Bean
  SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http.cors(cors -> cors.disable()).csrf(csrf -> csrf.disable()).headers(headers -> headers.disable())
        .authorizeHttpRequests(auth -> auth
            .requestMatchers(HttpMethod.POST, PERMIT_PATHS).permitAll()
            .requestMatchers(SWAGGER_PATHS).permitAll()
            .anyRequest().authenticated())
        .httpBasic(httpBasic -> httpBasic.authenticationEntryPoint(new AuthEntryPoint()));
    http.addFilterBefore(tokenFilter, UsernamePasswordAuthenticationFilter.class);
    return http.build();
  }

  public static final String[] SWAGGER_PATHS = {
      "/swagger-ui/**",
      "/v3/api-docs/**",
      "/swagger-ui.html"
  };

  public static final String[] PERMIT_PATHS = {
      "/api/v1/auth"
  };

  public static final String[] AUTHENTICATED_PATHS = {

  };

}
