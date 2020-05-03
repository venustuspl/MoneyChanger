package pl.venustus.MoneyChanger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.venustus.MoneyChanger.Service.Data;
import pl.venustus.MoneyChanger.domain.CoinDto;
import pl.venustus.MoneyChanger.domain.CurrencyDto;
import pl.venustus.MoneyChanger.domain.GoldDto;

import java.io.IOException;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/")
public class CurrencyControler {


    @Autowired
    Data data;

    @RequestMapping(method = RequestMethod.GET, value = "/alloption")
    public List<CurrencyDto> getAllOptions() throws IOException {
        return data.getLastDayCurrencyList();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/goldprice")
    public List<GoldDto> getGoldPrice() throws IOException {
        return data.getGoldPrice();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/coinrate")
    public CoinDto getCoinDto(@RequestParam("symbol") String symbol) throws IOException {
        return data.getCoinRate(symbol);
    }
}
