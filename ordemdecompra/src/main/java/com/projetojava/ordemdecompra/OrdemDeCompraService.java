package com.projetojava.ordemdecompra;

import com.projetojava.cotacaodamoeda.CotacaoDaMoeda;
import com.projetojava.cotacaodamoeda.CotacaoDeMoedasService;
import com.projetojava.pessoa.PessoaService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Random;

@RequiredArgsConstructor
@Service
public class OrdemDeCompraService {
    private final CrudRepository<OrdemDeCompra, String> repository;
    private final PessoaService pessoaService;
    private final CotacaoDeMoedasService cotacaoDeMoedasService;

    public CalculoCotacao salvarOrdemDeCompra(OrdemDeCompra ordemDeCompra) {
        repository.save(ordemDeCompra);
        CalculoCotacao calculoCotacao = new CalculoCotacao();
        calculoCotacao.setId_compra(new Random().nextLong());
        calculoCotacao.setId_cliente(pessoaService.getByCpf(ordemDeCompra.getCpf()).getId());
        calculoCotacao.setCpf_cliente(ordemDeCompra.getCpf());
        calculoCotacao.setDataSolicitacao(Instant.now());
        calculoCotacao.setTipo_moeda(ordemDeCompra.getMoeda());
        calculoCotacao.setValor_moeda_estrangeira(ordemDeCompra.getValor());
        CotacaoDaMoeda[] cotacao;
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
