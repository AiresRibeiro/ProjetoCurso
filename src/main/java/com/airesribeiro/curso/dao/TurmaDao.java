package com.airesribeiro.curso.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airesribeiro.curso.entity.Curso;
import com.airesribeiro.curso.entity.Turma;

@Repository
public interface TurmaDao extends JpaRepository<Turma, Long> {

}
