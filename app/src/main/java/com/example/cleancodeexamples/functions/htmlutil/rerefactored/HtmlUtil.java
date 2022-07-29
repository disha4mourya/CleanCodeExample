package com.example.cleancodeexamples.functions.htmlutil.rerefactored;

import com.example.cleancodeexamples.functions.htmlutil.PageData;

public class HtmlUtil {
    public static String renderPageWithSetupsAndTeardowns(PageData pageData, boolean isSuite) throws Exception { if (isTestPage(pageData))
        includeSetupAndTeardownPages(pageData, isSuite); return pageData.getHtml();
    }

    private static void includeSetupAndTeardownPages(PageData pageData, boolean isSuite) {

    }

    private static boolean isTestPage(PageData pageData) {
        return false;
    }
}
