package com.projetojava.conversaodemoedas.service;

import com.projetojava.conversaodemoedas.model.Pessoa;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class PessoaService {
    private final CrudRepository<Pessoa, Long> repository;
    private final CrudRepository<Pessoa, String> repositoryPessoa;

    public Optional<Pessoa> getById(Long id) {
        return repository.findById(id);
    }

    public Optional<Pessoa> getByCpf(String cpf) {
        return repositoryPessoa.findById(cpf);
    }

    public void adicionar(Pessoa entity) {
        repository.save(entity);
    }
}
