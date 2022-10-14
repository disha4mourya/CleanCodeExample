package com.example.cleancodeexamples.functions.switchpayroll.factorypattern;

import com.example.cleancodeexamples.functions.switchpayroll.problemstatement.InvalidEmployeeType;

public interface EmployeeFactory {
    public Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeType;
}

