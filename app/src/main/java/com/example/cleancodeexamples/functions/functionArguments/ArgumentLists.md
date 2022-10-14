variable number of arguments, nothing but argument list

```aidl
String.format("%s worked %.2f hours.", name, hours);
```

By means it's dyadic

```aidl
public String format(String format, Object... args)
```
Functions like this can be monad, dyads or even triads

```aidl
void monad(Integer... args);
void dyad(String name, Integer... args);
void triad(String name, int count, Integer... args);
```
