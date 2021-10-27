package com.yuri.micro_tabela.micro_tabela.model;

import javax.persistence.*;

@Entity
//Renomear nome da tabela
@Table(name = "tb_tabelinha")
public class Tabela {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String pessoa;

    //renomear nome da coluna
    @Column(name = "preco")
    private Double precoPorDia;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public Double getPrecoPorDia() {
        return precoPorDia;
    }

    public void setPrecoPorDia(Double precoPorDia) {
        this.precoPorDia = precoPorDia;
    }
}
