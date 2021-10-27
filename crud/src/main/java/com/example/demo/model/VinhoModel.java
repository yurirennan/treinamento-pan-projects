package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "vinhos")
public class VinhoModel {
    private Long id;

    @Column()
    private String nome;

    @Column()
    private int volume; //Volume em ml

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
