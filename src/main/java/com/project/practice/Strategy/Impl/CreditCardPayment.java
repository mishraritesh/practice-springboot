package com.project.practice.Strategy.Impl;

import com.project.practice.Strategy.PaymentStrategy;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paying "+amount+" through CreditCard ");
    }
}
