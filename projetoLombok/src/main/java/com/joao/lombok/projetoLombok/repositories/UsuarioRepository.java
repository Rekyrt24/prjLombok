package com.joao.lombok.projetoLombok.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joao.lombok.projetoLombok.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
