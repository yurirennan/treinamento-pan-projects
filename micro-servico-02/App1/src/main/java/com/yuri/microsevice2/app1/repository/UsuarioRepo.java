package com.yuri.microsevice2.app1.repository;

import com.yuri.microsevice2.app1.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepo extends JpaRepository<Usuario, Long> {
}

