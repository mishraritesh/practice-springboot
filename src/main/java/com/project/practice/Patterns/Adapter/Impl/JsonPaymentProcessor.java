package com.project.practice.Patterns.Adapter.Impl;

import com.project.practice.Patterns.Adapter.JsonPayment;

public class JsonPaymentProcessor implements JsonPayment {
    @Override
    public void pay() {
        System.out.println("jsonPayment");
    }
}
