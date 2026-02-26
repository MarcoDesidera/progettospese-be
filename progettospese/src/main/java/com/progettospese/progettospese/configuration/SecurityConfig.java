package com.progettospese.progettospese.configuration;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationConverter;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.Customizer;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .cors(Customizer.withDefaults())
            .csrf(csrf -> csrf.disable()) // Obbligatorio per API stateless
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/api/v1/public/**").permitAll() // Rotte libere
                .anyRequest().authenticated()                    // Tutto il resto protetto
            )
            // Configura il server per accettare JWT di Azure
            .oauth2ResourceServer(oauth2 -> oauth2.jwt(jwt -> jwt.jwtAuthenticationConverter(jwtAuthenticationConverter())));
        
        return http.build();
    }

    @Bean
    public JwtAuthenticationConverter jwtAuthenticationConverter() {
        JwtAuthenticationConverter converter = new JwtAuthenticationConverter();
        
        // Questo trasforma i claim del JWT in Authorities di Spring
        converter.setJwtGrantedAuthoritiesConverter(jwt -> {
            // Estraiamo la lista "roles" dal token
            List<String> roles = jwt.getClaimAsStringList("roles");
            
            if (roles == null) {
                return Collections.emptyList();
            }

            // Mappiamo ogni stringa in un oggetto SimpleGrantedAuthority
            return roles.stream()
                .map(SimpleGrantedAuthority::new) 
                .collect(Collectors.toList());
        });
        
        return converter;
    }
}
