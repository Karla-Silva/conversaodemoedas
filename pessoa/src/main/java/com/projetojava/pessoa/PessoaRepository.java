<<<<<<<< HEAD:pessoa/src/main/java/com/projetojava/pessoa/PessoaRepository.java
package com.projetojava.pessoa;

========
package com.projetojava.conversaodemoedas.pessoa;

import com.projetojava.conversaodemoedas.pessoa.Pessoa;
>>>>>>>> origin/develop:src/main/java/com/projetojava/conversaodemoedas/pessoa/PessoaRepository.java
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    Pessoa findByCpf(String cpf);
  //  void save(Pessoa entity);
}
