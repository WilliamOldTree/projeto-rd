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
			PreparedStatement p = con.prepareStatement("insert into PRODUTO (NOME, DESCRICAO, URL_PRODUTO, VOLUME, PESO, PRECO, ESTOQUE, FK_ID_CATEGORIA, FK_ID_DEPARTAMENTO, FK_ID_FORNECEDOR, FK_ID_PRODUTO_DESTAQUE, FL_INATIVO) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, true)");
			p.setString(1, produto.getNome());
			p.setString(2, produto.getDescricao());
			p.setString(3, produto.getUrlProduto());
			p.setDouble(4, produto.getVolume());
			p.setDouble(5, produto.getPeso());
			p.setDouble(6, produto.getPreco());
			p.setDouble(7, produto.getEstoque());
			p.setInt(8, produto.getCategoria());
			p.setInt(9, produto.getDepartamento());
			p.setInt(10, produto.getFornecedor());
			p.setDouble(11, produto.getProdutoDestaque());
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
			PreparedStatement p = con.prepareStatement("select P.ID_PRODUTO, P.NOME, P.ESTOQUE, P.PRECO, C.NOME, D.NOME, F.RAZAO_SOCIAL FROM PRODUTO P join CATEGORIA C on P.FK_ID_CATEGORIA = C.ID_CATEGORIA join DEPARTAMENTO D on P.FK_ID_DEPARTAMENTO = D.ID_DEPARTAMENTO join FORNECEDOR F on P.FK_ID_FORNECEDOR =  F.ID_FORNECEDOR WHERE P.FL_INATIVO != 0\r\n");
			
			ResultSet r = p.executeQuery();			
			
			while (r.next()) {
				Integer id = r.getInt("ID_PRODUTO");
				String nome = r.getString("NOME");
				Integer estoque = r.getInt("ESTOQUE");
				Double preco = r.getDouble("PRECO");
				String categoria = r.getString("C.NOME");
				String departamento = r.getString("D.NOME");
				String fornecedor = r.getString("RAZAO_SOCIAL");

				Produto pod = new Produto(nome, estoque, preco, categoria, departamento, fornecedor);
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
			PreparedStatement p = con.prepareStatement("update PRODUTO set NOME = ?, DESCRICAO =?, URL_PRODUTO =?, VOLUME = ?, PESO=?, PRECO =?, ESTOQUE = ?, FK_ID_DEPARTAMENTO = ?, FK_ID_CATEGORIA = ?, FK_ID_FORNECEDOR = ?, FK_ID_PRODUTO_DESTAQUE = ? where ID_PRODUTO = ? ");
			p.setString(1, updateProduto.getNome());
			p.setString(2, updateProduto.getDescricao());
			p.setString(3, updateProduto.getUrlProduto());
			p.setDouble(4, updateProduto.getVolume());
			p.setDouble(5, updateProduto.getPeso());
			p.setDouble(6, updateProduto.getPreco());
			p.setDouble(7, updateProduto.getEstoque());
			p.setInt(8, updateProduto.getDepartamento());
			p.setInt(9, updateProduto.getCategoria());
			p.setInt(10, updateProduto.getFornecedor());
			p.setDouble(11, updateProduto.getProdutoDestaque());
			p.setInt(12, updateProduto.getId());
			
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
				String nome = r.getString("NOME");
				String descricao = r.getString("DESCRICAO");
				String urlProduto = r.getString("URL_PRODUTO");
				Double volume = r.getDouble("VOLUME");
				Double peso = r.getDouble("PESO");
				Double preco = r.getDouble("PRECO");
				Integer quantidade = r.getInt("ESTOQUE");
				Integer departamento = r.getInt("FK_ID_DEPARTAMENTO");
				Integer categoria = r.getInt("FK_ID_CATEGORIA");
				Integer fornecedor = r.getInt("FK_ID_FORNECEDOR");
				Double destaque = r.getDouble("FK_ID_PRODUTO_DESTAQUE");

				pod = new Produto(nome, descricao,urlProduto, volume,peso, preco, quantidade, departamento, categoria,fornecedor,destaque);
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
			PreparedStatement p = con.prepareStatement("update PRODUTO set FL_INATIVO = 0 where ID_PRODUTO = ?");
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