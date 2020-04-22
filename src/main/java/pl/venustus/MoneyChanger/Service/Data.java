package pl.venustus.MoneyChanger.Service;

import com.google.gson.Gson;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.venustus.MoneyChanger.domain.CurrencyDto;
import pl.venustus.MoneyChanger.domain.DayTableDto;

import java.util.Arrays;
import java.util.List;

@Service
public class Data {

    private static final String uri = "http://api.nbp.pl/api/exchangerates/tables/a/?format=json";


    public static DayTableDto getLastDayTableDto() {
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

        return data;
    }

    public List<CurrencyDto> getLastDayCurrencyList() {
        return getLastDayTableDto().getRates();
    }

    public String getDateOfLastDayTableDto() {
        return getLastDayTableDto().getEffectiveDate();
    }
}
