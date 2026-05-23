package com.design_principles.open_close_principle;

public class CashMode implements PaymentReceive {
    public void receivePayment() {
        System.out.println("User choose to pay via cash");
    }

    public static void main(String[] args) {
        new CashMode().receivePayment();
    }
}
