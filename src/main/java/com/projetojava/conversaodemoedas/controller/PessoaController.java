package com.projetojava.conversaodemoedas.controller;

import com.projetojava.conversaodemoedas.dto.PessoaDTO;
import com.projetojava.conversaodemoedas.service.PessoaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.net.URI;

@RequiredArgsConstructor
@RestController
@RequestMapping("/pessoa")
public class PessoaController {
    private final PessoaService service;

    @PostMapping
    public ResponseEntity<Void> add(@RequestBody PessoaDTO pessoa) {
        if (pessoa == null || pessoa.getCpf() == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Não foi informada uma pessoa válida");
        }
        String clearCpf = pessoa.getCpf().replaceAll("[\\.-]", "");
        if (clearCpf.isBlank()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Não foi informada uma pessoa com CPF válido");
        }
        if (pessoa.getNome() == null || pessoa.getNome().isBlank()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Não foi informada um nome válido");
        }
        try {
            service.adicionar(pessoa.toEntity());
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Ocorreu um erro desconhecido");
        }
        return ResponseEntity.created(URI.create("/pessoa" + clearCpf)).build();
    }
}
