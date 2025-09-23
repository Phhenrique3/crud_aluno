package com.example.crud_aluno.controller;

import com.example.crud_aluno.model.Aluno;
import com.example.crud_aluno.repository.AlunoRepository;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class alunoContorller {

    private final AlunoRepository alunoRepository;

    public alunoContorller(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    @GetMapping
    public List<Aluno> listarAlunos() {
        return alunoRepository.findAll();
    }

    @PostMapping
    public Aluno save(@RequestBody Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Aluno> atualizarAluno(@PathVariable Long id, @RequestBody Aluno alunoAtualizado) {
        return alunoRepository.findById(id).map(aluno -> {
            aluno.setNome(alunoAtualizado.getNome());
            aluno.setEmail(alunoAtualizado.getEmail());
            aluno.setCpf(alunoAtualizado.getCpf());
            aluno.setCpf(alunoAtualizado.getCpf());
            return ResponseEntity.ok(alunoRepository.save(aluno));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarAluno(@PathVariable Long id) {
        return alunoRepository.findById(id)
                .map(aluno -> {
                    alunoRepository.deleteById(id);
                    return ResponseEntity.ok().body(
                            "Aluno com ID " + id + " foi excluído com sucesso."
                    );
                })
                .orElse(ResponseEntity.status(404).body(
                        "Aluno com ID " + id + " não encontrado."
                ));
    }

}