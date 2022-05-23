package br.com.rd.dao;

import java.util.ArrayList;

import br.com.rd.model.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;

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
					+ "C.CELULAR\n"
					+ "FROM CLIENTE C;");
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
				
				
				Cliente cliente = new Cliente(id, nome, cpf, email, senha, nascimento, fixo, celular);
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
	
	
	public ArrayList<Endereco> selectDetalhesCliente(){
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();
		ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
	
	Cliente cliente = new Cliente();
	cliente.getEndereco().getBairro()
	
}//end class

		
		
		
		
//		String apelido = r.getString("APELIDO");
//		String endereco = r.getString("ENDERECO");
//		String cep = r.getString("CEP");
//		String cidade = r.getString("CIDADE");
//		String bairro = r.getString("BAIRRO");
//		String estado = r.getString("ESTADO");		
		