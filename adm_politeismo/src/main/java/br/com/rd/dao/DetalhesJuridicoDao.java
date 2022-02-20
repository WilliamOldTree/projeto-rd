package br.com.rd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.rd.model.DetalhesJuridico;

public class DetalhesJuridicoDao {

	public DetalhesJuridicoDao(String rzSoc, String cnpj, String inscEst, String ddd, String celular, String tipoLograd,
			String logradouro, String numeracao, String cep, String cidade, String estado) {
		// TODO Auto-generated constructor stub
	}

	public DetalhesJuridicoDao showDetalhes(Integer id) {

		// conexao sql
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();

		DetalhesJuridico dtJud = null;

		try {

			// query buscar dados no banco
			PreparedStatement p = con.prepareStatement("");
			p.setInt(1, id);
			ResultSet r = p.executeQuery();

			while (r.next()) {
				String rzSoc = ("RAZAO_SOCIAL");
				String cnpj = ("ID_CNPJ");
				String inscEst = ("INSCRICAO_ESTADUAL");
				String ddd = ("DDD");
				String celular = ("CELULAR");
				String tipoLograd = ("TIPO_LOGRADOURO");
				String logradouro = ("LOGRADOURO");
				String numeracao = ("NUMERACAO");
				String cep = ("CEP");
				String cidade = ("CIDADE");
				String estado = ("ESTADO");

				dtJud = new DetalhesJuridico(rzSoc, cnpj, inscEst, ddd, celular, tipoLograd, logradouro, numeracao, cep,
						cidade, estado);
				dtJud.setId(id);

				r.close();
				p.close();

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return null;

	}

}//end class
