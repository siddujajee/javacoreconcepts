package com.design_principles.liskovs_principle;

public class CurrentAccount implements BankAccount {
    @Override
    public void withdraw() {
        System.out.println("amount withdrawl from current account");
    }

    @Override
    public void deposit() {
        System.out.println("amount deposited to current account");
    }

    public static void main(String[] args) {
        new CurrentAccount().withdraw();
        new CurrentAccount().deposit();
    }
}
