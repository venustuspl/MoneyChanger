package pl.venustus.MoneyChanger;

import com.google.gson.Gson;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;
import pl.venustus.MoneyChanger.domain.GoldDto;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        final String uriGold = "https://api.nbp.pl/api/cenyzlota";

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();

        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        String result = String.valueOf(restTemplate.exchange(uriGold, HttpMethod.GET, entity, String.class).getBody());

        int length = result.length();

        result = result.substring(1, length);
        result = result.substring(0, length - 2);
        System.out.println(result);

        GoldDto data = new Gson().fromJson(result, GoldDto.class);
        System.out.println(data.getPrice());
    }
}