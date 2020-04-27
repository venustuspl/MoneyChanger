package pl.venustus.MoneyChanger;

import com.google.gson.Gson;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;
import pl.venustus.MoneyChanger.Service.Data;
import pl.venustus.MoneyChanger.domain.DayTableDto;

import java.util.Arrays;

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
        result = result.substring(0, length - 2);
        System.out.println(result);

        DayTableDto data = new Gson().fromJson(result, DayTableDto.class);
        System.out.println("---------------------");
        System.out.println(data.getTable());
        System.out.println(data.getNo());
        System.out.println(data.getEffectiveDate());
        data.getRates().stream().forEach(System.out::println);

        Data dataservice = new Data();
        System.out.println(dataservice.getGoldPrice().getPrice());
    }
}