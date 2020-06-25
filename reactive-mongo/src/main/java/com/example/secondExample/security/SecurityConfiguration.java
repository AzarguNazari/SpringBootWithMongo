//package com.example.secondExample.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import static org.springframework.security.core.userdetails.User.withUsername;
//
//@Configuration
//public class SecurityConfiguration {
//    @Bean
//    UserDetailsRepository userDetailsRepository() {
//        UserDetails hendi = withUsername("hendi").password("password").roles("USER").build();
//        UserDetails santika = withUsername("santika").password("password").roles("USER", "ADMIN").build();
//        return new MapUserDetailsRepository(hendi, santika);
//    }
//}
