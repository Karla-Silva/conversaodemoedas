package com.projetojava.ordemdecompra;

import com.projetojava.conversaodemoedas.Pessoa.PessoaService;
import com.projetojava.conversaodemoedas.cotacaodamoeda.CotacaoDeMoedasService;
import com.projetojava.conversaodemoedas.cotacaodamoeda.cotacaoDaMoeda;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Random;

@RequiredArgsConstructor
@Service
public class ordemDeCompraService {
    private final CrudRepository<ordemDeCompra, String> repository;
    private final PessoaService pessoaService;
    private final CotacaoDeMoedasService cotacaoDeMoedasService;

    public calculoCotacao salvarOrdemDeCompra(ordemDeCompra ordemDeCompra) {
        repository.save(ordemDeCompra);
        calculoCotacao calculoCotacao = new calculoCotacao();
        calculoCotacao.setId_compra(new Random().nextLong());
        calculoCotacao.setId_cliente(pessoaService.getByCpf(ordemDeCompra.getCpf()).getId());
        calculoCotacao.setCpf_cliente(ordemDeCompra.getCpf());
        calculoCotacao.setDataSolicitacao(Instant.now());
        calculoCotacao.setTipo_moeda(ordemDeCompra.getMoeda());
        calculoCotacao.setValor_moeda_estrangeira(ordemDeCompra.getValor());
        cotacaoDaMoeda[] cotacao;
        if (ordemDeCompra.getMoeda() == "USD") {
            cotacao = cotacaoDeMoedasService.getCotacaoUSD();
            calculoCotacao.setValor_cotacao(cotacao[0].getBid());
        } else {
            cotacao = cotacaoDeMoedasService.getCotacaoEUR();
            calculoCotacao.setValor_cotacao(cotacao[0].getBid());
        }
        calculoCotacao.setValor_total_operacao(ordemDeCompra.getValor().multiply(cotacao[0].getBid()));
        calculoCotacao.setNumero_agencia_retirada(ordemDeCompra.getAgencia());
        return calculoCotacao;
    }
}
