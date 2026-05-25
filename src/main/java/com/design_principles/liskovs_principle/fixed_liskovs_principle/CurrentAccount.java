package com.design_principles.liskovs_principle.fixed_liskovs_principle;

public class CurrentAccount implements WithdrawableAccounts {
    @Override
    public void withdraw() {
        System.out.println("amount withdrawn from current account");
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
