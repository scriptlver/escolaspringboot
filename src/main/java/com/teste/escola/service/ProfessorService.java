package com.teste.escola.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.escola.Entity.Professor;
import com.teste.escola.repository.ProfessorRepository;

@Service
public class ProfessorService {
	
	@Autowired
	private ProfessorRepository professorRepository;
	
	public List<Professor> listarProfessores(){
		return professorRepository.findAll();	
	}
	
	public Professor salvar(Professor professor) {
		return professorRepository.save(professor);
	}

}