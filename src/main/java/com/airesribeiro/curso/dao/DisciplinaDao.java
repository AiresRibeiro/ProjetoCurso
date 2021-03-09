package com.airesribeiro.curso.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airesribeiro.curso.entity.Disciplina;

@Repository
public interface DisciplinaDao extends JpaRepository<Disciplina, Long> {

}
