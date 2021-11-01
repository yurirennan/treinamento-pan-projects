package com.example.crudaws.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_topico")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String topico_descricao;

    @OneToMany(mappedBy = "topico", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("topico")
    private List<Texto> topico;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTopico_descricao() {
        return topico_descricao;
    }

    public void setTopico_descricao(String topico_descricao) {
        this.topico_descricao = topico_descricao;
    }

    public List<Texto> getTopic() {
        return topico;
    }

    public void setTopic(List<Texto> topic) {
        this.topico = topic;
    }
}
