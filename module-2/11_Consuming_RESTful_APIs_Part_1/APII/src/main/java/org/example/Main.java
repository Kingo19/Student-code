package org.example;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Main {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<ExchangeRate> response = restTemplate.getForEntity("https://api.exchangerate-api.com/v4/latest/ETB", ExchangeRate.class);

        ExchangeRate rate = response.getBody();

        System.out.println(rate.getBase());
        System.out.println(rate.getConversionRate());
        System.out.println(rate.getDate());
        System.out.println(rate.getLastUpdated());

    }


}