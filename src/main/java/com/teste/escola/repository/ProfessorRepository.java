package com.teste.escola.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teste.escola.Entity.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor,Integer> {
	

}
