package rest.listener.custom;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.xml.XmlSuite;
import rest.listener.custom.filehandler.FileHandler;
import rest.listener.custom.html.HTMLGenerator;
import rest.listener.custom.parsenstore.ParseExecutionData;

import java.util.List;

public class CustomIReporter implements IReporter {

    public String reportFileName = "TestReportByIReporter.html";

    @Override
    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {

        ParseExecutionData parseExecutionData = new ParseExecutionData();
        parseExecutionData.parseExecutionData(xmlSuites, suites);

        HTMLGenerator htmlGenerator = new HTMLGenerator();

        FileHandler reportFile = new FileHandler(outputDirectory, reportFileName);
        reportFile.addLine(htmlGenerator.getHTMLPage());
        reportFile.closeFile();
    }
}
