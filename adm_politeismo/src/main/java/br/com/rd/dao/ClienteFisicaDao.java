//
//package br.com.rd.dao;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import br.com.rd.model.ClienteFisica;
//
//public class ClienteFisicaDao {
//
//	
//	public ArrayList<ClienteFisica> selectAll(){
//		Conexao c = Conexao.getInstance();
//		Connection con = c.getConnection();
//		ArrayList<ClienteFisica> listaFisica = new ArrayList<ClienteFisica>();
//		
//		try {
//			PreparedStatement p = con.prepareStatement("SELECT\r\n"
//					+ "C.ID_CLIENTE,\r\n"
//					+ "C.NOME,\r\n"
//					+ "C.EMAIL,\r\n"
//					+ "CONCAT(SUBSTR(F.ID_CPF, 1,9), '-', SUBSTR(F.ID_CPF, 10,11)) AS 'CPF',\r\n"
//					+ "DATE_FORMAT(F.NASCIMENTO, '%d-%m-%Y') AS 'NASCIMENTO',\r\n"
//					+ "S.DESCRICAO,\r\n"
//					+ "T.DDD,\r\n"
//					+ "T.CELULAR,\r\n"
//					+ "E.TIPO_LOGRADOURO,\r\n"
//					+ "E.NOME_LOGRADOURO,\r\n"
//					+ "E.NUMERO,\r\n"
//					+ "E.CEP,\r\n"
//					+ "E.CIDADE,\r\n"
//					+ "ES.SIGLA\r\n"
//					+ "FROM\r\n"
//					+ "CLIENTE C\r\n"
//					+ "JOIN\r\n"
//					+ "FISICA F\r\n"
//					+ "ON\r\n"
//					+ "C.ID_CLIENTE  = F.CLIENTE_ID_CLIENTE\r\n"
//					+ "JOIN \r\n"
//					+ "SEXO S\r\n"
//					+ "ON \r\n"
//					+ "S.ID_SEXO = F.SEXO_ID_SEXO\r\n"
//					+ "JOIN \r\n"
//					+ "TELEFONE T\r\n"
//					+ "ON \r\n"
//					+ "T.ID_TELEFONE = F.CLIENTE_ID_CLIENTE\r\n"
//					+ "JOIN \r\n"
//					+ "ENDERECO E\r\n"
//					+ "ON \r\n"
//					+ "E.ID_ENDERECO = F.CLIENTE_ID_CLIENTE\r\n"
//					+ "JOIN\r\n"
//					+ "ESTADO ES\r\n"
//					+ "ON \r\n"
//					+ "ES.ID_ESTADO = F.CLIENTE_ID_CLIENTE; ");
//			ResultSet r = p.executeQuery();			
//			
//			while (r.next()) {
//				Integer id = r.getInt("ID_CLIENTE");
//				String nome = r.getString("NOME");
//				String email =r.getString("EMAIL");
//				String cpf = r.getString("CPF");
//				String nascimento =r.getString("NASCIMENTO");
//				String sexo = r.getString("DESCRICAO");
//				int ddd = r.getInt("DDD");
//				String celular = r.getString("CELULAR");
//				String logradouro = r.getString("NOME_LOGRADOURO");
//				String tipo_logradouro = r.getString("TIPO_LOGRADOURO");
//				String numeracao = r.getString("NUMERO");
//				String cep = r.getString("CEP");
//				String cidade = r.getString("CIDADE");
//				String estado = r.getString("SIGLA");
//				
//				ClienteFisica cf = new ClienteFisica(id, nome, email, cpf, nascimento, sexo, celular, ddd, logradouro, tipo_logradouro, numeracao, cep, cidade, estado);
//				cf.setId(id);
//				listaFisica.add(cf);
//			}
//			r.close();
//			p.close();
//			
//		} catch (SQLException e) {
//			
//			e.printStackTrace();
//		}
//		return listaFisica;
//	}
//		
//		
//}