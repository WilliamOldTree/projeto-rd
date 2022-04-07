package br.com.rd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import br.com.rd.model.Produto;

public class ProdutoDao {
	public void insert(Produto produto) {
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();
		
		try {
			PreparedStatement p = con.prepareStatement("insert into PRODUTO (DESCRICAO, VOLUME, PESO, PRECO, ESTOQUE_PRODUTO, PRODUTO_DESTAQUE_ID_PRODUTO_DESTAQUE, STATUS_PRODUTO) values (?, ?, ?, ?, ?, ?, true)");
			p.setString(1, produto.getDescricao());
			p.setDouble(2, produto.getVolume());
			p.setDouble(3, produto.getPeso());
			p.setDouble(4, produto.getPreco());
			p.setInt(5, produto.getQuantidade());
			p.setDouble(6, produto.getDesconto());
			System.out.println(p);
			p.executeUpdate();
			System.out.println("Comando executado");
			p.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<Produto> selectAll(){
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();
		ArrayList<Produto> lista = new ArrayList<Produto>();
		try {
			PreparedStatement p = con.prepareStatement("SELECT P.ID_PRODUTO, P.DESCRICAO, P.VOLUME, P.PESO, P.PRECO, E.QUANTIDADE, PD.DESCONTO FROM PRODUTO P join ESTOQUE E on P.ESTOQUE_PRODUTO = E.ID_ESTOQUE join PRODUTO_DESTAQUE PD on P.PRODUTO_DESTAQUE_ID_PRODUTO_DESTAQUE = PD.ID_PRODUTO_DESTAQUE WHERE P.STATUS_PRODUTO != 0\r\n"
					 +"order by p.id_produto;");
			
			ResultSet r = p.executeQuery();			
			
			while (r.next()) {
				Integer id = r.getInt("ID_PRODUTO");
				String descricao = r.getString("DESCRICAO");
				Double volume = r.getDouble("VOLUME");
				Double peso = r.getDouble("PESO");
				Double preco = r.getDouble("PRECO");
				Integer quantidade = r.getInt("QUANTIDADE");
				Double destaque = r.getDouble("DESCONTO");

				Produto pod = new Produto(descricao, volume, peso, preco, quantidade, destaque);
				pod.setId(id);
				lista.add(pod);
			}
			r.close();
			p.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}
	
	public void removeProduto(Integer id) {
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();
		
		try {
			PreparedStatement p = con.prepareStatement("delete from PRODUTO where ID_PRODUTO = ?");
			p.setInt(1, id);
			System.out.println(p);
			p.executeUpdate();
			System.out.println("Comando executado");
			p.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateProduto(Produto updateProduto) {
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();
		
		try {
			PreparedStatement p = con.prepareStatement("update PRODUTO set DESCRICAO = ?, VOLUME = ?, PESO = ?, PRECO = ?, ESTOQUE_PRODUTO = ?, PRODUTO_DESTAQUE_ID_PRODUTO_DESTAQUE = ? where ID_PRODUTO = ? ");
			p.setString(1, updateProduto.getDescricao());
			p.setDouble(2, updateProduto.getVolume());
			p.setDouble(3, updateProduto.getPeso());
			p.setDouble(4, updateProduto.getPreco());
			p.setInt(5, updateProduto.getQuantidade());
			p.setDouble(6, updateProduto.getDesconto());
			p.setInt(7, updateProduto.getId());
			
			System.out.println(p);
			p.executeUpdate();
			System.out.println("Comando executado");
			p.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	public Produto selectById(Integer id) {
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();
		Produto pod = null;
		try {
			PreparedStatement p = con.prepareStatement("select * from PRODUTO where ID_PRODUTO = ?");
			p.setInt(1, id);
			ResultSet r = p.executeQuery();			
			
			while (r.next()) {
				String descricao = r.getString("DESCRICAO");
				Double volume = r.getDouble("VOLUME");
				Double peso = r.getDouble("PESO");
				Double preco = r.getDouble("PRECO");
				Integer quantidade = r.getInt("ESTOQUE_PRODUTO");
				Double destaque = r.getDouble("PRODUTO_DESTAQUE_ID_PRODUTO_DESTAQUE");

				pod = new Produto(descricao, volume, peso, preco, quantidade, destaque);
				pod.setId(id);
			}
			r.close();
			p.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pod;
	}
	
	public void exclusionProduto(Integer id) {
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();
		
		try {
			PreparedStatement p = con.prepareStatement("update PRODUTO set STATUS_PRODUTO = 0 where ID_PRODUTO = ?");
			p.setInt(1, id);
			System.out.println(p);
			p.executeUpdate();
			System.out.println("Comando executado");
			p.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}