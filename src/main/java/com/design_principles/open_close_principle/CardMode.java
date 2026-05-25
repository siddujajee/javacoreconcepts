package com.design_principles.open_close_principle;

public class CardMode implements PaymentReceive {
    @Override
    public void receivePayment() {
        System.out.println("user choose to pay via card");
    }

    public static void main(String[] args) {
        new CardMode().receivePayment();
    }
}
