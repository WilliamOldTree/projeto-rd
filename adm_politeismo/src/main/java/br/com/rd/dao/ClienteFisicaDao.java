package br.com.rd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import br.com.rd.model.ClienteFisica;

public class ClienteFisicaDao {

	
	public ArrayList<ClienteFisica> selectAll(){
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();
		ArrayList<ClienteFisica> listaFisica = new ArrayList<ClienteFisica>();
		
		try {
			PreparedStatement p = con.prepareStatement("SELECT C.ID_CLIENTE, C.NOME, C.EMAIL,  F.ID_CPF, F.NASCIMENTO, S.DESCRICAO  \r\n"
					+ "FROM \r\n"
					+ "CLIENTE C\r\n"
					+ "JOIN\r\n"
					+ "FISICA F\r\n"
					+ "ON\r\n"
					+ "C.ID_CLIENTE  = F.CLIENTE_ID_CLIENTE\r\n"
					+ "JOIN \r\n"
					+ "SEXO S\r\n"
					+ "ON \r\n"
					+ "S.ID_SEXO = F.SEXO_ID_SEXO;");
			ResultSet r = p.executeQuery();			
			
			while (r.next()) {
				Integer id = r.getInt("ID_CLIENTE");
				String nome = r.getString("NOME");
				String email =r.getString("EMAIL");
				String cpf = r.getString("ID_CPF");
				Date nascimento =r.getDate("NASCIMENTO");
				String sexo = r.getString("DESCRICAO");
				
				ClienteFisica cf = new ClienteFisica(id, nome, email, cpf, nascimento, sexo);
				cf.setId(id);
				listaFisica.add(cf);
			}
			r.close();
			p.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return listaFisica;
	}
		
		
}
