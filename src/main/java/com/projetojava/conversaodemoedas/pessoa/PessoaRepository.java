package com.projetojava.conversaodemoedas.pessoa;

import com.projetojava.conversaodemoedas.pessoa.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, String> {
}
