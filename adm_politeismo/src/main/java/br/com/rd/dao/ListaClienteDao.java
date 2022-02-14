package br.com.rd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.rd.model.ListaCliente;

public class ListaClienteDao {

	public List <ListaCliente> listarClientes () throws SQLException{
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();
		
		List <ListaCliente> listaClientes = new ArrayList<>();
		String sql = " SELECT C.NOME, C.EMAIL, J.ID_CNPJ, T.DDD, T.CELULAR  FROM CLIENTE AS C JOIN JURIDICA AS J ON C.ID_CLIENTE = J.CLIENTE_ID_CLIENTE JOIN TELEFONE AS T ON C.ID_CLIENTE = T.CLIENTE_ID_CLIENTE UNION \r\n"
				+ "SELECT C.NOME, C.EMAIL, F.ID_CPF, T.DDD, T.CELULAR  FROM CLIENTE AS C JOIN FISICA AS F ON C.ID_CLIENTE = F.CLIENTE_ID_CLIENTE JOIN TELEFONE AS T ON C.ID_CLIENTE = T.CLIENTE_ID_CLIENTE; ";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			String nome = rs.getString("C.NOME");
			String email = rs.getString("C.EMAIL");
			String cpfCnpj = rs.getString("F.IDCPF");
			String ddd =  rs.getString("T.DDD");
			String celular = rs.getString("T.CELULAR");
			ListaCliente cliente = new ListaCliente(nome, email, cpfCnpj, ddd, celular);
			listaClientes.add(cliente);		
		}
		
		return listaClientes;
		
	}
	
}
