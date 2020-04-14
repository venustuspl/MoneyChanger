package pl.venustus.MoneyChanger.domain;

import java.util.ArrayList;

public class DayTableDto {

    private String table;
    private String no;
    private String effectiveDate;
    private ArrayList<CurrencyDto> rates;

    public DayTableDto() {
    }

    public DayTableDto(String table, String no, String effectiveDate, ArrayList<CurrencyDto> rates) {
        this.table = table;
        this.no = no;
        this.effectiveDate = effectiveDate;
        this.rates = rates;
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

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public ArrayList<CurrencyDto> getRates() {
        return rates;
    }

    public void setRates(ArrayList<CurrencyDto> rates) {
        this.rates = rates;
    }
}
