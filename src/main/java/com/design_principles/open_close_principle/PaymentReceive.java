package com.design_principles.open_close_principle;

public interface PaymentReceive {
    public void receivePayment();
}

// if there will be any more payment mode create a new class for each mode of
// payment
// it keeps class/interface open for extension and closed for modification
// hence achieved open close principle
