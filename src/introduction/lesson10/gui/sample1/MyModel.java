package introduction.lesson10.gui.sample1;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;


public class MyModel extends AbstractTableModel{

	private ArrayList<Student> list;
	private String[] header = {"name", "addres", "number"};
	
	public MyModel(ArrayList<Student> l) {
		this.list = l;
	}
	
	@Override
	public int getRowCount() {
		return list.size();
	}
	@Override
	public int getColumnCount() {
		return 3;
	}
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
//		System.out.println("executando o metodo getValueAt");
//		System.out.println("row: " + rowIndex + " col: " + columnIndex);
		Student student = list.get(rowIndex);
		switch (columnIndex) {
			case 0:
				return student.getName();
			case 1: 
				return student.getAddress();
			case 2: 
				return student.getNumber();
			default:
				return null;
		}
	}

	
	@Override
	public String getColumnName(int col) {
		return header[col];
	}
	


}
