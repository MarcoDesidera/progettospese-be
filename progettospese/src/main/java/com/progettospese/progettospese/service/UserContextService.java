package com.progettospese.progettospese.service;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Service;

@Service
public class UserContextService {

    public String getUsername() {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof Jwt jwt) {
            // "sub" o "preferred_username" sono i campi tipici di Entra ID
            return jwt.getClaimAsString("sub"); 
        }
        return "Unknown";
    }
}