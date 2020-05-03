package pl.venustus.MoneyChanger.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Coin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String symbol;
    private String price;

    public Coin() {
    }

    public Coin(String symbol, String price) {
        this.symbol = symbol;
        this.price = price;
    }
}
