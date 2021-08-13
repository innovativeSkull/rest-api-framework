package rest.listener.custom.html;

import j2html.tags.ContainerTag;

import static j2html.TagCreator.*;
import static rest.listener.custom.html.HTMLBlocks.*;

public class HTMLGenerator {

    private static final String REPORT_PAGE_TITLE = "Test Execution Report";
    private static final String REPORT_TITLE = "Test Execution";

    public HTMLGenerator() {

    }

    public String getHTMLPage() {
        return html(
                getHeader(),
                getBody()
        ).renderFormatted();
    }

    public ContainerTag getHeader() {

        return head(
                title(REPORT_PAGE_TITLE),
                link().withHref("https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css").withRel("stylesheet").attr("integrity", "sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO").attr("crossorigin", "anonymous"),
                script().withSrc("https://code.jquery.com/jquery-3.3.1.slim.min.js").attr("integrity", "sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo").attr("crossorigin", "anonymous"),
                script().withSrc("https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js").attr("integrity", "sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49").attr("crossorigin", "anonymous"),
                script().withSrc("https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js").attr("integrity", "sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy").attr("crossorigin", "anonymous"),
                style(CSSManager.getStyleSheetAsString())
        );
    }


    public ContainerTag getBody() {
        return body(
                getTopBar(REPORT_TITLE),
                getSummaryBlock(),
                getSuiteResult()
        ).withClass("bg-light p-1");
    }
}
