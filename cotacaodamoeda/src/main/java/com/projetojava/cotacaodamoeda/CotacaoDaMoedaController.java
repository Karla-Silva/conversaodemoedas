package com.projetojava.cotacaodamoeda;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cotacao")
@RequiredArgsConstructor
public class CotacaoDaMoedaController {
    private final CotacaoDeMoedasService cotacaoDeMoedasService;

    @GetMapping("/eur")
    public ResponseEntity<CotacaoDaMoeda[]> cotacaoEurAtual() {
        return ResponseEntity.ok(cotacaoDeMoedasService.getCotacaoEUR());
    }

    @GetMapping("/usd")
    public ResponseEntity<CotacaoDaMoeda[]> cotacaoUsdAtual() {
        return ResponseEntity.ok(cotacaoDeMoedasService.getCotacaoUSD());
    }
}
