package mybeans;

import javax.swing.*;
import java.awt.*;

public class DataSheetTable extends JPanel {
    private final JTable table;
    private DataSheetTableModel tableModel;


    public DataSheetTableModel getTableModel() {
        return tableModel;
    }

    public void setTableModel(DataSheetTableModel tableModel) {
        this.tableModel = tableModel;
        table.revalidate();
    }

    public void revalidate() {
        if (table != null) table.revalidate();
    }

    public DataSheetTable() {
        table = new JTable();
        tableModel = new DataSheetTableModel();
        table.setModel(tableModel);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        JButton addButton = new JButton("Add");
        JButton deleteButton = new JButton("Delete");

        buttonPanel.add(addButton);
        buttonPanel.add(deleteButton);

        addButton.addActionListener(e -> {
            tableModel.getDataSheet().addDataItem(new Data());
            tableModel.setRowCount(tableModel.getRowCount() + 1);
            table.revalidate();
            tableModel.fireDataSheetChange();
        });
        deleteButton.addActionListener(e -> {
            if (tableModel.getRowCount() > 1) {
                tableModel.setRowCount(tableModel.getRowCount() - 1);
                tableModel.getDataSheet().removeDataItem(
                        tableModel.getDataSheet().size() - 1);
                table.revalidate();
                tableModel.fireDataSheetChange();
            } else {
                tableModel.getDataSheet().getDataItem(0).setDate("");
                tableModel.getDataSheet().getDataItem(0).setX(0);
                tableModel.getDataSheet().getDataItem(0).setY(0);
                table.revalidate();
                table.repaint();
                tableModel.fireDataSheetChange();
            }

        });
    }
}