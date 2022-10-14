Problems with Payroll.java:

1. Large
2. Does more than one thing
3. Violets Single responsibility principle
4. Violets Open Close Principle
5. Unlimited other functions that will check these conditions for other calculation like 
```aidl
isPayDay(Employee e, Date date)
```
OR
```aidl
deliverPay(Employee e, Money pay)
```

Solution:

Use Abstract Factory pattern

- The factory will use the switch statement to create appropriate instances of the derivatives of Employee
- Various other functions would be part of Employee interface like:
  - calculatePay
  - isPayDay
  - deliverPay

We can tolerate switch statement if they come only once.
