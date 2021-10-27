package com.yuri.micro_tabela.micro_tabela.repositories;

import com.yuri.micro_tabela.micro_tabela.model.Tabela;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TabelaRepository extends JpaRepository<Tabela, Long> {
}
