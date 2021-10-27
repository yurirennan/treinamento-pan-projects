package com.yuri.microsevice2.app1.service;

import com.yuri.microsevice2.app1.model.Usuario;
import com.yuri.microsevice2.app1.repository.UsuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    public UsuarioRepo usuarioRepo;

    public List<Usuario> getAll(){
        return usuarioRepo.findAll();
    }

    public Optional<Usuario> getById(long id) {
        return usuarioRepo.findById(id);
    }
}
