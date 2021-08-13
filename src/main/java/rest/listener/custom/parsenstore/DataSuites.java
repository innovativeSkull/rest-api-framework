package rest.listener.custom.parsenstore;

import java.util.ArrayList;
import java.util.List;

public class DataSuites {

    List<DataSuite> dataSuitesList;

    public DataSuites() {
        dataSuitesList = new ArrayList<>();
    }

    public List<DataSuite> getDataSuitesList() {
        return dataSuitesList;
    }

    public void addSuite(DataSuite suite) {
        dataSuitesList.add(suite);
    }
}
