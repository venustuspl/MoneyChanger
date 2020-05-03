package pl.venustus.MoneyChanger.domain;

public class CoinDto {
    private String symbol;
    private String price;

    public CoinDto() {
    }

    public CoinDto(String symbol, String price) {
        this.symbol = symbol;
        this.price = price;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
