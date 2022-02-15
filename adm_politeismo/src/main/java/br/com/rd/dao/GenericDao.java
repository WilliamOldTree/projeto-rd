package br.com.rd.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GenericDao implements IGenericDao {

	private String url = "jdbc:mysql://localhost.3306/bd_politeismo?useSSL=false";
	private String username = "root";
	private String password = "root";
	private static Connection conexao = null;
	private static GenericDao instance = null;

	public GenericDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Load driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Load driver");
			e.printStackTrace();
		}

	}// end constructor

	public static GenericDao getInstance() {
		if (instance == null) {
			instance = new GenericDao();
			System.out.println("Create instance");
		}
		System.out.println("Return instance");
		return instance;
	}

	@Override
	public Connection geConnection() {
		try {
			if ((conexao == null) || (conexao.isClosed())) {
				conexao = DriverManager.getConnection(this.url, this.username, this.password);
				System.out.println("Conexão estabelecida");
				return conexao;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Conexão não estabelecida: " + e.getMessage());
		}

		return conexao;
	}

}// end GenericDao
