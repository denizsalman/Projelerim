package com.denizsalman;

public class SavingAccount extends Account {

    public SavingAccount() {

    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount > 0) {
            setBalance(getBalance() - amount);
        }
    }
}
