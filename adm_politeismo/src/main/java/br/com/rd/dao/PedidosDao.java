package br.com.rd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import br.com.rd.model.Pedidos;

public class PedidosDao {

	public ArrayList<Pedidos> selectSimple() {
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();
		ArrayList<Pedidos> listSimple = new ArrayList<Pedidos>();

		PreparedStatement p;
		try {
			p = con.prepareStatement("SELECT\n" + "P.ID_PEDIDO AS CODIGO,\n"
					+ "DATE_FORMAT(P.DATA_PEDIDO, '%d-%m-%Y')  AS 'DATA', \n" + "J.RAZAO_SOCIAL AS NOME,\n"
					+ "CONCAT(SUBSTR(J.ID_CNPJ, 1,8),'/', SUBSTR(J.ID_CNPJ, 9,12), '-', SUBSTRING(J.ID_CNPJ, 13,14))  AS 'CPF/CNPJ',\n"
					+ "C.EMAIL AS EMAIL,\n"
					+ "CONCAT(T.DDD, ' ', SUBSTR(T.FIXO, 1,4),'-', SUBSTR(T.FIXO, 5,8)) AS CONTATO\n" + "FROM\n"
					+ "PEDIDO P\n" + "INNER JOIN \n" + "CLIENTE C\n" + "ON\n" + "P.CLIENTE_ID_CLIENTE = C.ID_CLIENTE\n"
					+ "INNER JOIN\n" + "JURIDICA J\n" + "ON\n" + "C.ID_CLIENTE = J.CLIENTE_ID_CLIENTE \n"
					+ "INNER JOIN\n" + "TELEFONE T\n" + "ON\n" + "C.ID_CLIENTE = T.CLIENTE_ID_CLIENTE\n" + "UNION\n"
					+ "SELECT\n" + "P.ID_PEDIDO AS CODIGO,\n" + "DATE_FORMAT(P.DATA_PEDIDO, '%d-%m-%Y')  AS 'DATA',\n"
					+ "C.NOME AS NOME,\n"
					+ "CONCAT(SUBSTR(F.ID_CPF, 1,9), '-', SUBSTR(F.ID_CPF, 10,11)) AS 'CPF/CNPJ',\n"
					+ "C.EMAIL AS EMAIL ,\n"
					+ "CONCAT(T.DDD, ' ', SUBSTR(T.CELULAR, 1,5),'-', SUBSTR(T.CELULAR, 6,9)) AS CONTATO\n" + "FROM\n"
					+ "PEDIDO P\n" + "INNER JOIN \n" + "CLIENTE C\n" + "ON\n"
					+ "P.CLIENTE_ID_CLIENTE  =  C.ID_CLIENTE\n" + "INNER JOIN\n" + "FISICA F\n" + "ON\n"
					+ "C.ID_CLIENTE = F.CLIENTE_ID_CLIENTE \n" + "INNER JOIN\n" + "TELEFONE T\n" + "ON\n"
					+ "C.ID_CLIENTE = T.CLIENTE_ID_CLIENTE;");
			ResultSet rs = p.executeQuery();

			while (rs.next()) {
				Integer codigo = rs.getInt("CODIGO");
				Date dataPedido = rs.getDate("DATA");
				String nome = rs.getString("NOME");
				String cpfCnpj = rs.getString("CPF/CNPJ");
				String email = rs.getString("EMAIL");
				String contato = rs.getString("CONTATO");

				Pedidos pr = new Pedidos(codigo, dataPedido, nome, cpfCnpj, email, contato);
				pr.setCodigo(codigo);
				listSimple.add(pr);

			}
			
			rs.close();
			p.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listSimple;

	}// end selectSimple

}// end class
