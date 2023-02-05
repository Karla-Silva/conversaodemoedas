package com.projetojava.pessoa;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PessoaService {
    private final PessoaRepository pessoaRepository;

    public Pessoa getByCpf(String cpf) {
        return pessoaRepository.findByCpf(cpf);
    }

    public void adicionar(Pessoa entity) {
        pessoaRepository.save(entity);
    }
}
