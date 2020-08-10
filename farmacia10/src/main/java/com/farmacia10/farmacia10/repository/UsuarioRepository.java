package com.farmacia10.farmacia10.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farmacia10.farmacia10.model.Usuario;
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

	public Optional<Usuario> findByUsuario(String usuario); 
	// esse usuario é exatamente o atributo usuario da model usuari
	
}
