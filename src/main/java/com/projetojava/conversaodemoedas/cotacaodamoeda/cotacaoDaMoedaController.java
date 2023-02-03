package com.projetojava.conversaodemoedas.cotacaodamoeda;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cotacao")
@RequiredArgsConstructor
public class cotacaoDaMoedaController {
    private final CotacaoDeMoedasService cotacaoDeMoedasService;

    @GetMapping("/eur")
    public ResponseEntity<cotacaoDaMoeda[]> cotacaoEurAtual() {
        return ResponseEntity.ok(cotacaoDeMoedasService.getCotacaoEUR());
    }

    @GetMapping("/usd")
    public ResponseEntity<cotacaoDaMoeda[]> cotacaoUsdAtual() {
        return ResponseEntity.ok(cotacaoDeMoedasService.getCotacaoUSD());
    }
}
