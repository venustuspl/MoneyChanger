package pl.venustus.MoneyChanger.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.List;


public class Table {

    private Long id;
    private String table;
    private String no;
    private LocalDate effectiveDate;
    private List<Currency> rates;
}
