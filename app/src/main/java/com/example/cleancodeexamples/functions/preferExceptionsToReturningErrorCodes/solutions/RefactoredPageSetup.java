package com.example.cleancodeexamples.functions.preferExceptionsToReturningErrorCodes.solutions;

import com.example.cleancodeexamples.functions.preferExceptionsToReturningErrorCodes.supportingfiles.ConfigKeys;
import com.example.cleancodeexamples.functions.preferExceptionsToReturningErrorCodes.supportingfiles.Logger;
import com.example.cleancodeexamples.functions.preferExceptionsToReturningErrorCodes.supportingfiles.Page;
import com.example.cleancodeexamples.functions.preferExceptionsToReturningErrorCodes.supportingfiles.Registry;

public class RefactoredPageSetup {
    public Page page;
    public Registry registry;
    public Logger logger;
    private ConfigKeys configKeys;

    void delete() {
        try {
            deletePage(page);
            registry.deleteReference(page.name);
            configKeys.deleteKey(page.name.makeKey());
        } catch (Exception e) {
            logger.log(e.getMessage());
        }
    }

    private void deletePage(Page page) {

    }
}
