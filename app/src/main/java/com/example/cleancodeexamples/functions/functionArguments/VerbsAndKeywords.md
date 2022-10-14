In monad case function and argument should form verb/noun pair

```aidl
write(name) -> writeField(name)
```

In more than one arguments case, it's better to assert arguments name to simplify it
```aidl
assertEquals -> assertExpectedEqualsActual(expected, actual)
```
