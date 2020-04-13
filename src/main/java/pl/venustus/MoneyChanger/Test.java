package pl.venustus.MoneyChanger;

import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import pl.venustus.MoneyChanger.domain.Currency;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {


        String uri = "http://api.nbp.pl/api/exchangerates/tables/a/?format=json";
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();

        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>( headers);

        String result = restTemplate.exchange(uri, HttpMethod.GET, entity, String.class).getBody();

        System.out.println(result);
    }
}