package pl.venustus.MoneyChanger.domain;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class DayTable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String dayTable;
    private String no;
    private LocalDate effectiveDate;

    public DayTable() {
    }

    public DayTable(Long id, String dayTable, String no, LocalDate effectiveDate) {
        this.id = id;
        this.dayTable = dayTable;
        this.no = no;
        this.effectiveDate = effectiveDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDayTable() {
        return dayTable;
    }

    public void setTable(String table) {
        this.dayTable = table;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

}
