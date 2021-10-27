package com.yuri.micro_tabela.micro_tabela.resources;

import com.yuri.micro_tabela.micro_tabela.model.Tabela;
import com.yuri.micro_tabela.micro_tabela.repositories.TabelaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value= "/tabela")
public class TabelaResource {
    @Autowired
    private TabelaRepository tabelaRepository;

    @GetMapping
    public ResponseEntity<List<Tabela>> listar() {
        List<Tabela> list = this.tabelaRepository.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Tabela>  findById(@PathVariable Long id) {
        Tabela tabela = this.tabelaRepository.findById(id).get();
        return ResponseEntity.ok(tabela);
    }


}
