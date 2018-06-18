package com.master.domain;

import java.math.BigDecimal;

/**
 * Created by Administrator on 2018/6/18 0018.
 */
public class Product {
    private int id;
    private String name;
    private BigDecimal price;
    private boolean inStock;

    public Product() {
    }

    public Product(int id, String name, BigDecimal price, boolean inStock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.inStock = inStock;
    }

    public Product(String name, BigDecimal price, boolean inStock) {
        this.name = name;
        this.price = price;
        this.inStock = inStock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", inStock=" + inStock +
                '}';
    }
}
