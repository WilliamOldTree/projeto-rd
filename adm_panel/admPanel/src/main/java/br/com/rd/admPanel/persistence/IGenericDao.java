package br.com.rd.admPanel.persistence;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.SQLException;

public interface IGenericDao {

	Connection getConnection() throws ClassNotFoundException, SQLException;

}
