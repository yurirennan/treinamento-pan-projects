package com.yuri.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @GetMapping("/listar")
    public ResponseEntity<Object> getProduto() {
        return new ResponseEntity<>(produtoService.getProdutos(), HttpStatus.OK);
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<Object> deleteProduto(@PathVariable("id") String id) {
        produtoService.deleteProduto(id);
        return new ResponseEntity<>("Produto Deletado Com Sucesso", HttpStatus.OK);
    }

    @PostMapping("/produtos")
    public ResponseEntity<Object> createProduto(@RequestBody Produto produto) {
        produtoService.createProduto(produto);
        return new ResponseEntity<>("Produto Criado Com Sucesso", HttpStatus.CREATED);
    }
}
