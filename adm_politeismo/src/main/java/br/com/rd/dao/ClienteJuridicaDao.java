
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
			p = con.prepareStatement("SELECT C.ID_CLIENTE, C.NOME, C.EMAIL, J.ID_CNPJ, J.ABERTURA, J.INSCRICAO_ESTADUAL, J.RAZAO_SOCIAL,T.DDD,T.CELULAR,E.TIPO_LOGRADOURO,E.NOME_LOGRADOURO,E.NUMERO,E.CEP,E.CIDADE,ES.SIGLA \r\n"
					+ "					 FROM\r\n"
					+ "					CLIENTE C\r\n"
					+ "					INNER JOIN\r\n"
					+ "					 JURIDICA J\r\n"
					+ "					 ON\r\n"
					+ "					 J.CLIENTE_ID_CLIENTE = C.ID_CLIENTE\r\n"
					+ "                     INNER JOIN \r\n"
					+ "					 TELEFONE T\r\n"
					+ "					 ON \r\n"
					+ "					 T.ID_TELEFONE = J.CLIENTE_ID_CLIENTE\r\n"
					+ "                     INNER JOIN \r\n"
					+ "					 ENDERECO E\r\n"
					+ "					 ON \r\n"
					+ "					 E.ID_ENDERECO = J.CLIENTE_ID_CLIENTE"
					+ "                     INNER JOIN \r\n"
					+ "					 ESTADO ES\r\n"
					+ "					 ON \r\n"
					+ "					 ES.ID_ESTADO = J.CLIENTE_ID_CLIENTE;"
					);
			ResultSet r = p.executeQuery();
			
			while (r.next()) {
				Integer id = r.getInt("ID_CLIENTE");
				String nome = r.getString("NOME");
				String email =r.getString("EMAIL");
				String cnpj = r.getString("ID_CNPJ");
				Date abertura =  r.getDate("ABERTURA");
				String inscricao_estadual = r.getString("INSCRICAO_ESTADUAL");
				String razao_social = r.getString("RAZAO_SOCIAL");
				int ddd =r.getInt("DDD");
				String celular = r.getString("CELULAR");
				String logradouro = r.getString("NOME_LOGRADOURO");
				String tipo_logradouro = r.getString("TIPO_LOGRADOURO");
				String numeracao = r.getString("NUMERO");
				String cep = r.getString("CEP");
				String cidade = r.getString("CIDADE");
				String estado = r.getString("SIGLA");
			
				
				ClienteJuridica cj = new ClienteJuridica(id, nome, email, cnpj, abertura, inscricao_estadual, razao_social, celular, ddd, logradouro, tipo_logradouro, numeracao, cep, cidade, estado);
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

