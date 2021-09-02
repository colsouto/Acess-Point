package com.projeto1.acesspoint.repository;

import com.projeto1.acesspoint.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaRepository  extends JpaRepository<JornadaTrabalho, Long> {
}
