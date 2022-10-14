package com.example.cleancodeexamples.functions.switchpayroll.factorypattern;

import com.example.cleancodeexamples.functions.switchpayroll.problemstatement.Money;

public abstract class Employee {
    public abstract boolean isPayday();

    public abstract Money calculatePay();

    public abstract void deliverPay(Money pay);
}
