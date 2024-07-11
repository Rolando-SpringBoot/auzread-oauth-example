package com.rbard.auth.configuration;

import org.springframework.context.event.EventListener;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationSuccessListener {

    /*
     This method will execute on authentication success and before to valid the scopes or roles.
     It can help you to debug the authority values which contains the roles that are being validated
     for spring security
    */
    @EventListener
    public void onAuthenticationSuccess(AuthenticationSuccessEvent event) {
        Authentication authentication = event.getAuthentication();
        System.out.println("Usuario autenticado: " + authentication.getName());
        System.out.println("Autoridades: " + authentication.getAuthorities());
    }
}