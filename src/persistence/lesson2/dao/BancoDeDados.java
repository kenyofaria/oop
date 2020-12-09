package persistence.lesson2.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Sigleton
public class BancoDeDados {
	
	private static Connection cnx;

	public static Connection getConexao() {
		try {
			if(cnx==null) {
				cnx = DriverManager.getConnection("jdbc:postgresql://localhost:5432/poo2-2020", "postgres", "12345");
			}
			return cnx;
			
		}catch(SQLException e) {
			return null;
		}
	}
	
}
