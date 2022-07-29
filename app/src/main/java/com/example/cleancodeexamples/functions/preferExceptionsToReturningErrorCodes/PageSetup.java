package com.example.cleancodeexamples.functions.preferExceptionsToReturningErrorCodes;

import static com.example.cleancodeexamples.functions.preferExceptionsToReturningErrorCodes.Status.E_OK;
import static com.example.cleancodeexamples.functions.preferExceptionsToReturningErrorCodes.Status.E_ERROR;

public class PageSetup {
    public Page page;
    public Registry registry;
    public Logger logger;
    private ConfigKeys configKeys;

    public Status delete() {
        if (deletePage(page) == E_OK) {
            if (registry.deleteReference(page.name) == E_OK) {
                if (configKeys.deleteKey(page.name.makeKey()) == E_OK) {
                    logger.log("page deleted");
                } else {
                    logger.log("configKey not deleted");
                }
            } else {
                logger.log("deleteReference from registry failed");
            }
        } else {
            logger.log("delete failed");
            return E_ERROR;
        }
        return null;
    }

    private Status deletePage(Page page) {
        return E_OK;
    }

}
