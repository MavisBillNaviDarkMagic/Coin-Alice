package com.example.demo;

public class User {
    private String name;
    private Wallet wallet;

    public User(String name) {
        this.name = name;
        this.wallet = new Wallet();
    }

    public String getName() {
        return name;
    }

    public Wallet getWallet() {
        return wallet;
    }
}
