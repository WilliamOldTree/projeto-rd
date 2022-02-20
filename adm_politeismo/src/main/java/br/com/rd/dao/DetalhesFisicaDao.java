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
			PreparedStatement ps = con.prepareStatement("");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				String nome = ("NOME");
				String cpf = ("ID_CPF");
				String ddd = ("DDD");
				String celular = ("CELULAR");
				String tipoLograd = ("TIPO_LOGRADOURO");
				String logradouro = ("LOGRADOURO");
				String numeracao = ("NUMERACAO");
				String cep = ("CEP");
				String cidade = ("CIDADE");
				String estado = ("ESTADO");

				dtFis = new DetalhesFisica(nome, cpf, ddd, celular, tipoLograd, logradouro, numeracao, cep, cidade,
						estado);
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
