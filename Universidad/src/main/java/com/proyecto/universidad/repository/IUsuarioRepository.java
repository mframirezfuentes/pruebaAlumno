package com.proyecto.universidad.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.universidad.modelo.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario, Integer>{

	Usuario findByUser(String user);
	
}
