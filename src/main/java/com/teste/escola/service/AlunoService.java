package com.teste.escola.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.escola.Entity.Aluno;
import com.teste.escola.repository.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	public List<Aluno> listarAlunos(){
		return alunoRepository.findAll();	
	}
	
	public Aluno salvar(Aluno aluno) {
		return alunoRepository.save(aluno);
	}

}
