package com.example.demo.controller;


import com.example.demo.model.VinhoModel;
import com.example.demo.repository.VinhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vinhos")
public class VinhoController {

    @Autowired
    private VinhoRepository repository;

    @GetMapping
    public ResponseEntity<List<VinhoModel>> listar() {
        return ResponseEntity.ok().body(repository.findAll());
    }
}
