package com.example.cleancodeexamples.functions.preferExceptionsToReturningErrorCodes;

public class Registry {
    public Status deleteReference(PageName name) {
        return Status.E_OK;
    }
}
