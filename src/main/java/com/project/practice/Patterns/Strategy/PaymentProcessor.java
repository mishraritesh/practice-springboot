package com.project.practice.Patterns.Strategy;

public class PaymentProcessor implements PaymentStrategy {
    PaymentStrategy strategy;
    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void pay(int amount){
        strategy.pay(amount);
    }
}
