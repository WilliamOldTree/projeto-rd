package br.com.rd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

import br.com.rd.model.Cliente;
import br.com.rd.model.Endereco;

public class ClienteDao {

	public ArrayList<Cliente> selectCliente(){
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();
		ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
		
		try {
			PreparedStatement p = con.prepareStatement("SELECT \n"
					+ "C.ID_CLIENTE,\n"
					+ "C.NOME,\n"
					+ "CONCAT(SUBSTR(CPF, 1,9), '-', SUBSTR(CPF, 10,11)) AS 'CPF',\n"
					+ "C.EMAIL,\n"
					+ "C.SENHA,\n"
					+ "DATE_FORMAT(NASCIMENTO, '%d-%m-%Y') AS 'NASCIMENTO',\n"
					+ "C.FIXO,\n"
					+ "C.CELULAR,\n"
					+ "E.APELIDO,\n"
					+ "CONCAT(E.TIPO_LOGRADOURO, '-', E.NOME_LOGRADOURO, 'Nº ', E.NUMERO) AS 'ENDERECO',\n"
					+ "E.CEP,\n"
					+ "E.CIDADE,\n"
					+ "E.BAIRRO,\n"
					+ "E.ESTADO\n"
					+ "FROM CLIENTE C\n"
					+ "JOIN ENDERECO E\n"
					+ "ON\n"
					+ "E.ID_ENDERECO = C.ID_CLIENTE;");
			ResultSet r = p.executeQuery();			
			
			while (r.next()) {
				
				Long id = r.getLong("ID_CLIENTE");
				String nome = r.getString("C.NOME");
				String cpf = r.getString("CPF");
				String email = r.getString("EMAIL");
				String senha = r.getString(" SENHA");
				LocalDate nascimento = LocalDate.parse(r.getString("NASCIMENTO"));
				String fixo = r.getString("FIXO");
				String celular = r.getString("CELULAR");
				String apelido = r.getString("APELIDO");
				String tipoLogradouro = r.getString("TIPO_LOGRADOURO");
				String nomeLogradouro =  r.getString("NOME_LOGRADOURO");
				String numero = r.getString("NUMERO");
				String cep = r.getString("CEP");
				String cidade = r.getString("CIDADE");
				String bairro = r.getString("BAIRRO");
				String estado = r.getString("ESTADO");
				
				
				Endereco endereco = new Endereco(apelido, tipoLogradouro,nomeLogradouro, numero, cep, cidade, bairro, estado);
				Cliente cliente = new Cliente(id, nome, cpf, email, senha, nascimento, fixo, celular, endereco);
				cliente.setId(id);
				listaCliente.add(cliente);
			}
			r.close();
			p.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return listaCliente;
	}
	
	
}//end class

		
		
		
		
//		String apelido = r.getString("APELIDO");
//		String endereco = r.getString("ENDERECO");
//		String cep = r.getString("CEP");
//		String cidade = r.getString("CIDADE");
//		String bairro = r.getString("BAIRRO");
//		String estado = r.getString("ESTADO");		
		