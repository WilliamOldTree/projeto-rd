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
			PreparedStatement p = con.prepareStatement("insert into PRODUTO (DESCRICAO, VOLUME, PESO, SITUACAO, PRECO) values (?, ?, ?, ?, ?)");
			p.setString(1, produto.getDescricao());
			p.setDouble(2, produto.getVolume());
			p.setDouble(3, produto.getPeso());
			p.setString(4, produto.getSituacao());
			p.setDouble(5, produto.getPreco());
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
			PreparedStatement p = con.prepareStatement("select * from PRODUTO");
			ResultSet r = p.executeQuery();			
			
			while (r.next()) {
				Integer id = r.getInt("ID_PRODUTO");
				String descricao = r.getString("DESCRICAO");
				Double volume = r.getDouble("VOLUME");
				Double peso = r.getDouble("PESO");
				String situacao = r.getString("SITUACAO");
				Double preco = r.getDouble("PRECO");
				Produto pod = new Produto(descricao, volume, peso, situacao, preco);
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
			PreparedStatement p = con.prepareStatement("update PRODUTO set DESCRICAO = ?, VOLUME = ?, PESO = ?, SITUACAO = ?, PRECO = ? where ID_PRODUTO = ?");
			p.setString(1, updateProduto.getDescricao());
			p.setDouble(2, updateProduto.getVolume());
			p.setDouble(3, updateProduto.getPeso());
			p.setString(4, updateProduto.getSituacao());
			p.setDouble(5, updateProduto.getPreco());
			p.setInt(6, updateProduto.getId());
			//p.setInt(7, updateProduto.getQuantidade());
			//p.setDouble(8, updateProduto.getDesconto());
			
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
				//Integer id = r.getInt("id_produto");
				String descricao = r.getString("DESCRICAO");
				Double volume = r.getDouble("VOLUME");
				Double peso = r.getDouble("PESO");
				String situacao = r.getString("SITUACAO");
				Double preco = r.getDouble("PRECO");
				
				pod = new Produto(descricao, volume, peso, situacao, preco);
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
}
