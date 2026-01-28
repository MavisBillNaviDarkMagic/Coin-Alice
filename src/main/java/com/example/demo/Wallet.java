kpackage com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class Wallet {
    private Map<Currency, Double> balances = new HashMap<>();

    public void addCurrency(Currency currency, double initialBalance) {
        balances.put(currency, initialBalance);
    }

    public void deposit(Currency currency, double amount) {
        if (balances.containsKey(currency)) {
            balances.put(currency, balances.get(currency) + amount);
        }
    }

    public boolean withdraw(Currency currency, double amount) {
        if (balances.containsKey(currency) && balances.get(currency) >= amount) {
            balances.put(currency, balances.get(currency) - amount);
            return true;
        }
        return false;
    }

    public double getBalance(Currency currency) {
        return balances.getOrDefault(currency, 0.0);
    }
}
