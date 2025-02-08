package com.product;

import jakarta.persistence.*;

@Entity
public class UserStock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer userId;

    @ManyToOne
    @JoinColumn(name = "stock_id")
    private StockRegister stock;

    private Integer quantity;

    private Double purchasePrice;  // 🟢 Ensure this field is present

    public UserStock() {}

    public UserStock(Integer userId, StockRegister stock, Integer quantity, Double purchasePrice) {
        this.userId = userId;
        this.stock = stock;
        this.quantity = quantity;
        this.purchasePrice = purchasePrice;
    }

    public Integer getId() {
        return id;
    }

    public Integer getUserId() {
        return userId;
    }

    public StockRegister getStock() {
        return stock;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getPurchasePrice() {  // 🟢 Add this method
        return purchasePrice;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setPurchasePrice(Double purchasePrice) {  // 🟢 Add this method
        this.purchasePrice = purchasePrice;
    }
}
