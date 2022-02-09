package br.com.rd.admPanel.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GenericDao implements IGenericDao{

	private Connection c;
	
	@Override
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_politeismo", "root", "root");
		System.out.println("Conexao OK");
		return c;
	}
		
}
