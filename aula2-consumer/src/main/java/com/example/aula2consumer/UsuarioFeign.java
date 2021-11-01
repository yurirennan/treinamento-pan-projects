package com.example.aula2consumer;

import com.example.aula2consumer.model.Usuario;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@FeignClient(name = "app1", url = "http://localhost:5001/usuarios")
public interface UsuarioFeign {
    @GetMapping
    public ResponseEntity<List<Usuario>> getAll();

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Usuario>> getById(@PathVariable Long id);
}
