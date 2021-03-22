package com.proyecto.universidad.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.proyecto.universidad.modelo.Usuario;
import com.proyecto.universidad.repository.IUsuarioRepository;

@Service
public class UsuarioService implements UserDetailsService{
	
	@Autowired
	private IUsuarioRepository repoUser;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Usuario u = repoUser.findByUser(username);
		ArrayList<GrantedAuthority> roles = new ArrayList<GrantedAuthority>();
		roles.add(new SimpleGrantedAuthority("ADMIN"));
		UserDetails userDT = new User(u.getUser(), u.getPass(), roles);
		return userDT;
	}
	
	

}
