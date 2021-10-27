package com.yuri.microsevice2.app1.controller;

import java.util.List;
import java.util.Optional;

import com.yuri.microsevice2.app1.exceptions.RecursoNaoEncontrado;
import com.yuri.microsevice2.app1.model.Usuario;
import com.yuri.microsevice2.app1.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping("usuarios")
    public ResponseEntity<List<Usuario>> getAll() {
        return new ResponseEntity<>(usuarioService.getAll(), HttpStatus.OK);
    }

    @GetMapping("usuarios/{id}")
    public ResponseEntity<Usuario> getById(@PathVariable final long id) {
        Optional<Usuario> usuario = usuarioService.getById(id);
        if (usuario.isPresent()) {
            return new ResponseEntity<>(usuario.get(), HttpStatus.OK);
        }
        else {
            throw new RecursoNaoEncontrado();
        }
    }




}