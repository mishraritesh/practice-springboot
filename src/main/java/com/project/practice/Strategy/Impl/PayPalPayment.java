package com.project.practice.Strategy.Impl;

import com.project.practice.Strategy.PaymentStrategy;

public class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paying "+amount+" through PayPal ");
    }
}
