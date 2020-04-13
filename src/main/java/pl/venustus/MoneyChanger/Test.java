package pl.venustus.MoneyChanger;

import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import org.springframework.http.*;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.client.RestTemplate;
import pl.venustus.MoneyChanger.domain.Currency;
import pl.venustus.MoneyChanger.domain.Table;

import java.util.Arrays;
import java.util.Map;

public class Test {
    public static void main(String[] args) {

        String uri = "http://api.nbp.pl/api/exchangerates/tables/a/?format=json";

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();

        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        String result = String.valueOf(restTemplate.exchange(uri, HttpMethod.GET, entity, String.class).getBody());

        int length = result.length();

        result = result.substring(1, length);
        result = result.substring(0 , length -2);
        System.out.println(result);

        Table data = new Gson().fromJson(result, Table.class);
        data.getRates().stream().forEach(System.out::println);
    }
}