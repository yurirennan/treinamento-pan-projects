package com.example.crudaws.repository;

import com.example.crudaws.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
    public List<Topico> findAllByTopicoContainingIgnoreCase(String titulo);
}
