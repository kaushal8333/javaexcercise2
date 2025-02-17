package com.ig.model;

import com.ig.exception.InvalidAmountException;
import com.ig.exception.LowBalanceException;

public class Account {
    private Integer accNumber;
    private String custName;
    private AccountType type; 
    private Float balance;

    public enum AccountType {
        SAVINGS, CURRENT
    }

    public Account(Integer accNumber, String custName, AccountType type, Float balance) 
            throws InvalidAmountException, LowBalanceException {
        if (balance < 0) {
            throw new InvalidAmountException("Initial balance cannot be negative.");
        }

        if ((type == AccountType.SAVINGS && balance < 1000) ||
            (type == AccountType.CURRENT && balance < 5000)) {
            throw new LowBalanceException("Initial balance is too low for the account type.");
        }

        this.accNumber = accNumber;
        this.custName = custName;
        this.type = type;
        this.balance = balance;
    }

    public Integer getAccNumber() { return accNumber; }
    public String getCustName() { return custName; }
    public AccountType getType() { return type; }
    public Float getBalance() { return balance; }

    public void deposit(float amt) throws InvalidAmountException {
        if (amt <= 0) {
            throw new InvalidAmountException("Deposit amount must be positive.");
        }
        this.balance += amt;
    }

    public void withdraw(float amt) throws InvalidAmountException, LowBalanceException {
        if (amt < 500) {
            throw new InvalidAmountException("Minimum withdrawal amount is 500.");
        }
        if ((this.type == AccountType.SAVINGS && this.balance - amt < 1000) ||
            (this.type == AccountType.CURRENT && this.balance - amt < 5000)) {
            throw new LowBalanceException("Insufficient funds after withdrawal.");
        }
        this.balance -= amt;
    }

    @Override
    public String toString() {
        return "Account{AccNo=" + accNumber + ", CustName='" + custName + "', Type=" + type + ", Balance=" + balance + "}";
    }
}
