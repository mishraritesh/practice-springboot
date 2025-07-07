package com.project.practice.Patterns.Strategy;

import com.project.practice.Patterns.Strategy.Impl.CreditCardPayment;
import com.project.practice.Patterns.Strategy.Impl.PayPalPayment;
import com.project.practice.Patterns.Strategy.Impl.UpiPayment;

public class PaymentUI {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        processor.setStrategy(new CreditCardPayment());
        processor.pay(100);

        processor.setStrategy(new UpiPayment());
        processor.pay(120);

        processor.setStrategy(new PayPalPayment());
        processor.pay(101);
    }
}
