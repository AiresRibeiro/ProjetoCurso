package com.airesribeiro.curso.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airesribeiro.curso.entity.Pessoa;

@Repository
public interface PessoaDao extends JpaRepository<Pessoa, Long> {

}
