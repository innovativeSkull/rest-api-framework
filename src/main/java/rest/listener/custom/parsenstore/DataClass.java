package rest.listener.custom.parsenstore;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

public class DataClass {

    List<DataMethod> dataMethods;
    DataTest dataTest;

    String className;
    String executionStatus;

    public DataClass(String className) {
        this.className = className;
        this.dataMethods = new ArrayList<>();
    }

    public List<DataMethod> getDataMethods() {
        return dataMethods;
    }

    public void addMethod(DataMethod dataMethod) {
        this.dataMethods.add(dataMethod);
    }

    public DataTest getDataTest() {
        return dataTest;
    }

    public void setDataTest(DataTest dataTest) {
        this.dataTest = dataTest;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getExecutionStatus() {
        return executionStatus;
    }

    public void setExecutionStatus(String executionStatus) {
        this.executionStatus = executionStatus;
    }
}
