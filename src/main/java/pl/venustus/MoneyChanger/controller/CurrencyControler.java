package pl.venustus.MoneyChanger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import pl.venustus.MoneyChanger.domain.Currency;

@Controller
public class CurrencyControler {

    @Autowired
    Currency c;

    private String url = "http://api.nbp.pl/api/exchangerates/tables/a";

    @GetMapping("/")
    public String hello(){

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(url, String.class);
        return result;
    }


}
