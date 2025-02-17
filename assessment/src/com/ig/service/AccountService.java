package com.ig.service;

import com.ig.model.Account;
import com.ig.exception.AccountNotFoundException;
import com.ig.exception.InvalidAmountException;
import com.ig.exception.LowBalanceException;

import java.util.ArrayList;
import java.util.List;

public class AccountService {
    private List<Account> accountList = new ArrayList<>();

    public AccountService() {
        try {
            accountList.add(new Account(101, "name1", Account.AccountType.SAVINGS, 5000f));
            accountList.add(new Account(102, "name2", Account.AccountType.CURRENT, 10000f));
            accountList.add(new Account(103, "name3", Account.AccountType.SAVINGS, 2000f));
            accountList.add(new Account(104, "name4", Account.AccountType.CURRENT, 8000f));
            accountList.add(new Account(105, "name5", Account.AccountType.SAVINGS, 1500f));
        } catch (Exception e) {
            System.out.println("Error initializing accounts: " + e.getMessage());
        }
    }

    public boolean isValidAccount(int accNumber) throws AccountNotFoundException {
        for (Account acc : accountList) {
            if (acc.getAccNumber().equals(accNumber)) {
                return true;
            }
        }
        throw new AccountNotFoundException("Account number " + accNumber + " not found.");
    }

    public void deposit(int accNumber, float amt) throws AccountNotFoundException, InvalidAmountException {
        if (isValidAccount(accNumber)) {
            for (Account acc : accountList) {
                if (acc.getAccNumber().equals(accNumber)) {
                    acc.deposit(amt);
                    System.out.println("Deposited " + amt + " to " + acc.getCustName() + "'s account.");
                    return;
                }
            }
        }
    }

    public void withdraw(int accNumber, float amt) throws AccountNotFoundException, InvalidAmountException, LowBalanceException {
        if (isValidAccount(accNumber)) {
            for (Account acc : accountList) {
                if (acc.getAccNumber().equals(accNumber)) {
                    acc.withdraw(amt);
                    System.out.println("Withdrawn " + amt + " from " + acc.getCustName() + "'s account.");
                    return;
                }
            }
        }
    }

    public float getBalance(int accNumber) throws AccountNotFoundException {
        if (isValidAccount(accNumber)) {
            for (Account acc : accountList) {
                if (acc.getAccNumber().equals(accNumber)) {
                    return acc.getBalance();
                }
            }
        }
        throw new AccountNotFoundException("Account number " + accNumber + " not found.");
    }
}
