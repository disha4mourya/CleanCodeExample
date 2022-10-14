Functions should either do something or answer something, but not both.

Example
```aidl
public boolean set(String attribute, String value);
```
Leads to
```aidl
if (set("username", "unclebob"))...
```

The author intended set to be a verb, but in the context of the if statement it feels like an adjective.
adjective - a word that tells us more about a noun
verb- a word used to describe an action, state, or occurrence.

One solution:

rename to : setAndCheckIfExists

```
if (attributeExists("username")) {
    setAttribute("username", "unclebob"); ...
}
```
The best solution is to separate out both
- Set the value
- Check if successfully set