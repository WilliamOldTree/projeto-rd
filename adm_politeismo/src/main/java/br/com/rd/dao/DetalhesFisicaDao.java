package br.com.rd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import br.com.rd.model.DetalhesFisica;
public class DetalhesFisicaDao {

	public ArrayList<DetalhesFisica> showDetalhesFisica() {

	public DetalhesFisica showDetalhesFisica(Integer id) {
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();


		try {
			PreparedStatement ps = con.prepareStatement("SELECT  C.NOME, F.ID_CPF, T.DDD, T.CELULAR , E.TIPO_LOGRADOURO, E.NOME_LOGRADOURO, E.NUMERO, E.CEP, E.CIDADE, ES.SIGLA  \n"
					+ "FROM\n"
					+ "CLIENTE C\n"
					+ " JOIN\n"
					+ "FISICA F \n"
					+ "ON\n"
					+ "F.CLIENTE_ID_CLIENTE  = C.ID_CLIENTE\n"
					+ " JOIN\n"
					+ "TELEFONE T\n"
					+ "ON\n"
					+ "T.CLIENTE_ID_CLIENTE = C.ID_CLIENTE \n"
					+ " JOIN \n"
					+ "CLIENTE_ENDERECO CE\n"
					+ "ON\n"
					+ "CE.CLIENTE_ID_ENDERECO = C.ID_CLIENTE\n"
					+ " JOIN \n"
					+ "ENDERECO E\n"
					+ "ON\n"
					+ "CE.ENDERECO_ID_ENDERECO = E.ID_ENDERECO\n"
					+ " JOIN\n"
					+ "ESTADO ES\n"
					+ "ON\n"
					+ "E.ESTADO_ID_ESTADO = ES.ID_ESTADO;"
					);
	
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Integer id = rs.getInt("ID_CLIENTE");
				String nome = rs.getString("NOME");
				String cpf = rs.getString("ID_CPF");
				String ddd =rs.getString ("DDD");
				String celular = rs.getString("CELULAR");
				String tipoLograd = rs.getString("TIPO_LOGRADOURO");
				String logradouro = rs.getString("NOME_LOGRADOURO");
				String numeracao =rs.getString ("NUMERO");
				String cep = rs.getString("CEP");
				String cidade = rs.getString("CIDADE");
				String estado = rs.getString ("SIGLA");

			DetalhesFisica	 dtFis = new DetalhesFisica  (id, nome, cpf, ddd, celular, tipoLograd, logradouro, numeracao, cep, cidade,estado);
				dtFis.setId(id);
				listaFisica.add(dtFis);

}//end classDao
		
