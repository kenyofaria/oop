package swing.test.jtable;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class MyTableModel extends AbstractTableModel{

	private static final long serialVersionUID = 1L;
	
	private List<Aluno> students = new ArrayList<Aluno>();
	private String[] columnNames = { "Number", "Name"};
	
	public MyTableModel() {
		super();
	}
	
	public MyTableModel(List<Aluno> students) {
		this.students = students; 
	}
	
	public int getRowCount() {
		return students.size();
	}

	public int getColumnCount() {
		return columnNames.length;
	}
	
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Aluno get(int rowIndex) {
		return students.get(rowIndex);
	}
	
	public void add(Aluno s) {
		this.students.add(s);
		fireTableDataChanged();
	}
	
	public void remove(int index) {
		this.students.remove(index);
		fireTableDataChanged();
	}
	
	public Object getValueAt(int rowIndex, int columnIndex) {
		Aluno  student = students.get(rowIndex);
		switch (columnIndex) {
			case 0:
				return student.getMatricula();
			case 1: 
				return student.getNome();
			default:
				return null;
		}
	}
}
