package com.teste.escola.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teste.escola.Entity.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno,Integer> {
	

}
