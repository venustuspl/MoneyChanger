package pl.venustus.MoneyChanger.domain;

public class GoldDto {

    private String data;
    private String cena;

    public GoldDto(String date, String price) {
        this.data = date;
        this.data = price;
    }

    public String getDate() {
        return data;
    }

    public void setDate(String date) {
        this.data = date;
    }

    public String getPrice() {
        return cena;
    }

    public void setPrice(String price) {
        this.cena = price;
    }
}
