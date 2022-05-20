package br.com.rd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.rd.model.Categoria;


public class CategoriaDao{

	public void insert(Categoria categoria) {
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();
		
		try {
			PreparedStatement p = con.prepareStatement("insert into categoria (nome, fl_inativo) values (?,true)");
			p.setString(1, categoria.getNome());
					
			System.out.println(p);
			p.executeUpdate();
			System.out.println("Comando executado");
			p.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public ArrayList<Categoria> selectAll(){
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();
		ArrayList<Categoria> lista = new ArrayList<Categoria>();
		try {
			PreparedStatement p = con.prepareStatement("select * from categoria where fl_inativo != 0 order by id_categoria ;\r\n");
			ResultSet r = p.executeQuery();			
			
			while (r.next()) {
				Integer id = r.getInt("id_categoria");
				String nome = r.getString("nome");
				Categoria u = new Categoria(nome);
				u.setId(id);
				lista.add(u);
			}
			r.close();
			p.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}
	
	public void removeCategoria(Integer id) {
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();
		
		try {
			PreparedStatement p = con.prepareStatement("delete from categoria where id_categoria = ?");
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
	
	public void updateCategoria(Categoria updateCategoria) {
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();
		
		try {
			PreparedStatement p = con.prepareStatement("update categoria set nome = ? where id_categoria = ?");
			p.setString(1, updateCategoria.getNome());
			p.setInt(2, updateCategoria.getId());
			System.out.println(p);
			p.executeUpdate();
			System.out.println("Comando executado");
			p.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	public Categoria selectById(Integer id) {
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();
		Categoria cat = null;
		try {
			PreparedStatement p = con.prepareStatement("select * from categoria where id_categoria = ?");
			p.setInt(1, id);
			ResultSet r = p.executeQuery();			
			
			
			while (r.next()) {
				//Integer id2 = r.getInt("id");
				String nome = r.getString("nome");
				 cat = new Categoria(nome);
				 cat.setId(id);
			}
			r.close();
			p.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cat;
	}
	
	
	public void exclusionCategoria(Integer id) {
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();
		
		try {
			PreparedStatement p = con.prepareStatement("update categoria set fl_inativo = 0 where id_categoria = ?");
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
	
} //endCategoriaDao
