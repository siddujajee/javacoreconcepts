package com.design_principles.liskovs_principle.fixed_liskovs_principle;

public class FixedDeposit implements NonWithdrawableAccounts {
    @Override
    public void deposit() {
        System.out.println("amount deposited to fixed deposit");
    }

    public static void main(String[] args) {
        new FixedDeposit().deposit();
    }
}
