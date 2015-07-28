/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Asus
 */
public class MyTableModel extends AbstractTableModel {
    private int rows;
    private int coloums = 3;
    
    public MyTableModel(int rows){
        this.rows = rows;
    }
    public MyTableModel(int rows,double[] ratios){
        this.coloums = 4;
        this.rows = rows;
        
    }
    private Object [][]data = new Object [][] {
                {"A", null, null,null},
                {"B", null, null,null},
                {"C", null, null,null},
                {"D", null, null,null},
                {"E", null, null,null},
                {"F", null, null,null},
                {"G", null, null,null},
                {"H", null, null,null},
                {"I", null, null,null},
                {"J", null, null,null}             
                
    };
    private String [] columnNames = new String [] {
         "Process", "Arrival Time", "Service Time","Responce Ratio"
    };
    
    Class[] types = new Class [] {
        java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
    };
    
    boolean[] canEdit = new boolean [] {
        false, true, true, false
    };
    
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
    }    
    
    public String getColumnName(int col) {
        return columnNames[col];        
    }

    @Override
    public int getRowCount() {
        return this.rows;
    }

    @Override
    public int getColumnCount() {
        return this.coloums;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data[rowIndex][columnIndex];
    }
    
    /*public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
    }*/
    public void setValueAt(Object value, int row, int col) {   
       try{
        data[row][col] = Integer.valueOf(String.valueOf(value));
       }catch(Exception ex){}
    }    

    /**
     * @param data the data to set
     */
    public void setData(Object[][] data) {
        this.data = data;
    }

    /**
     * @param coloums the coloums to set
     */
    public void setColoums(int coloums) {
        this.coloums = coloums;
    }
    
}
