package pl.venustus.MoneyChanger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import pl.venustus.MoneyChanger.domain.Currency;

import java.util.Arrays;


@Controller
public class CurrencyControler {

    public static final String uri = "http://api.nbp.pl/api/exchangerates/tables/a/?format=json";

    @GetMapping("/all")
    public void hello(){
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();

        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>( headers);

        ResponseEntity<Currency[]> result = restTemplate.exchange(uri, HttpMethod.GET, entity, Currency[].class);

        System.out.println(result);

    }

}
