package com.example.cleancodeexamples.functions.htmlutil.refactored;

import com.example.cleancodeexamples.functions.htmlutil.PageData;
import com.example.cleancodeexamples.functions.htmlutil.WikiPage;

public class HtmlUtil {
    public static String renderPageWithSetupsAndTeardowns(PageData pageData, boolean isSuite
    ) throws Exception {
        boolean isTestPage = pageData.hasAttribute("Test"); if (isTestPage) {
            WikiPage testPage = pageData.getWikiPage(); StringBuffer newPageContent = new StringBuffer(); includeSetupPages(testPage, newPageContent, isSuite); newPageContent.append(pageData.getContent()); includeTeardownPages(testPage, newPageContent, isSuite); pageData.setContent(newPageContent.toString());
        }
        return pageData.getHtml(); }

    private static void includeTeardownPages(WikiPage testPage, StringBuffer newPageContent, boolean isSuite) {

    }

    private static void includeSetupPages(WikiPage testPage, StringBuffer newPageContent, boolean isSuite) {

    }
}
