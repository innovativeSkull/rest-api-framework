package rest.listener.custom.parsenstore;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

public class DataSuite {

    List<DataTest> dataTestList;
    DataSuites dataSuites;

    String suiteName;
    String executionStatus;

    public DataSuite(String suiteName) {
        this.suiteName = suiteName;
        this.dataTestList = new ArrayList<>();
    }

    public String getSuiteName() {
        return suiteName;
    }

    public void setSuiteName(String suiteName) {
        this.suiteName = suiteName;
    }

    public String getExecutionStatus() {
        return executionStatus;
    }

    public void setExecutionStatus(String executionStatus) {
        this.executionStatus = executionStatus;
    }

    public List<DataTest> getDataTestList() {
        return dataTestList;
    }

    public void addDataTest(DataTest dataTest) {
        this.dataTestList.add(dataTest);
    }

    public DataTest getDataTestInstance(String testName) {

        for (DataTest dataTest : this.dataTestList) {
            if (dataTest.getTestName().equals(testName))
                return dataTest;
        }

        return new DataTest(testName);
    }

    public DataSuites getDataSuites() {
        return dataSuites;
    }

    public void setDataSuites(DataSuites dataSuites) {
        this.dataSuites = dataSuites;
    }
}
