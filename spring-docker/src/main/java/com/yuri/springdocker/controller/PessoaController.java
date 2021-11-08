package com.yuri.springdocker.controller;

import com.yuri.springdocker.dto.PessoaDTO;
import com.yuri.springdocker.dto.PessoaRq;
import com.yuri.springdocker.model.Pessoa;
import com.yuri.springdocker.repository.PessoaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    private final PessoaRepository pessoaRepository;

    public PessoaController(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    @GetMapping
    public List<PessoaDTO> findAll(){
        var pessoas = pessoaRepository.findAll();

        return pessoas.stream().map(PessoaDTO::converter).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public PessoaDTO findById(@PathVariable("id") Long id) {
        var pessoa = pessoaRepository.getById(id);
        return PessoaDTO.converter(pessoa);
    }

    @PostMapping
    public void savePerson(@RequestBody PessoaRq pessoaRq){
        var pessoa = new Pessoa();

        pessoa.setNome(pessoaRq.getNome());
        pessoa.setSobrenome(pessoaRq.getSobrenome());

        pessoaRepository.save(pessoa);
    }

    @PutMapping("/{id}")
    public void updatePerson(@PathVariable("id") Long id, @RequestBody PessoaRq pessoaRq) throws Exception {
        var pessoa = pessoaRepository.findById(id);

        if (pessoa.isPresent()) {
            var pessoaSave = pessoa.get();
            pessoaSave.setNome(pessoaRq.getNome());
            pessoaSave.setSobrenome(pessoaRq.getSobrenome());
            pessoaRepository.save(pessoaSave);
        } else {
            throw new Exception("Pessoa Não encontrada");
        }
    }



}
