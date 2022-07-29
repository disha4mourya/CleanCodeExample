package com.example.cleancodeexamples.functions.payroll.factorypattern;

import com.example.cleancodeexamples.functions.payroll.Money;

public abstract class Employee {
    public abstract boolean isPayday();

    public abstract Money calculatePay();

    public abstract void deliverPay(Money pay);
}
