package com.project.practice.Patterns.Strategy;

public class PaymentProcessor {
    PaymentStrategy strategy;
    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void pay(int amount){
        strategy.pay(amount);
    }
}
