package com.example.demo;

public class Currency {
    private String name;
    private String symbol;
    private double value; // Represents the value of one unit in a reference currency (e.g., USD)

    public Currency(String name, String symbol, double value) {
        this.name = name;
        this.symbol = symbol;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
