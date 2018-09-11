package com.denizsalman;

// Implement the Account class
import java.util.ArrayList;
import java.util.Date;

public class Account {
	// Data fields
	private int id;
	private String name;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated;
	private ArrayList<Transaction> transactionsList = new ArrayList<>();
	// Constructors
	/** Creates a default account */
	Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date(); 
	}

	/** Creates an account with the specified id and initial balance */
	Account(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
		dateCreated = new Date();
	}

	public Account(int id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.dateCreated = new Date();
	}

	// Mutator methods
	/** Set id */
	public void setId(int newId) {
		id = newId;
	}

	/** Set balance */
	public void setBalance(double newBalance) {
		balance = newBalance;
	}

	/** Set annualInterestRate */
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}

	// Accessor methods
	/** Return id */
	public int getId() {
		return id;
	}

	/** Return balance */
	public double getBalance() {
		return balance;
	}

	/** Return annualInterestRate */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	/** Return dateCreated */
	public String getDateCreated() {
		return dateCreated.toString();
	}

	/** Return monthly interest rate */
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	// Methods
	/** Return monthly interest */
	public double getMonthlyInterest() {
		return balance * (getMonthlyInterestRate() / 100);
	}

	/** Decrease balance by amount */
	public void withdraw(double amount) {
		balance -= amount;
		Transaction transaction = new Transaction('a', amount,
				balance, "Para çekildi");
		transactionsList.add(transaction);

	}

	/** Increase balance by amount */
	public void deposit(double amount) {
		balance += amount;
		Transaction transaction = new Transaction('b', amount,
				balance, "Para yatırıldı");
		transactionsList.add(transaction);
	}

	public ArrayList<Transaction> getTransactionsList() {
		return transactionsList;
	}
}