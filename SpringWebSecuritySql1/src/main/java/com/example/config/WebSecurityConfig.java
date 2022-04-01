package com.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

public class WebSecurityConfig {
	
	@Autowired
	private UserDetailsService userDetailService;
	
	@Bean
	public DaoAuthenticationProvider authProvider() {
		DaoAuthenticationProvider p = new DaoAuthenticationProvider();
		p.setUserDetailsService(userDetailService);
		p.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		return p;
	}
	
	

}
