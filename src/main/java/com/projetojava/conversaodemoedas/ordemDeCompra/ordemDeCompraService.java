package com.projetojava.conversaodemoedas.ordemDeCompra;

import org.springframework.stereotype.Service;

@Service
public class ordemDeCompraService {
    private final ordemDeCompraRepository ordemDeCompraRepository;

    public ordemDeCompraService(com.projetojava.conversaodemoedas.ordemDeCompra.ordemDeCompraRepository ordemDeCompraRepository) {
        this.ordemDeCompraRepository = ordemDeCompraRepository;
    }

    public ordemDeCompra salvar(ordemDeCompraDTO ordemDeCompraDTO){
        String usd = "usd";
        String eur = "eur";
        if(!ordemDeCompraDTO.getMoeda().toLowerCase().equals(usd) || !ordemDeCompraDTO.getMoeda().toLowerCase().equals(eur)){
            //throw exception
        }
        if(!ordemDeCompraDTO.getAgencia().chars().allMatch( Character::isDigit ) || ordemDeCompraDTO.getAgencia().length()!=4){
            //throw exception
        }

        ordemDeCompra novaOrdemDeCompra = new ordemDeCompra();
        novaOrdemDeCompra.setCpf(ordemDeCompraDTO.getCpf());
        novaOrdemDeCompra.setAgencia(ordemDeCompraDTO.getAgencia());
        novaOrdemDeCompra.setMoeda(ordemDeCompraDTO.getMoeda());
        novaOrdemDeCompra.setValor(ordemDeCompraDTO.getValor());
        return ordemDeCompraRepository.save(novaOrdemDeCompra);
    }
}
