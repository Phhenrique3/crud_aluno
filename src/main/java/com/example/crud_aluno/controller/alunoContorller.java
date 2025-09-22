package com.example.crud_aluno.controller;

import com.example.crud_aluno.model.Aluno;
import com.example.crud_aluno.repository.AlunoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class alunoContorller {

private  final AlunoRepository alunoRepository;

public alunoContorller(AlunoRepository alunoRepository) {
    this.alunoRepository = alunoRepository;
}

@GetMapping
    public List<Aluno> listarAlunos(){
    return alunoRepository.findAll();
    }

    @PostMapping
    public Aluno save(@RequestBody Aluno aluno) {
    return alunoRepository.save(aluno);
}


}
