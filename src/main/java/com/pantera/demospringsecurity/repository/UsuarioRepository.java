package com.pantera.demospringsecurity.repository;

import com.pantera.demospringsecurity.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

  Usuario findByNombre(String nombre);
}
