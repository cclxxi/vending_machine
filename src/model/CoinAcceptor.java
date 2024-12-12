package src.model;

import src.Interfaces.MoneyAcceptor;

public class CoinAcceptor implements MoneyAcceptor {
    private int amount;
    private int balance;

    public CoinAcceptor(int initialBalance) {
        this.balance = initialBalance;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public void addFundsToMachine(int amount) {
        balance += amount;
    }

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public void resetBalance() {
        balance = 0;
    }
}
