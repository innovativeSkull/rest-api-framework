package rest.listener.custom.parsenstore;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

public class DataTest {

    List<DataClass> dataClassList;
    DataSuite dataSuite;

    String testName;
    String executionStatus;

    public DataTest(String testName) {
        this.testName = testName;
        this.dataClassList = new ArrayList<>();
    }

    public List<DataClass> getDataClassList() {
        return dataClassList;
    }

    public void addDataClass(DataClass dataClass) {
        this.dataClassList.add(dataClass);
    }

    public DataClass getDataClassInstance(String className) {

        for (DataClass dataClass : this.dataClassList) {
            if (dataClass.getClassName().equals(className))
                return dataClass;
        }

        return new DataClass(className);
    }

    public DataSuite getDataSuite() {
        return dataSuite;
    }

    public void setDataSuite(DataSuite dataSuite) {
        this.dataSuite = dataSuite;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getExecutionStatus() {
        return executionStatus;
    }

    public void setExecutionStatus(String executionStatus) {
        this.executionStatus = executionStatus;
    }
}
