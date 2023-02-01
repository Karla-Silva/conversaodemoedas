package com.projetojava.conversaodemoedas.cotacaodamoeda;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class cotacaoDeMoedasService {
    private RestTemplate restTemplate;

    public cotacaoDeMoedasService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    private final static String URL_EUR = "https://economia.awesomeapi.com.br/EUR/";
    private final static String URL_USD = "https://economia.awesomeapi.com.br/USD/";

    public cotacaoDaMoeda[] getCotacaoEUR(){
        return restTemplate.getForObject(URL_EUR, cotacaoDaMoeda[].class);
    }

    public cotacaoDaMoeda[] getCotacaoUSD(){
        return restTemplate.getForObject(URL_USD, cotacaoDaMoeda[].class);
    }

}
