package com.airesribeiro.curso.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airesribeiro.curso.entity.Curso;

@Repository
public interface CursoDao extends JpaRepository<Curso, Long> {

}
