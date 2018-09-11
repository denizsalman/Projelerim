package com.denizsalman;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.withdraw(100);
        System.out.println(checkingAccount);

        SavingAccount savingAccount = new SavingAccount();
        savingAccount.withdraw(100);
        System.out.println(savingAccount);

    }
}
