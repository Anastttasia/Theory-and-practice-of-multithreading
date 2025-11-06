package ru.vladykina.demo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")

public class Product {

    @Id
    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_description")
    private double productDescription;

    @Column(name = "price", nullable = false)
    private double price;

    public Product(){

    }

    public Product(String productName, double price){
        this.productName = productName;
        this.price = price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductDescription(double productDescription) {
        this.productDescription = productDescription;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productDescription=" + productDescription +
                ", price=" + price +
                '}';
    }
}
