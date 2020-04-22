package pl.venustus.MoneyChanger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
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

    @RequestMapping(method = RequestMethod.GET, value = "/lastdate")
    public String getLastDate() {
        return data.getDateOfLastDayTableDto();
    }

//    @RequestMapping(method = RequestMethod.GET, value = "/")
//    public String getMap(Model model) throws IOException {
//        model.addAttribute("lastdaytable", data.getLastDayTableDto());
//        return "index";
//
//    }
//
//    @RequestMapping(method = RequestMethod.GET, value = "/alldata")
//    public List<CurrencyDto> getAllRates() throws IOException {
//        System.out.println("---");
//        return data.getLastDayTableDto();
//    }

    @RequestMapping(method = RequestMethod.GET, value = "/alloption")
    public List<CurrencyDto> getAllOptions() throws IOException {
        System.out.println("getAllOptions");
        return data.getLastDayCurrencyList();
    }

}
