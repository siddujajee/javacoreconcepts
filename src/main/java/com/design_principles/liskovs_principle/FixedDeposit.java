package com.design_principles.liskovs_principle;

public class FixedDeposit implements BankAccount {
    @Override
    public void withdraw() {
        throw new WithdrawalNotAllowedException("Withdrawal isn't possible for fixed deposit");
    }

    @Override
    public void deposit() {
        System.out.println("amount deposit to fixed deposit account");
    }

    public static void main(String[] args) {
        FixedDeposit fd = new FixedDeposit();
        fd.withdraw();
    }

    public static class WithdrawalNotAllowedException extends RuntimeException {
        public WithdrawalNotAllowedException(String message) {
            super(message);
        }
    }
}
