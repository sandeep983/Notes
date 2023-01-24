package com.cosmostaker.springboot.thymeleafdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailsManager() {
    	
        UserDetails cosmostaker = User.builder()
            .username("Cosmostaker")
            .password("{noop}cosmos@123")
            .roles("EMPLOYEE")
            .build();

        UserDetails admin = User.builder()
                .username("Admin")
                .password("{noop}admin@123")
                .roles("EMPLOYEE", "ADMIN")
                .build();
        
        return new InMemoryUserDetailsManager(cosmostaker, admin);        
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    	
    	return http
		.authorizeRequests(configurer ->
			configurer
				.antMatchers("/").hasRole("EMPLOYEE")	
				.antMatchers("/employees/showForm*").hasRole("ADMIN")
				.antMatchers("/employees/save*").hasRole("ADMIN")
				.antMatchers("/employees/delete").hasRole("ADMIN")
				.antMatchers("/employees/**").hasRole("EMPLOYEE")
				.antMatchers("/resources/**").permitAll())
				
		
		.formLogin(configurer ->
			configurer
				.loginPage("/showLoginPage")
				.loginProcessingUrl("/authenticateUser")
				.permitAll())
		
		.logout(configurer -> 
			configurer
				.permitAll())
		
		.exceptionHandling(configurer ->
			configurer
				.accessDeniedPage("/accessDenied"))
		
		.build();        
    }	
}