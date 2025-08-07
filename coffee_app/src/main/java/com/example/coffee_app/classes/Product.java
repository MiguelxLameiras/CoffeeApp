
package com.example.coffee_app.classes;

import jakarta.persistence.*;

@Entity // Indica que esta classe é uma tabela no banco
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incremento
    private Long id;

    @Column(nullable = false) // Campo obrigatório
    private String name;

    private double price;
    private int amount;

    public Product(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}