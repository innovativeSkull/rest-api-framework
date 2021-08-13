package rest.listener.custom.html;

import j2html.tags.ContainerTag;
import rest.listener.custom.parsenstore.DataSuites;
import rest.listener.custom.parsenstore.ParseExecutionData;

import static j2html.TagCreator.*;
import static rest.listener.custom.html.HTMLJSConstants.*;

public class HTMLBlocks {

    public static ContainerTag getTopBar(String reportTitle) {

        return div(
                h2(reportTitle).withClass("m-1 p-2 font-weight-bold text-light")
        ).withClass("bg-dark border border-0 rounded");
    }

    static ContainerTag getSummaryBlock() {
        return div().withId(ID_SUMMARY);
    }

    public static ContainerTag getSuiteResult() {
        String suiteName = ParseExecutionData.dataSuites.getDataSuitesList().get(0).getSuiteName();
        return div(
                div(
                        div(
                                div(suiteName).withId("SuiteName").withClass("m-1 p-21 font-weight-bold text-primary")
                        ).withClass("bg-info border border-0 rounded")
                ).withId("EachSuiteBox")
        ).withId(ID_SUITE_RESULTS);
    }
}
