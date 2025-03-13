package com.teste.escola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.escola.Entity.Aluno;
import com.teste.escola.service.AlunoService;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
	
	@Autowired
	private AlunoService alunoService;
	
	@GetMapping
	public List<Aluno> listar(){
		return alunoService.listarAlunos();	
	}
	
	@PostMapping
	public Aluno salvar(@RequestBody Aluno aluno) {
		return alunoService.salvar(aluno);
	
	}
	

    
	

}
