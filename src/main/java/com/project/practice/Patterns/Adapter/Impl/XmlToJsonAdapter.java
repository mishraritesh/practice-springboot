package com.project.practice.Patterns.Adapter.Impl;

import com.project.practice.Patterns.Adapter.JsonPayment;

public class XmlToJsonAdapter implements JsonPayment{
    XMLPaymentProcessor xmlPaymentProcessor;

    public XmlToJsonAdapter(XMLPaymentProcessor xmlPaymentProcessor) {
        this.xmlPaymentProcessor = xmlPaymentProcessor;
    }

    @Override
    public void pay() {
        xmlPaymentProcessor.payWithXml();
    }
}
