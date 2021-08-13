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

            String suiteName = iSuite.getName().replaceAll(" ","_");
            DataSuite dataSuite = new DataSuite(suiteName);
            System.out.println("Suite name : " + suiteName);


            for (ITestNGMethod method : iSuite.getAllMethods()) {
                // Fetching the existing instance of DataTest if the Test already encountered or it will create new instance
                String testName = method.getXmlTest().getName().replaceAll(" ","_");
                DataTest dataTest = dataSuite.getDataTestInstance(testName);
                System.out.println("Test name : " + testName);

                // Updating Test related Data


                // Fetching the existing instance of DataTest if the Test already encountered or it will create new instance
                String fullClassName = method.getTestClass().getName().replaceAll(" ","_");
                String onlyClassName = fullClassName.substring(fullClassName.lastIndexOf('.') + 1);
                System.out.println("Full Class name : " + fullClassName);
                System.out.println("Only Class name : " + onlyClassName);
                DataClass dataClass = dataTest.getDataClassInstance(onlyClassName);

                // Updating ClassRelated Data


                // Adding DataClass into DataTests
                dataTest.addDataClass(dataClass);

                // Adding DataTest into DataSuite
                dataSuite.addDataTest(dataTest);
            }

            // Adding DataSuite into DataSuites
            dataSuites.addSuite(dataSuite);
        }
    }
}
