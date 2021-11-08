package com.yuri.springdocker.dto;

import com.yuri.springdocker.model.Pessoa;

public class PessoaDTO {
    private Long id;
    private String nome;
    private String sobrenome;

    public static PessoaDTO converter(Pessoa pessoa) {
        var pessoaDTO = new PessoaDTO();
        pessoaDTO.setId(pessoa.getId());
        pessoaDTO.setNome(pessoa.getNome());
        pessoaDTO.setSobrenome(pessoa.getSobrenome());

        return pessoaDTO;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
