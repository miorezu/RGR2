package mybeans;

import java.util.ArrayList;

public class DataSheet {
    private ArrayList<Data> dataTable;

    public Data getDataItem(int rowIndex) {
        return dataTable.get(rowIndex);
    }

    public int size() {
        return dataTable.size();
    }

    public void addDataItem(Data data) {
        dataTable.add(data);
    }

    public void removeDataItem(int i) {
        dataTable.remove(i);
    }
}
