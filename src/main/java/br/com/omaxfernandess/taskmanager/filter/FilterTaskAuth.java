package br.com.omaxfernandess.taskmanager.filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.Base64;

@Component
public class FilterTaskAuth extends OncePerRequestFilter {


    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        // Get the Authorization header from the request (user and password)
        var authorization =  request.getHeader("Authorization");
        var authEncoded =  authorization.substring("Basic".length()).trim();

        byte[] authDecode =  Base64.getDecoder().decode(authEncoded);

        var authString = new String(authDecode);


        String[] credentials =  authString.split(":");
        String username = credentials[0];
        String password = credentials[1];

        System.out.println("Authorization");
        System.out.println(username);
        System.out.println(password);
        // Check user in the database

        // Check password in the database


    }
}

