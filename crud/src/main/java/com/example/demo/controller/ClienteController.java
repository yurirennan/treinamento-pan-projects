package com.example.demo.controller;

import com.example.demo.model.ClienteModel;
import com.example.demo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClienteController {

    @Autowired
    private ClienteRepository  clienteRepository;

    @GetMapping("/listar/clientes")
    public List<ClienteModel> findAll() {
        return  this.clienteRepository.findAll();
    }

    @PostMapping("/salvar/clientes")
    public ResponseEntity<ClienteModel> save(@RequestBody ClienteModel cliente) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.clienteRepository.save(cliente));
    }

    @GetMapping("/listar/pessoas-fisicas/{tipo}")
    public ResponseEntity<List<ClienteModel>> filtroId(@PathVariable Integer tipo){
        return ResponseEntity.ok(clienteRepository.procuraPessoasFísicas(tipo));
    }

    @GetMapping("/listar/clientes/sql/alfabetico")
    public List<ClienteModel> procuraTodosAlfabetico() {
        return clienteRepository.procuraTodosAlfabetico();
    }

    @GetMapping("/listar/clientes/sql")
    public List<ClienteModel> procuraTodos() {
        return clienteRepository.procuraTodos();
    }
}
