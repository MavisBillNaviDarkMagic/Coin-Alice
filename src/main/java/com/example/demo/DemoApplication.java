package com.example.demo;

public class DemoApplication {

    public static void main(String[] args) {
        // Create a new currency with an initial value
        Currency contentCoin = new Currency("ContentCoin", "CC", 0.01);

        // Create a new user
        User user = new User("Christ Alucard IV");

        // Add the currency to the user's wallet
        user.getWallet().addCurrency(contentCoin, 0.0);

        // Create a content creation service
        ContentCreationService contentCreationService = new ContentCreationService(contentCoin);

        // Simulate content creation using generative AI
        System.out.println("Initial balance for " + user.getName() + ": " + user.getWallet().getBalance(contentCoin) + " " + contentCoin.getSymbol());
        System.out.println("Initial value in USD: " + user.getWallet().getBalance(contentCoin) * contentCoin.getValue());

        contentCreationService.createContent(user, "Write a story about a brave robot.");

        System.out.println("Final balance for " + user.getName() + ": " + user.getWallet().getBalance(contentCoin) + " " + contentCoin.getSymbol());
        System.out.println("Final value in USD: " + user.getWallet().getBalance(contentCoin) * contentCoin.getValue());
    }
}
