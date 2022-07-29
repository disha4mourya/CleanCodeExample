package com.example.cleancodeexamples.functions.payroll.factorypattern;

import com.example.cleancodeexamples.functions.payroll.InvalidEmployeeType;

public interface EmployeeFactory {
    public Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeType;
}

