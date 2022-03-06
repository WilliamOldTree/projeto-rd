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

		try {
			
		PreparedStatement p = con.prepareStatement("SELECT\n" + "P.ID_PEDIDO AS CODIGO,\n"
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
	
	public ArrayList<Pedidos> selectAll(){
		
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();
		ArrayList<Pedidos> listAll = new ArrayList<Pedidos>();
		
		try {
			PreparedStatement ps = con.prepareStatement("SELECT\n"
					+ "P.ID_PEDIDO AS CODIGO,\n"
					+ "DATE_FORMAT(P.DATA_PEDIDO, '%d-%m-%Y') AS 'DATA',\n"
					+ "J.RAZAO_SOCIAL AS NOME,\n"
					+ "CONCAT(SUBSTR(J.ID_CNPJ, 1,9),'/', SUBSTR(J.ID_CNPJ, 10,14))  AS 'CPF/CNPJ',\n"
					+ "C.EMAIL AS EMAIL,\n"
					+ "CONCAT(T.DDD, ' ', SUBSTR(T.FIXO, 1,4),'-', SUBSTR(T.FIXO, 5,8)) AS CONTATO,\n"
					+ "PD.DESCRICAO AS PRODUTO,\n"
					+ "PD.VOLUME AS VOLUME,\n"
					+ "PD.PESO AS PESO,\n"
					+ "PD.PRECO AS PRECO,\n"
					+ "IP.QUANTIDADE AS QUANTIDADE , \n"
					+ "P.VALOR_TOTAL AS TOTAL,\n"
					+ "E.APELIDO AS ENTREGA,\n"
					+ "CONCAT(E.TIPO_LOGRADOURO,' ', E.NOME_LOGRADOURO, ' ','-', ' ', E.NUMERO) AS ENDERECO,\n"
					+ "CONCAT(SUBSTR(E.CEP, 1,5), '-', SUBSTR(E.CEP, 6,9) ) AS CEP,\n"
					+ "CONCAT(E.CIDADE,'-',ES.SIGLA) AS MUNICIPIO, \n"
					+ "SP.DESCRICAO AS STATUS_PEDIDO,\n"
					+ "PG.STATUS_PAGAMENTO AS STATUS_PAGAMENTO,\n"
					+ "FP.INSTITUICAO AS INSTITUICAO,\n"
					+ "PG.VALOR_PAGAMENTO AS VALOR_PAGO,\n"
					+ "DATE_FORMAT(PG.DATA_PAGAMENTO, '%d-%m-%Y') AS 'DATA',\n"
					+ "FENT.EMPRESA AS ENTREGADOR,\n"
					+ "ENT.PRAZO_ESTIMADO AS PRAZO_ENTREGA,\n"
					+ "ENT.VALOR AS FRETE,\n"
					+ "TSE.DESCRICAO AS STATUS_ENTREGA,\n"
					+ "DATE_FORMAT(SE.DATA_ENTREGA, '%d-%m-%Y') AS 'DATA'    \n"
					+ "FROM\n"
					+ "PEDIDO P\n"
					+ "INNER JOIN\n"
					+ "ITEM_PEDIDO IP\n"
					+ "ON\n"
					+ "IP.PEDIDO_ID_PEDIDO = P.ID_PEDIDO\n"
					+ "INNER JOIN \n"
					+ "PRODUTO PD\n"
					+ "ON \n"
					+ "IP.PRODUTO_ID_PRODUTO = PD.ID_PRODUTO\n"
					+ "INNER JOIN\n"
					+ "STATUS_PEDIDO SP\n"
					+ "ON \n"
					+ "SP.PEDIDO_ID_PEDIDO = P.ID_PEDIDO\n"
					+ "INNER JOIN\n"
					+ "CLIENTE C\n"
					+ "ON \n"
					+ "P.CLIENTE_ID_CLIENTE = C.ID_CLIENTE\n"
					+ "INNER JOIN\n"
					+ "JURIDICA J  \n"
					+ "ON\n"
					+ "J.CLIENTE_ID_CLIENTE  = C.ID_CLIENTE\n"
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
					+ "E.ESTADO_ID_ESTADO = ES.ID_ESTADO\n"
					+ "INNER JOIN\n"
					+ "PAGAMENTO PG\n"
					+ "ON\n"
					+ "PG.PEDIDO_ID_PEDIDO = P.ID_PEDIDO\n"
					+ "INNER JOIN\n"
					+ "FORMA FP\n"
					+ "ON\n"
					+ "PG.FORMA_ID_FORMA = FP.ID_FORMA\n"
					+ "INNER JOIN\n"
					+ "ENTREGA ENT\n"
					+ "ON\n"
					+ "P.ENTREGA_ID_ENTREGA  = ENT.ID_ENTREGA\n"
					+ "INNER JOIN\n"
					+ "FORMA_ENTREGA FENT\n"
					+ "ON \n"
					+ "ENT.FORMA_ENTREGA_ID_FORMA_ENTREGA = FENT.ID_FORMA_ENTREGA\n"
					+ "INNER JOIN\n"
					+ "STATUS_ENTREGA SE \n"
					+ "ON\n"
					+ "SE.ENTREGA_ID_ENTREGA = ENT.ID_ENTREGA\n"
					+ "INNER JOIN\n"
					+ "TIPO_STATUS_ENTREGA TSE\n"
					+ "ON\n"
					+ "TSE.STATUS_ENTREGA_ID_STATUS_ENTREGA = SE.ID_STATUS_ENTREGA	\n"
					+ "UNION\n"
					+ "SELECT\n"
					+ "P.ID_PEDIDO AS CODIGO,\n"
					+ "DATE_FORMAT(P.DATA_PEDIDO,  '%d-%m-%Y') AS 'DATA',\n"
					+ "C.NOME AS NOME,\n"
					+ "CONCAT(SUBSTR(F.ID_CPF, 1,9), '-', SUBSTR(F.ID_CPF, 10,11)) AS 'CPF/CNPJ',\n"
					+ "C.EMAIL AS EMAIL,\n"
					+ "CONCAT(T.DDD, ' ', SUBSTR(T.CELULAR, 1,5),'-', SUBSTR(T.CELULAR, 6,9)) AS CONTATO,\n"
					+ "PD.DESCRICAO AS PRODUTO,\n"
					+ "PD.VOLUME AS VOLUME,\n"
					+ "PD.PESO AS PESO,\n"
					+ "PD.PRECO AS PRECO,\n"
					+ "IP.QUANTIDADE AS QUANTIDADE,\n"
					+ "P.VALOR_TOTAL AS TOTAL,\n"
					+ "E.APELIDO AS ENTREGA,\n"
					+ "CONCAT(E.TIPO_LOGRADOURO,' ', E.NOME_LOGRADOURO, ' ','-', ' ', E.NUMERO) AS ENDERECO, \n"
					+ "CONCAT(SUBSTR(E.CEP, 1,5), '-', SUBSTR(E.CEP, 6,9) ) AS CEP,\n"
					+ "CONCAT(E.CIDADE,'-',ES.SIGLA) AS MUNICIPIO,\n"
					+ "SP.DESCRICAO AS STATUS_PEDIDO,\n"
					+ "PG.STATUS_PAGAMENTO AS STATUS_PAGAMENTO,\n"
					+ "FP.INSTITUICAO AS INSTITUICAO,\n"
					+ "PG.VALOR_PAGAMENTO AS VALOR_PAGO,\n"
					+ "DATE_FORMAT(PG.DATA_PAGAMENTO, '%d-%m-%Y') AS 'DATA',\n"
					+ "FENT.EMPRESA AS ENTREGADOR,\n"
					+ "ENT.PRAZO_ESTIMADO AS PRAZO_ENTREGA,\n"
					+ "ENT.VALOR AS FRETE,\n"
					+ "TSE.DESCRICAO AS STATUS_ENTREGA,\n"
					+ "DATE_FORMAT(SE.DATA_ENTREGA, '%d-%m-%Y') AS 'DATA'\n"
					+ "FROM\n"
					+ "PEDIDO P\n"
					+ "INNER JOIN\n"
					+ "ITEM_PEDIDO IP\n"
					+ "ON\n"
					+ "IP.PEDIDO_ID_PEDIDO = P.ID_PEDIDO\n"
					+ "INNER JOIN \n"
					+ "PRODUTO PD\n"
					+ "ON \n"
					+ "IP.PRODUTO_ID_PRODUTO = PD.ID_PRODUTO\n"
					+ "INNER JOIN\n"
					+ "STATUS_PEDIDO SP\n"
					+ "ON \n"
					+ "SP.PEDIDO_ID_PEDIDO = P.ID_PEDIDO\n"
					+ "INNER JOIN\n"
					+ "CLIENTE C\n"
					+ "ON \n"
					+ "P.CLIENTE_ID_CLIENTE = C.ID_CLIENTE\n"
					+ "INNER JOIN\n"
					+ "FISICA F \n"
					+ "ON\n"
					+ "F.CLIENTE_ID_CLIENTE  = C.ID_CLIENTE\n"
					+ "INNER JOIN\n"
					+ "TELEFONE T\n"
					+ "ON\n"
					+ "T.CLIENTE_ID_CLIENTE = C.ID_CLIENTE\n"
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
					+ "E.ESTADO_ID_ESTADO = ES.ID_ESTADO\n"
					+ "INNER JOIN\n"
					+ "PAGAMENTO PG\n"
					+ "ON\n"
					+ "PG.PEDIDO_ID_PEDIDO = P.ID_PEDIDO\n"
					+ "INNER JOIN\n"
					+ "FORMA FP\n"
					+ "ON\n"
					+ "PG.FORMA_ID_FORMA = FP.ID_FORMA\n"
					+ "INNER JOIN\n"
					+ "ENTREGA ENT\n"
					+ "ON\n"
					+ "P.ENTREGA_ID_ENTREGA  = ENT.ID_ENTREGA\n"
					+ "INNER JOIN\n"
					+ "FORMA_ENTREGA FENT\n"
					+ "ON \n"
					+ "ENT.FORMA_ENTREGA_ID_FORMA_ENTREGA = FENT.ID_FORMA_ENTREGA\n"
					+ "INNER JOIN\n"
					+ "STATUS_ENTREGA SE \n"
					+ "ON\n"
					+ "SE.ENTREGA_ID_ENTREGA = ENT.ID_ENTREGA\n"
					+ "INNER JOIN\n"
					+ "TIPO_STATUS_ENTREGA TSE\n"
					+ "ON\n"
					+ "TSE.STATUS_ENTREGA_ID_STATUS_ENTREGA = SE.ID_STATUS_ENTREGA;");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Integer codigo = rs.getInt("CODIGO");
				Date dataPedido = rs.getDate("DATA");
				String nome = rs.getString("NOME");
				String cpfCnpj = rs.getString("CPF/CNPJ");
				String email = rs.getString("EMAIL");
				String contato = rs.getString("CONTATO");
				String produto = rs.getString("PRODUTO");
				Double volume =rs.getDouble("VOLUME");
				Double peso = rs.getDouble("PESO");
				Double preco = rs.getDouble("PRECO");
				Double quantidade = rs.getDouble("QUANTIDADE");
				Double total = rs.getDouble("TOTAL");
				String entrega = rs.getString("ENTREGA");
				String endereco = rs.getString("ENDERECO");
				String cep = rs.getString("CEP");
				String municipo = rs.getString("MUNICIPIO");
				String statusPedido = rs.getString("STATUS_PEDIDO");
				String statusPagamento = rs.getString("STATUS_PAGAMENTO");
				String instituicao = rs.getString("INSTITUICAO");
				Double valorPago = rs.getDouble("VALOR_PAGO");
				Date dataPgamento = rs.getDate("DATA");
				String entregador = rs.getString("ENTREGADOR");
				String prazoEntrega = rs.getString("PRAZO_ENTREGA");
				Double valorFrete = rs.getDouble("FRETE");
				String statusEntrega = rs.getString("STATUS_ENTREGA");
				Date dataEntrega = rs.getDate("DATA");
				
				Pedidos pDet = new Pedidos(codigo, dataPedido, nome, cpfCnpj, email, contato, produto, volume, peso, preco, quantidade, total, entrega, endereco, cep, municipo, statusPedido, statusPagamento, instituicao, valorPago, dataPgamento, entregador, prazoEntrega, valorFrete, statusEntrega, dataEntrega);
				pDet.setCodigo(codigo);
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















