package rest.listener.custom.html;

import j2html.tags.ContainerTag;
import rest.listener.custom.parsenstore.*;

import static j2html.TagCreator.*;
import static rest.listener.custom.html.HTMLJSConstants.*;

public class HTMLBlocks {

    public static ContainerTag getTopBar(String reportTitle) {

        return div(
                span(reportTitle).withClass("m-1 p-2 text-blue-dark title-header"),
                button("Flows").withClass("float-right btn btn-sm btn-outline-info m-1 py-1 px-4"),
                button("Dashboard").withClass("float-right btn btn-sm btn-outline-info m-1 py-1 px-4")
        ).withClass("bg-bluepurple border border-0 rounded m-1 p-1");
    }

    static ContainerTag getSummaryBlock() {
        return div().withId(ID_SUMMARY).withClass("border border-0 rounded m-1 p-1");
    }

    public static ContainerTag getSuiteResult() {
        // String suiteName = ParseExecutionData.dataSuites.getDataSuitesList().get(0).getSuiteName();
        return div(
                div("Execution Summary - Suites.Test.Class.Methods").withClass("text-center text-blue title-box"),
                hr(),
                each(ParseExecutionData.dataSuites.getDataSuitesList(), dataSuite -> getEachSuiteResultBlock(dataSuite))
        ).withId(ID_SUITE_RESULTS).withClass("bg-white-shadowbox border border-0 rounded m-1 mt-2 p-1");

    }

    public static ContainerTag getEachSuiteResultBlock(DataSuite dataSuite) {
        String suiteName = dataSuite.getSuiteName().trim();
        String suiteCollapseIndex = suiteName + "Toggle";
        String statusColor = "Success";
        String status = "PASS";
        String suiteDuration = "00:00:00:000";

        return div(
                div(
                        span(status).withId(ID_SUITE_STATUS).withClass("text-status-" + statusColor + " m-1 p-1"),
                        span(suiteName).withId(ID_SUITE_NAME).withClass("m-1 p-1 font-weight-bold"),
                        span(suiteDuration).withId(ID_SUITE_DURATION).withClass("text-normal-plain m-1 p-1 float-right")
                ).withClass("").attr("data-toggle", "collapse").attr("data-target", "#" + suiteCollapseIndex).attr("aria-expanded", "false").attr("aria-controls", suiteCollapseIndex).withStyle("cursor: pointer;"),
                div(
                        each(dataSuite.getDataTestList(), dataTest -> getEachTestResultBlock(dataTest))
                ).withId(suiteCollapseIndex).withClass("container-fluid collapse bg-white-shadowbox-inset mr-4 p-2 rounded border border-0")
        ).withId(ID_EACH_SUITE_BOX).withClass("bg-white-shadowbox m-1 p-1 border border-0 rounded");
    }

    public static ContainerTag getEachTestResultBlock(DataTest dataTest) {
        String testName = dataTest.getTestName().trim();
        String testCollapseIndex = testName + "Toggle";
        String statusColor = "Success";
        String status = "PASS";
        String testDuration = "00:00:00:000";

        return div(
                div(
                        span(status).withId(ID_SUITE_STATUS).withClass("text-status-" + statusColor + " m-1 p-1"),
                        span(testName).withId(ID_SUITE_NAME).withClass("m-1 p-1 font-weight-bold"),
                        span(testDuration).withId(ID_SUITE_DURATION).withClass("text-normal-plain m-1 p-1 float-right")
                ).withClass("").attr("data-toggle", "collapse").attr("data-target", "#" + testCollapseIndex).attr("aria-expanded", "false").attr("aria-controls", testCollapseIndex).withStyle("cursor: pointer;"),
                div(
                        each(dataTest.getDataClassList(), dataClass -> getEachClassResultBlock(dataClass))
                ).withId(testCollapseIndex).withClass("container-fluid collapse bg-white-shadowbox-inset mr-4 p-2 rounded border border-0")
        ).withId(ID_EACH_SUITE_BOX).withClass("bg-white-shadowbox m-1 p-1 border border-0 rounded");
    }

    public static ContainerTag getEachClassResultBlock(DataClass dataClass) {
        String className = dataClass.getClassName().trim();
        String classCollapseIndex = className + "Toggle";
        String statusColor = "Success";
        String status = "PASS";
        String classDuration = "00:00:00:000";

        return div(
                div(
                        span(status).withId(ID_SUITE_STATUS).withClass("text-status-" + statusColor + " m-1 p-1"),
                        span(className).withId(ID_SUITE_NAME).withClass("m-1 p-1 font-weight-bold"),
                        span(classDuration).withId(ID_SUITE_DURATION).withClass("text-normal-plain m-1 p-1 float-right")
                ).withClass("").attr("data-toggle", "collapse").attr("data-target", "#" + classCollapseIndex).attr("aria-expanded", "false").attr("aria-controls", classCollapseIndex).withStyle("cursor: pointer;"),
                div(
                        // each(dataClass.getDataClassList(), dataClass -> getEachTestResultBlock(dataClass))
                ).withId(classCollapseIndex).withClass("container-fluid collapse bg-white-shadowbox-inset mr-4 p-2 rounded border border-0")
        ).withId(ID_EACH_SUITE_BOX).withClass("bg-white-shadowbox m-1 p-1 border border-0 rounded");
    }
}
