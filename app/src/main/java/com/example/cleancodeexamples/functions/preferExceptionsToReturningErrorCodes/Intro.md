Returning error codes from command functions is a subtle violation of Command Query Separation.

```aidl
if (deletePage(page) == E_OK)
```

No Verb/adjective confusion but leads to nested structure

Given Example
[PageSetup](./problemstatement/PageSetup.java)

Rather, use exceptions instead of returning error code, then the error processing code can be separated

Given Example
[RefactoredPageSetup](./solutions/RefactoredPageSetup.java)


### Extract Try/Catch Blocks

Confuses the structure of the code and mix error processing with Normal processing.

Better to extract the bodies of try and catch to their own

Example:
[ExtractTryCatch](./solutions/ExtractTryCatch.java)

### Error Handling Is One Thing

Functions should do only one thing and error handling is one thing.
If try is first statement in function
catch/final should be the last blocks

### The Error.java Dependency Magnet

[Error](./Error.java)

Classes like this are dependency magnet; many other classes must import and use them.
If this enum changes all other needs to be changed.

When you use exceptions rather than error codes, then new exceptions are derivatives of the exception class.

