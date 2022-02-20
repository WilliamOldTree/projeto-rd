package br.com.rd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.rd.model.DetalhesFisica;

public class DetalhesFisicaDao {

	public DetalhesFisica showDetalhesFisica(Integer id) {

		// conexao
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();

		DetalhesFisica dtFis = null;

		try {
			PreparedStatement ps = con.prepareStatement("SELECT C.NOME, F.ID_CPF, T.DDD, T.CELULAR , E.TIPO_LOGRADOURO, E.NOME_LOGRADOURO, E.NUMERO, E.CEP, E.CIDADE, ES.SIGLA  \n"
					+ "FROM\n"
					+ "CLIENTE C\n"
					+ "INNER JOIN\n"
					+ "FISICA F \n"
					+ "ON\n"
					+ "F.CLIENTE_ID_CLIENTE  = C.ID_CLIENTE\n"
					+ "INNER JOIN\n"
					+ "TELEFONE T\n"
					+ "ON\n"
					+ "T.CLIENTE_ID_CLIENTE = C.ID_CLIENTE \n"
					+ "INNER JOIN \n"
					+ "CLIENTE_ENDERECO CE\n"
					+ "ON\n"
					+ "CE.CLIENTE_ID_ENDERECO = C.ID_CLIENTE\n"
					+ "INNER JOIN \n"
					+ "ENDERECO E\n"
					+ "ON\n"
					+ "CE.ENDERECO_ID_ENDERECO = E.ID_ENDERECO\n"
					+ "INNER JOIN\n"
					+ "ESTADO ES\n"
					+ "ON\n"
					+ "E.ESTADO_ID_ESTADO = ES.ID_ESTADO;");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				String nome = ("NOME");
				String cpf = ("ID_CPF");
				String ddd = ("DDD");
				String celular = ("CELULAR");
				String tipoLograd = ("TIPO_LOGRADOURO");
				String logradouro = ("NOME_LOGRADOURO");
				String numeracao = ("NUMERO");
				String cep = ("CEP");
				String cidade = ("CIDADE");
				String estado = ("SIGLA");

				dtFis = new DetalhesFisica(nome, cpf, ddd, celular, tipoLograd, logradouro, numeracao, cep, cidade,estado);
				dtFis.setId(id);

				ps.close();
				rs.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return dtFis;
	}

}//end classDao
