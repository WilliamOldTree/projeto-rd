//package br.com.rd.dao;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import br.com.rd.model.Produto;
//
//public class ProdutoDao {
//	public void insert(Produto produto) {
//		Conexao c = Conexao.getInstance();
//		Connection con = c.getConnection();
//		
//		try {
<<<<<<< HEAD
//			PreparedStatement p = con.prepareStatement("insert into PRODUTO (DESCRICAO, VOLUME, PESO, PRECO, ESTOQUE_PRODUTO, PRODUTO_DESTAQUE_ID_PRODUTO_DESTAQUE, STATUS_PRODUTO) values (?, ?, ?, ?, ?, ?, true)");
//			p.setString(1, produto.getDescricao());
//			p.setDouble(2, produto.getVolume());
//			p.setDouble(3, produto.getPeso());
//			p.setDouble(4, produto.getPreco());
//			p.setInt(5, produto.getQuantidade());
//			p.setDouble(6, produto.getDesconto());
=======
//			PreparedStatement p = con.prepareStatement("insert into PRODUTO (NOME, DESCRICAO, URL_PRODUTO, VOLUME, PESO, PRECO, ESTOQUE, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, true)");
//			p.setString(1, produto.getNome());
//			p.setString(2, produto.getDescricao());
//			p.setString(3, produto.getUrlProduto());
//			p.setDouble(4, produto.getVolume());
//			p.setDouble(5, produto.getPeso());
//			p.setDouble(6, produto.getPreco());
//			p.setDouble(7, produto.getEstoque());
//			p.setInt(8, produto.getCategoria());
//			p.setInt(9, produto.getDepartamento());
//			p.setInt(10, produto.getFornecedor());
//			p.setDouble(11, produto.getProdutoDestaque());
>>>>>>> 647b63eda594e92c6bc4d3079b1c4fb2f17e1d3b
//			System.out.println(p);
//			p.executeUpdate();
//			System.out.println("Comando executado");
//			p.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	public ArrayList<Produto> selectAll(){
//		Conexao c = Conexao.getInstance();
//		Connection con = c.getConnection();
//		ArrayList<Produto> lista = new ArrayList<Produto>();
//		try {
<<<<<<< HEAD
//			PreparedStatement p = con.prepareStatement("SELECT P.ID_PRODUTO, P.DESCRICAO, P.VOLUME, P.PESO, P.PRECO, E.QUANTIDADE, PD.DESCONTO FROM PRODUTO P join ESTOQUE E on P.ESTOQUE_PRODUTO = E.ID_ESTOQUE join PRODUTO_DESTAQUE PD on P.PRODUTO_DESTAQUE_ID_PRODUTO_DESTAQUE = PD.ID_PRODUTO_DESTAQUE WHERE P.STATUS_PRODUTO != 0\r\n"
//					 +"order by p.id_produto;");
=======
//			PreparedStatement p = con.prepareStatement("select P.ID_PRODUTO, P.NOME, P.ESTOQUE, P.PRECO, C.NOME, D.NOME, F.RAZAO_SOCIAL FROM PRODUTO P join CATEGORIA C on P.FK_ID_CATEGORIA = C.ID_CATEGORIA join DEPARTAMENTO D on P.FK_ID_DEPARTAMENTO = D.ID_DEPARTAMENTO join FORNECEDOR F on P.FK_ID_FORNECEDOR =  F.ID_FORNECEDOR WHERE P.FL_INATIVO != 0;\r\n"
//					+ "\r\n"
//					+ "order by p.id_produto;");
>>>>>>> 647b63eda594e92c6bc4d3079b1c4fb2f17e1d3b
//			
//			ResultSet r = p.executeQuery();			
//			
//			while (r.next()) {
//				Integer id = r.getInt("ID_PRODUTO");
<<<<<<< HEAD
//				String descricao = r.getString("DESCRICAO");
//				Double volume = r.getDouble("VOLUME");
//				Double peso = r.getDouble("PESO");
//				Double preco = r.getDouble("PRECO");
//				Integer quantidade = r.getInt("QUANTIDADE");
//				Double destaque = r.getDouble("DESCONTO");
//
//				Produto pod = new Produto(descricao, volume, peso, preco, quantidade, destaque);
=======
//				String nome = r.getString("NOME");
//				Integer estoque = r.getInt("ESTOQUE");
//				Double preco = r.getDouble("PRECO");
//				Integer categoria = r.getInt("NOME");
//				Integer departamento = r.getInt("NOME");
//				Integer fornecedor = r.getInt("RAZAO_SOCIAL");
//
//				Produto pod = new Produto(nome, estoque, preco, categoria, departamento, fornecedor);
>>>>>>> 647b63eda594e92c6bc4d3079b1c4fb2f17e1d3b
//				pod.setId(id);
//				lista.add(pod);
//			}
//			r.close();
//			p.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return lista;
//	}
//	
//	public void removeProduto(Integer id) {
//		Conexao c = Conexao.getInstance();
//		Connection con = c.getConnection();
//		
//		try {
//			PreparedStatement p = con.prepareStatement("delete from PRODUTO where ID_PRODUTO = ?");
//			p.setInt(1, id);
//			System.out.println(p);
//			p.executeUpdate();
//			System.out.println("Comando executado");
//			p.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	public void updateProduto(Produto updateProduto) {
//		Conexao c = Conexao.getInstance();
//		Connection con = c.getConnection();
//		
//		try {
<<<<<<< HEAD
//			PreparedStatement p = con.prepareStatement("update PRODUTO set DESCRICAO = ?, VOLUME = ?, PESO = ?, PRECO = ?, ESTOQUE_PRODUTO = ?, PRODUTO_DESTAQUE_ID_PRODUTO_DESTAQUE = ? where ID_PRODUTO = ? ");
//			p.setString(1, updateProduto.getDescricao());
//			p.setDouble(2, updateProduto.getVolume());
//			p.setDouble(3, updateProduto.getPeso());
//			p.setDouble(4, updateProduto.getPreco());
//			p.setInt(5, updateProduto.getQuantidade());
//			p.setDouble(6, updateProduto.getDesconto());
=======
//			PreparedStatement p = con.prepareStatement("update PRODUTO set NOME = ?, ESTOQUE = ?, PRECO = ?, FK_ID_CATEGORIA = ?, FK_ID_DEPARTAMENTO = ?, FK_ID_FORNECEDOR = ? where ID_PRODUTO = ? ");
//			p.setString(1, updateProduto.getNome());
//			p.setInt(2, updateProduto.getEstoque());
//			p.setDouble(3, updateProduto.getPreco());
//			p.setInt(4, updateProduto.getCategoria());
//			p.setInt(5, updateProduto.getDepartamento());
//			p.setInt(6, updateProduto.getFornecedor());
>>>>>>> 647b63eda594e92c6bc4d3079b1c4fb2f17e1d3b
//			p.setInt(7, updateProduto.getId());
//			
//			System.out.println(p);
//			p.executeUpdate();
//			System.out.println("Comando executado");
//			p.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//		
//	public Produto selectById(Integer id) {
//		Conexao c = Conexao.getInstance();
//		Connection con = c.getConnection();
//		Produto pod = null;
//		try {
//			PreparedStatement p = con.prepareStatement("select * from PRODUTO where ID_PRODUTO = ?");
//			p.setInt(1, id);
//			ResultSet r = p.executeQuery();			
//			
//			while (r.next()) {
<<<<<<< HEAD
//				String descricao = r.getString("DESCRICAO");
//				Double volume = r.getDouble("VOLUME");
//				Double peso = r.getDouble("PESO");
//				Double preco = r.getDouble("PRECO");
//				Integer quantidade = r.getInt("ESTOQUE_PRODUTO");
//				Double destaque = r.getDouble("PRODUTO_DESTAQUE_ID_PRODUTO_DESTAQUE");
//
//				pod = new Produto(descricao, volume, peso, preco, quantidade, destaque);
//				pod.setId(id);
//			}
=======
//				String nome = r.getString("NOME");
//				Integer estoque = r.getInt("ESTOQUE");
//				Double preco = r.getDouble("PRECO");
//				Integer categoria = r.getInt("NOME");
//				Integer departamento = r.getInt("NOME");
//				Integer fornecedor = r.getInt("RAZAO_SOCIAL");
//
//				pod = new Produto(nome, estoque, preco, categoria, departamento, fornecedor);
//				pod.setId(id);
//			}
//			
>>>>>>> 647b63eda594e92c6bc4d3079b1c4fb2f17e1d3b
//			r.close();
//			p.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return pod;
//	}
//	
//	public void exclusionProduto(Integer id) {
//		Conexao c = Conexao.getInstance();
//		Connection con = c.getConnection();
//		
//		try {
<<<<<<< HEAD
//			PreparedStatement p = con.prepareStatement("update PRODUTO set STATUS_PRODUTO = 0 where ID_PRODUTO = ?");
=======
//			PreparedStatement p = con.prepareStatement("update PRODUTO set FL_INATIVO = 0 where ID_PRODUTO = ?");
>>>>>>> 647b63eda594e92c6bc4d3079b1c4fb2f17e1d3b
//			p.setInt(1, id);
//			System.out.println(p);
//			p.executeUpdate();
//			System.out.println("Comando executado");
//			p.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	
//}