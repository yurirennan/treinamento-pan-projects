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
}
