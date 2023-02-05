package com.projetojava.cotacaodamoeda;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CotacaoDeMoedasService {
    private RestTemplate restTemplate;

    public CotacaoDeMoedasService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    private final static String URL_EUR = "https://economia.awesomeapi.com.br/EUR/";
    private final static String URL_USD = "https://economia.awesomeapi.com.br/USD/";

    public CotacaoDaMoeda[] getCotacaoEUR(){
        return restTemplate.getForObject(URL_EUR, CotacaoDaMoeda[].class);
    }

    public CotacaoDaMoeda[] getCotacaoUSD(){
        return restTemplate.getForObject(URL_USD, CotacaoDaMoeda[].class);
    }

}
