package com.example.crudaws.repository;

import com.example.crudaws.model.Texto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TextoRepository extends JpaRepository<Texto, Long> {
}
