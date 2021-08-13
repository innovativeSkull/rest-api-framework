package rest.listener.custom.html;

import static j2html.TagCreator.*;
import static rest.listener.custom.html.HTMLBlocks.*;

public class HTMLGenerator {

    private static final String REPORT_PAGE_TITLE = "Test Execution Report";
    private static final String REPORT_TITLE = "Test Execution";

    public HTMLGenerator() {

    }

    public String getHTMLPage() {
        return html(
                head(
                        title(REPORT_PAGE_TITLE),
                        link().withHref("https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css").withRel("stylesheet").attr("integrity", "sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We").attr("crossorigin", "anonymous"),
                        script().withSrc("https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js").attr("integrity", "sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj").attr("crossorigin", "anonymous")
                ),
                body(
                        getTopBar(REPORT_TITLE),
                        getSummaryBlock(),
                        getSuiteResult()
                ).withClass("bg-secondary p-1")
        ).renderFormatted();
    }
}
