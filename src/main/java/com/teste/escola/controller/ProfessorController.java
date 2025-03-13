package com.teste.escola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.escola.Entity.Professor;
import com.teste.escola.service.ProfessorService;

@RestController
@RequestMapping("/professores")
public class ProfessorController {
    
    @Autowired
    private ProfessorService professorService;
    
    @GetMapping
    public List<Professor> listar() {
        return professorService.listarProfessores();    
    }
    
    @PostMapping
    public Professor salvar(@RequestBody Professor professor) {
        return professorService.salvar(professor);
    }
}
