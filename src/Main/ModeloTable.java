package Main;
import javax.swing.table.AbstractTableModel;

import javax.swing.table.TableModel;

/**
 *
 * @author Estudiante
 */
public class ModeloTable extends AbstractTableModel {

    private final String[] columnNames =  {"Meses"};
    final Object [][] data = {
        {"Meses" , new Integer(500000)}
    };
    
    public Class getColumnClass (int column){
        return getValueAt(0,column).getClass();
    }

    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public int getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
