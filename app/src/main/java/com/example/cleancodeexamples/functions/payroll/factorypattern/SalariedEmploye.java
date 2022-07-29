package com.example.cleancodeexamples.functions.payroll.factorypattern;

import com.example.cleancodeexamples.functions.payroll.Money;

public class SalariedEmploye extends Employee {
    public SalariedEmploye(EmployeeRecord r) {
        super();
    }

    @Override
    public boolean isPayday() {
        return false;
    }

    @Override
    public Money calculatePay() {
        return null;
    }

    @Override
    public void deliverPay(Money pay) {

    }
}
