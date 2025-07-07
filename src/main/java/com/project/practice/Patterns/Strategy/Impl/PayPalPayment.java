package com.project.practice.Patterns.Strategy.Impl;

import com.project.practice.Patterns.Strategy.PaymentStrategy;

public class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paying "+amount+" through PayPal ");
    }
}
