package br.com.rd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import br.com.rd.model.Produto;

public class ProdutoDao {
	private String descricaoBack;
	private Double volumeBack;
	private Double pesoBack;
	private String situacaoBack;
	private Double precoBack;
	private Integer estoqueBack;
	private Integer destaqueBack;

	public void insert(Produto produto) {
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();
		try {
			PreparedStatement p = con.prepareStatement("insert into produto (ID_PRODUTO, DESCRICAO, VOLUME, PESO, SITUACAO, PRECO, ESTOQUE_PRODUTO, PRODUTO_DESTAQUE_ID_PRODUTO_DESTAQUE) values (?,?,?,?,?,?,?,?)");
			p.setInt(1, produto.getId());
			p.setString(2, produto.getDescricao());
			p.setDouble(3, produto.getVolume());
			p.setDouble(4, produto.getPeso());
			p.setString(5, produto.getSituacao());
			p.setDouble(6, produto.getPreco());
			p.setInt(7, produto.getEstoque());
			p.setInt(8, produto.getProdutoDestaque());
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
			PreparedStatement p = con.prepareStatement("select * from produto");
			ResultSet r = p.executeQuery();			
			
			while (r.next()) {
				Integer id = r.getInt("id");
				Produto prod = new Produto(descricaoBack, volumeBack, pesoBack, situacaoBack, precoBack, estoqueBack, destaqueBack);
				prod.setId(id);
				lista.add(prod);
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
			PreparedStatement p = con.prepareStatement("delete from produto where id_produto = ?");
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
	
	//public void updateUser(Integer id, String newName) {
	public void updateProduto(Produto updateProduto) {
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();
		try {
			PreparedStatement p = con.prepareStatement("update produto set DESCRICAO = ?, VOLUME = ?, PESO = ?, SITUACAO = ?, PRECO = ?, ESTOQUE_PRODUTO = ?, PRODUTO_DESTAQUE_ID_PRODUTO_DESTAQUE = ? where ID_PRODUTO = ?");
			Produto produto = new Produto(descricaoBack, volumeBack, pesoBack, situacaoBack, precoBack, estoqueBack, destaqueBack);
			p.setInt(1, produto.getId());
			p.setString(2, produto.getDescricao());
			p.setDouble(3, produto.getVolume());
			p.setDouble(4, produto.getPeso());
			p.setString(5, produto.getSituacao());
			p.setDouble(6, produto.getPreco());
			p.setInt(7, produto.getEstoque());
			p.setInt(8, produto.getProdutoDestaque());
			
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
		Produto prod = null;
		
		try {
			PreparedStatement p = con.prepareStatement("select * from produto where id_produto = ?");
			
			p.setInt(1, id);
			ResultSet r = p.executeQuery();		
			while (r.next()) {
				Integer id1 = r.getInt("id");
				prod.setId(id1);
			}
			r.close();
			p.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prod;
	}
}//endCategoriaDao