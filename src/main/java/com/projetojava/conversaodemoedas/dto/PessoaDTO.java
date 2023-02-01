package com.projetojava.conversaodemoedas.dto;

import com.projetojava.conversaodemoedas.model.Pessoa;

import java.time.LocalDate;

public class PessoaDTO {
    private final String nome;
    private final String cpf;
    private LocalDate nascimento;
    private String civil;
    private String sexo;

    public static PessoaDTO of(Pessoa pessoa) {
        PessoaDTO dto = new PessoaDTO(pessoa.getNome(), pessoa.getCpf());
        dto.nascimento = pessoa.getNascimento();
        dto.civil = pessoa.getCivil();
        dto.sexo = pessoa.getSexo();
        return dto;
    }

    public Pessoa toEntity() {
        Pessoa entity = new Pessoa();
        entity.setCpf(cpf);
        entity.setNome(nome);
        entity.setNascimento(nascimento);
        return entity;
    }
}
