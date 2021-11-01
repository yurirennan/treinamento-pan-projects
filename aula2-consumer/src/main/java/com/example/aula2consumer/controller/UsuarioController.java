package com.example.aula2consumer.controller;

import com.example.aula2consumer.UsuarioFeign;
import com.example.aula2consumer.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class UsuarioController {
    @Autowired
    private UsuarioFeign usuarioFeign;

    @GetMapping("/hello")
    public String test() {
        return "Test";
    }

    @GetMapping
    public ResponseEntity<ResponseEntity<List<Usuario>>> getAll() {
        return ResponseEntity.ok(usuarioFeign.getAll());
    }

    @GetMapping("/listar/body")
    public ResponseEntity<List<Usuario>> getAllBody() {
        return ResponseEntity.ok(usuarioFeign.getAll().getBody());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseEntity<Optional<Usuario>>> getById(@PathVariable Long id) {
        return ResponseEntity.ok(usuarioFeign.getById(id));
    }
}
