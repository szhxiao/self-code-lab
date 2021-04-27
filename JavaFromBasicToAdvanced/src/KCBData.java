
/**
 * Java从基础到进阶
 *
 * @version 1st
 * @author
 * @see https://www.bilibili.com/video/BV1PV411Z7Mj
 */

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 * 
 */
public class KCBData implements TableModel {
    private java.lang.String[] title = { "星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期日" };

    private String[][] data = new String[8][7];

    public KCBData() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = "";
            }
        }
    }

    @Override
    public int getRowCount() {
        return 8;
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public java.lang.String getColumnName(int columnIndex) {

        return title[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data[rowIndex][columnIndex];
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        data[rowIndex][columnIndex] = (String) aValue;
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        // TODO Auto-generated method stub

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        // TODO Auto-generated method stub

    }
}

/**
 * output:
 *
 */