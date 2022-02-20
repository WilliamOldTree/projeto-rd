package br.com.rd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import br.com.rd.model.ClienteJuridica;

public class ClienteJuridicaDao {

	public ArrayList<ClienteJuridica> selectAll(){
		
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();
		ArrayList<ClienteJuridica> listaJuridica = new ArrayList<ClienteJuridica>();
		PreparedStatement p;
		try {
			p = con.prepareStatement("SELECT C.ID_CLIENTE, C.NOME, C.EMAIL, J.ID_CNPJ, J.ABERTURA, J.INSCRICAO_ESTADUAL, J.RAZAO_SOCIAL \r\n"
					+ "FROM\r\n"
					+ "CLIENTE C\r\n"
					+ "JOIN\r\n"
					+ "JURIDICA J\r\n"
					+ "ON\r\n"
					+ "J.CLIENTE_ID_CLIENTE = C.ID_CLIENTE;");
			ResultSet r = p.executeQuery();
			
			while (r.next()) {
				Integer id = r.getInt("ID_CLIENTE");
				String nome = r.getString("NOME");
				String email =r.getString("EMAIL");
				String cnpj = r.getString("ID_CNPJ");
				Date abertura =  r.getDate("ABERTURA");
				String inscricao_estadual = r.getString("INSCRICAO_ESTADUAL");
				String razao_social = r.getString("RAZAO_SOCIAL");
				
				ClienteJuridica cj = new ClienteJuridica(id, nome, email, cnpj, abertura, inscricao_estadual, razao_social);
				cj.setId(id);
				listaJuridica.add(cj);
		
			} 
			r.close();
			p.close();
			
		}catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return listaJuridica;
	}
		
}//end class
