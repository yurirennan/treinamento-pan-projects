package com.example.crudaws.controller;

import java.util.List;

import com.example.crudaws.model.Texto;
import com.example.crudaws.repository.TextoRepository;;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/usuarios")
@CrossOrigin("*")
public class TextoController {

    @Autowired
    private TextoRepository repository;

    @GetMapping
    public ResponseEntity<List<Texto>> GetAll() {
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Texto> GetById(@PathVariable long id) {
        return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Texto> Post(@RequestBody Texto usuario) {
        return ResponseEntity.ok(repository.save(usuario));
    }

    @PutMapping
    public ResponseEntity<Texto> put (@RequestBody Texto texto){
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(texto));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        repository.deleteById(id);
    }
}
