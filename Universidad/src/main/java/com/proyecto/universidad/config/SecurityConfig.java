package com.proyecto.universidad.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.proyecto.universidad.service.UsuarioService;

@EnableWebSecurity
public class SecurityConfig {
	
	@Autowired
	public UsuarioService userServer;
	
	@Autowired
	public BCryptPasswordEncoder encoder;
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		
		BCryptPasswordEncoder bCPE = new BCryptPasswordEncoder();
		return bCPE;
	}
	

}
