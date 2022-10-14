package com.example.cleancodeexamples.functions.switchpayroll.factorypattern;

import com.example.cleancodeexamples.functions.switchpayroll.problemstatement.Money;

public class CommissionedEmployee extends Employee {
    public CommissionedEmployee(EmployeeRecord r) {
        super(

        );
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
