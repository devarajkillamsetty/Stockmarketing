package com.product;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class StockRegister {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String stockname;
    private Double price;

    @OneToMany(mappedBy = "stock", cascade = CascadeType.ALL)
    private List<StockPriceHistory> priceHistory;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStockname() {
        return stockname;
    }

    public void setStockname(String stockname) {
        this.stockname = stockname;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<StockPriceHistory> getPriceHistory() {
        return priceHistory;
    }

    public void setPriceHistory(List<StockPriceHistory> priceHistory) {
        this.priceHistory = priceHistory;
    }

    @Override
    public String toString() {
        return "StockRegister [id=" + id + ", stockname=" + stockname + ", price=" + price + "]";
    }
}
