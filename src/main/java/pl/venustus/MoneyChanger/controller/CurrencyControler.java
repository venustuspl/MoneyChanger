package pl.venustus.MoneyChanger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.venustus.MoneyChanger.Service.Data;
import pl.venustus.MoneyChanger.domain.DayTableDto;

import java.io.IOException;


@Controller
public class CurrencyControler {

    @Autowired
    Data data;

    @GetMapping("/lastdaytable")
    public DayTableDto hello() {
        return Data.getLastDayTableDto();
    }

    @GetMapping("/")
    public String getMap(Model model) throws IOException {
        model.addAttribute("lastdaytable", Data.getLastDayTableDto());

        return "index";

    }

}
