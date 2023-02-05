package com.projetojava.ordemdecompra;

import java.math.BigDecimal;
import java.time.Instant;

public class calculoCotacao {
    private Long id_compra;
    private Long id_cliente;
    private String cpf_cliente;
    private Instant dataSolicitacao;
    private String tipo_moeda;
    private BigDecimal valor_moeda_estrangeira;
    private BigDecimal valor_cotacao;
    private BigDecimal valor_total_operacao;
    private String numero_agencia_retirada;

    public Long getId_compra() {
        return id_compra;
    }

    public Long getId_cliente() {
        return id_cliente;
    }

    public String getCpf_cliente() {
        return cpf_cliente;
    }

    public Instant getDataSolicitacao() {
        return dataSolicitacao;
    }

    public String getTipo_moeda() {
        return tipo_moeda;
    }

    public BigDecimal getValor_moeda_estrangeira() {
        return valor_moeda_estrangeira;
    }

    public BigDecimal getValor_cotacao() {
        return valor_cotacao;
    }

    public BigDecimal getValor_total_operacao() {
        return valor_total_operacao;
    }

    public String getNumero_agencia_retirada() {
        return numero_agencia_retirada;
    }

    public void setId_compra(Long id_compra) {
        this.id_compra = id_compra;
    }

    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }

    public void setCpf_cliente(String cpf_cliente) {
        this.cpf_cliente = cpf_cliente;
    }

    public void setDataSolicitacao(Instant dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public void setTipo_moeda(String tipo_moeda) {
        this.tipo_moeda = tipo_moeda;
    }

    public void setValor_moeda_estrangeira(BigDecimal valor_moeda_estrangeira) {
        this.valor_moeda_estrangeira = valor_moeda_estrangeira;
    }

    public void setValor_cotacao(BigDecimal valor_cotacao) {
        this.valor_cotacao = valor_cotacao;
    }

    public void setValor_total_operacao(BigDecimal valor_total_operacao) {
        this.valor_total_operacao = valor_total_operacao;
    }

    public void setNumero_agencia_retirada(String numero_agencia_retirada) {
        this.numero_agencia_retirada = numero_agencia_retirada;
    }
}
