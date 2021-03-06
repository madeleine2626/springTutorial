package com.apps.security;

//import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.apps.SpringApplicationContext;
import com.apps.model.request.UserLoginRequestModel;
import com.apps.service.UserServices;
import com.fasterxml.jackson.databind.ObjectMapper;

import dto.UserDTO;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

//public class AuthenticationFilter extends UsernamePasswordAuthenticationFilter {

//    private final AuthenticationManager authenticationManager;
//
//    public AuthenticationFilter(AuthenticationManager authenticationManager) {
//        this.authenticationManager = authenticationManager;
//    }

//    @Override
//    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
//        try {
//            UserLoginRequestModel userLoginRequestModel = new ObjectMapper().readValue(request.getInputStream(), UserLoginRequestModel.class);
//
//            System.out.print("--- userLoginRequestModel = " + userLoginRequestModel.getEmail());
//            
//            return authenticationManager.authenticate(
//                    new UsernamePasswordAuthenticationToken(
//                            userLoginRequestModel.getEmail(),
//                            userLoginRequestModel.getPassword(),
//                            new ArrayList<>())
//                    );
//        } catch(IOException e) {
//            throw new RuntimeException(e);
//        }
//    }

//    @Override
//    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication auth) throws IOException, ServletException {
//
//        String userName = ((User) auth.getPrincipal()).getUsername();
//        String token = Jwts.builder()
//                .setSubject(userName)
//                .setExpiration(new Date(System.currentTimeMillis() + SecurityConstants.EXPIRATION_TIME))
//                .signWith(SignatureAlgorithm.HS512, SecurityConstants.getTokenSecret())
//                .compact();
//        System.out.println("TOKEN = " + token);
//        //UserServices userServices = (UserServices) SpringApplicationContext.getBean("userServiciesImplementation");
//        //UserDTO userDTO = userServices.getUser(userName);
//        
//        response.addHeader(SecurityConstants.HEADER_STRING, SecurityConstants.TOKEN_PREFIX + token);
//        //response.addHeader("UserID", userDTO.getUserId());
//    }
//}