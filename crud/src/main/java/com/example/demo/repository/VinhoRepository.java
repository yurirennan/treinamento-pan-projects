package com.example.demo.repository;

import com.example.demo.model.VinhoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VinhoRepository extends JpaRepository<VinhoModel, Long> {
}
