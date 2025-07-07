package com.project.practice.Patterns.Adapter;

import com.project.practice.Patterns.Adapter.Impl.JsonPaymentProcessor;
import com.project.practice.Patterns.Adapter.Impl.XMLPaymentProcessor;
import com.project.practice.Patterns.Adapter.Impl.XmlToJsonAdapter;

public class PaymentProcessor {

    public static void main(String[] args) {
        JsonPayment jsonPayment = new JsonPaymentProcessor();
        jsonPayment.pay();

        JsonPayment xmlPayment = new XmlToJsonAdapter( new XMLPaymentProcessor());
        xmlPayment.pay();
    }
}
