package com.example.cleancodeexamples.functions.preferExceptionsToReturningErrorCodes.solutions;

import com.example.cleancodeexamples.functions.preferExceptionsToReturningErrorCodes.supportingfiles.ConfigKeys;
import com.example.cleancodeexamples.functions.preferExceptionsToReturningErrorCodes.supportingfiles.Logger;
import com.example.cleancodeexamples.functions.preferExceptionsToReturningErrorCodes.supportingfiles.Page;
import com.example.cleancodeexamples.functions.preferExceptionsToReturningErrorCodes.supportingfiles.Registry;

public class ExtractTryCatch {
    public Page page;
    public Registry registry;
    public Logger logger;
    private ConfigKeys configKeys;

    public void delete(Page page) {
        try {
            deletePageAndAllReferences(page);
        } catch (Exception e) {
            logError(e);
        }
    }

    private void deletePageAndAllReferences(Page page) throws Exception {
        deletePage(page);
        registry.deleteReference(page.name);
        configKeys.deleteKey(page.name.makeKey());
    }

    private void deletePage(Page page) {

    }

    private void logError(Exception e) {
        logger.log(e.getMessage());
    }
}
