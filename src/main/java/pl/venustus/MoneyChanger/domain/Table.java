package pl.venustus.MoneyChanger.domain;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Table {

    private Long id;
    private String table;
    private String no;
   // private LocalDate effectiveDate;
    private ArrayList<Currency> rates;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public ArrayList<Currency> getRates() {
        return rates;
    }

    public void setRates(ArrayList<Currency> rates) {
        this.rates = rates;
    }
}
