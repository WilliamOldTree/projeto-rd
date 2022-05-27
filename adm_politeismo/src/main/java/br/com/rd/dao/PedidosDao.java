package br.com.rd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.rd.model.Pedidos;

public class PedidosDao {
	
	public ArrayList<Pedidos> selectAll(){	
		
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();
		ArrayList<Pedidos> listAll = new ArrayList<Pedidos>();
		
		try {
			PreparedStatement ps = con.prepareStatement(""
					+ "SELECT P.ID_PEDIDO, \r\n"
					+ "DATE_FORMAT(P.DATA_PEDIDO, '%d-%m-%Y') AS 'DATA_PEDIDO',\r\n"
					+ "P.FORMA_PAGAMENTO,\r\n"
					+ "P.STATUS_PEDIDO,\r\n"
					+ "P.VALOR_TOTAL,\r\n"
					+ "C.NOME as NOME_CLIENTE,\r\n"
					+ "C.CPF,\r\n"
					+ "C.EMAIL,\r\n"
					+ "C.FIXO,\r\n"
					+ "C.CELULAR,\r\n"
					+ "E.APELIDO,\r\n"
					+ "CONCAT(E.TIPO_LOGRADOURO,' ', E.NOME_LOGRADOURO, ' ','-', ' ', E.NUMERO) AS ENDERECO,\r\n"
					+ "E.CIDADE,\r\n"
					+ "E.BAIRRO,\r\n"
					+ "E.ESTADO,\r\n"
					+ "E.CEP,\r\n"
					+ "PD.NOME as NOME_PRODUTO,\r\n"
					+ "PD.PRECO as PRECO_UNT,\r\n"
					+ "PD.VOLUME,\r\n"
					+ "PD.PESO,\r\n"
					+ "IP.QUANTIDADE AS QUANTIDADE \r\n"
					+ "FROM PEDIDO P \r\n"
					+ "INNER JOIN CLIENTE C ON P.FK_ID_CLIENTE = C.ID_CLIENTE\r\n"
					+ "INNER JOIN ENDERECO E ON P.FK_ID_ENDERECO = E.ID_ENDERECO\r\n"
					+ "INNER JOIN ITEM_PEDIDO IP ON IP.ID_PEDIDO = P.ID_PEDIDO \r\n"
					+ "INNER JOIN PRODUTO PD ON IP.ID_PRODUTO = PD.ID_PRODUTO \r\n"
				    + "ORDER BY ID_PEDIDO DESC; \r\n"
				);
            
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Integer id = rs.getInt("ID_PEDIDO");
				String dataPedido = rs.getString("DATA_PEDIDO");
				String nome = rs.getString("NOME_CLIENTE");
				String cpf = rs.getString("CPF");
				String formaPagamento = rs.getString("FORMA_PAGAMENTO");
				String statusPedido = rs.getString("STATUS_PEDIDO");
				Double valorTotal = rs.getDouble("VALOR_TOTAL");
				String email = rs.getString("EMAIL");
				String fixo = rs.getString("FIXO");
				String celular = rs.getString("CELULAR");
				String apelido = rs.getString("APELIDO");
				String endereco = rs.getString("ENDERECO");
				String cidade = rs.getString("CIDADE");
				String bairro = rs.getString("BAIRRO");
				String estado = rs.getString("ESTADO");
				String cep = rs.getString("CEP");
				String nomeProduto = rs.getString("NOME_PRODUTO");
				Double preco = rs.getDouble("PRECO_UNT");
				Double volume = rs.getDouble("VOLUME");
				Double peso = rs.getDouble("PESO");
				Integer quantidade = rs.getInt("QUANTIDADE");

				Pedidos pDet = new Pedidos(id, dataPedido, formaPagamento, statusPedido, valorTotal, nome, cpf, email, fixo, celular, apelido, cidade, bairro, estado, cep, nomeProduto, preco, volume, peso, quantidade, endereco);
				pDet.setCodigo(id);
				listAll.add(pDet);
			}
			
			rs.close();
			ps.close();
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return listAll;
	}//end selectAll

}// end class

	








