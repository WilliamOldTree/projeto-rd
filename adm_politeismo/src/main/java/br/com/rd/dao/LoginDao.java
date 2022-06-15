package br.com.rd.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.com.rd.model.UserADM;

public class LoginDao {

	private String dbUrl = "jdbc:mysql://localhost:3306/bd_politeismo?useSSL=false";
	private String dbUname = "root";
	private String dbPassword = "root";
	private String dbDriver = "com.mysql.cj.jdbc.Driver";
	
	public void loadDriver(String dbDriver)
	{
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Connection getConnection()
	{
		Connection con = null;
		try {
			con = DriverManager.getConnection(dbUrl, dbUname, dbPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	public boolean validate(UserADM user){
		
		boolean status = false;
		
		loadDriver(dbDriver);
		Connection con = getConnection();
		
	String sql = "select * from USER_ADM where EMAIL = ? AND  SENHA =MD5(?) ";
	//String sql = "select * from USER_ADM where  = ?  OR NOME =? AND SENHA =?";
		PreparedStatement ps;
		try {
		ps = con.prepareStatement(sql);
		ps.setString(1, user.getEmail());
		ps.setString(2, user.getSenha());
		//ps.setString(3, user.getNome());
		
		ResultSet rs = ps.executeQuery();
		status = rs.next();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
}