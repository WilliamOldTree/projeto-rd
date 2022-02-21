package br.com.rd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.rd.model.DetalhesJuridico;

public class DetalhesJuridicoDao {

	

	public DetalhesJuridico showDetalhes(Integer id) {

		// conexao sql
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();

		DetalhesJuridico dtJud = null;

		try {

			// query buscar dados no banco
			PreparedStatement p = con.prepareStatement("SELECT J.RAZAO_SOCIAL,  J.ID_CNPJ , J.INSCRICAO_ESTADUAL,T.DDD, T.CELULAR , E.TIPO_LOGRADOURO, E.NOME_LOGRADOURO, E.NUMERO, E.CEP, E.CIDADE, ES.SIGLA  \r\n"
					+ "FROM\r\n"
					+ "CLIENTE C\r\n"
					+ "INNER JOIN\r\n"
					+ "JURIDICA J  \r\n"
					+ "ON\r\n"
					+ "J.CLIENTE_ID_CLIENTE  = C.ID_CLIENTE\r\n"
					+ "INNER JOIN\r\n"
					+ "TELEFONE T\r\n"
					+ "ON\r\n"
					+ "T.CLIENTE_ID_CLIENTE = C.ID_CLIENTE \r\n"
					+ "INNER JOIN \r\n"
					+ "CLIENTE_ENDERECO CE\r\n"
					+ "ON\r\n"
					+ "CE.CLIENTE_ID_ENDERECO = C.ID_CLIENTE\r\n"
					+ "INNER JOIN \r\n"
					+ "ENDERECO E\r\n"
					+ "ON\r\n"
					+ "CE.ENDERECO_ID_ENDERECO = E.ID_ENDERECO\r\n"
					+ "INNER JOIN\r\n"
					+ "ESTADO ES\r\n"
					+ "ON\r\n"
					+ "E.ESTADO_ID_ESTADO = ES.ID_ESTADO;\r\n"
					+ "");
			p.setInt(1, id);
			ResultSet r = p.executeQuery();

			while (r.next()) {
				String rzSoc = ("RAZAO_SOCIAL");
				String cnpj = ("ID_CNPJ");
				String inscEst = ("INSCRICAO_ESTADUAL");
				String ddd = ("DDD");
				String celular = ("CELULAR");
				String tipoLograd = ("TIPO_LOGRADOURO");
				String logradouro = ("NOME_LOGRADOURO");
				String numeracao = ("NUMERO");
				String cep = ("CEP");
				String cidade = ("CIDADE");
				String estado = ("SIGLA");

				dtJud = new DetalhesJuridico(rzSoc, cnpj, inscEst, ddd, celular, tipoLograd, logradouro, numeracao, cep,
						cidade, estado);
				dtJud.setId(id);

				r.close();
				p.close();

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return dtJud;

	}

}//end class
