package pl.venustus.MoneyChanger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.venustus.MoneyChanger.Service.Data;
import pl.venustus.MoneyChanger.domain.CurrencyDto;

import java.io.IOException;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/")
public class CurrencyControler {

    @Autowired
    Data data;

    @GetMapping("/lastdaytable")
    public List<CurrencyDto> hello() {
        System.out.println("----");
        return data.getLastDayTableDto();
    }

//    @RequestMapping(method = RequestMethod.GET, value = "/")
//    public String getMap(Model model) throws IOException {
//        model.addAttribute("lastdaytable", data.getLastDayTableDto());
//        return "index";
//
//    }

    @RequestMapping(method = RequestMethod.GET, value = "/alldata")
    public List<CurrencyDto> getAllRates() throws IOException {
        System.out.println("---");
        return data.getLastDayTableDto();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/alloption")
    public List<CurrencyDto> getAllOptions() throws IOException {
        System.out.println("getAllOptions");
        return data.getLastDayTableDto();
    }

}
