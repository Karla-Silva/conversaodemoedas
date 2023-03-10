package com.projetojava.ordemdecompra;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RequiredArgsConstructor
@RestController
@RequestMapping("/ordemdecompra")
public class OrdemDeCompraController {
    private final OrdemDeCompraService service;
    @PostMapping
    @ResponseBody
    public ResponseEntity<CalculoCotacao> add(@RequestBody OrdemDeCompraDTO ordem) {
        if(ordem.getAgencia() == null || ordem.getValor() == null || ordem.getCpf() == null || ordem.getMoeda() == null){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Campos não preenchidos");
        }
        if(!ordem.getMoeda().toLowerCase().equals("usd") && !ordem.getMoeda().toLowerCase().equals("eur")){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Moeda incorreta. Escolha entre USD e EUR");
        }
        if(!ordem.getAgencia().chars().allMatch( Character::isDigit ) || ordem.getAgencia().length()!=4){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Agencia incorreta. A agencia deve conter apenas 4 digitos numericos.");
        }
        try{
            CalculoCotacao result = service.salvarOrdemDeCompra(ordem.toEntity());
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Ocorreu um erro desconhecido");
        }

//        return ResponseEntity.created(URI.create("/ordemdecompra/" + ordem.getCpf())).build();
    }
}
