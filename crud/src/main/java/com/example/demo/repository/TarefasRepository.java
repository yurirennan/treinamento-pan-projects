package com.example.demo.repository;

import com.example.demo.model.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.TarefasModel;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TarefasRepository extends JpaRepository<TarefasModel, Long> {
    public List<TarefasModel> findAllByTarefaContainingIgnoreCase(String tarefa);

    public List<TarefasModel> findByTarefaAndId(String tarefa, Long id);

    public List<TarefasModel> findByTarefaOrId(String tarefa, Long id);

    @Query(value = "SELECT * FROM TAREFA_MODEL", nativeQuery = true)
    List<TarefasModel> procuraTodos();

}
