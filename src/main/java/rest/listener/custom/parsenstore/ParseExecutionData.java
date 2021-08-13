package rest.listener.custom.parsenstore;

import org.testng.ISuite;
import org.testng.ITestNGMethod;
import org.testng.xml.XmlSuite;

import java.util.List;

public class ParseExecutionData {

    public static DataSuites dataSuites;

    public ParseExecutionData() {
        dataSuites = new DataSuites();
    }

    public void parseExecutionData(List<XmlSuite> xmlSuites, List<ISuite> suites) {

        for (ISuite iSuite : suites) {
            DataSuite dataSuite = new DataSuite();

            String suiteName = iSuite.getName();
            dataSuite.setSuiteName(suiteName);

            for (ITestNGMethod method : iSuite.getAllMethods()) {
                System.out.println("Method : " + method.getMethodName());
            }

            dataSuites.addSuite(dataSuite);
        }
    }
}
