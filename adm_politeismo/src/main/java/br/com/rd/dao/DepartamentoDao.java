package br.com.rd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.rd.model.Departamento;



public class DepartamentoDao {
	public void insert(Departamento departamento) {
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();
		
		try {
			PreparedStatement p = con.prepareStatement("insert into departamento (nome, fl_inativo) values (?, true)");
			p.setString(1, departamento.getNome());
					
			System.out.println(p);
			p.executeUpdate();
			System.out.println("Comando executado");
			p.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public ArrayList<Departamento> selectAll(){
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();
		ArrayList<Departamento> lista = new ArrayList<Departamento>();
		try {
			PreparedStatement p = con.prepareStatement("select * from departamento where fl_inativo != 0 order by id_departamento;");
			ResultSet r = p.executeQuery();			
			
			while (r.next()) {
				Integer id = r.getInt("id_departamento");
				String nome = r.getString("nome");
				Departamento cat = new Departamento(nome);
				cat.setId(id);
				lista.add(cat);
			}
			r.close();
			p.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}
	
	public void removeDepartamento(Integer id) {
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();
		
		try {
			PreparedStatement p = con.prepareStatement("delete from departamento where id_departamento = ?");
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
	
	public void updateDepartamento(Departamento updateDepartamento) {
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();
		
		try {
			PreparedStatement p = con.prepareStatement("update departamento set nome = ? where id_departamento = ?");
			p.setString(1, updateDepartamento.getNome());
			p.setInt(2, updateDepartamento.getId());
			System.out.println(p);
			p.executeUpdate();
			System.out.println("Comando executado");
			p.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	public Departamento selectById(Integer id) {
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();
		Departamento dep = null;
		try {
			PreparedStatement p = con.prepareStatement("select * from departamento where id_departamento = ?");
			p.setInt(1, id);
			ResultSet r = p.executeQuery();			
			
			
			while (r.next()) {
				//Integer id2 = r.getInt("id");
				String nome = r.getString("nome");
				dep = new Departamento(nome);
				dep.setId(id);
			}
			r.close();
			p.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dep;
	}
	
	public void exclusionDepartamento(Integer id) {
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();
		
		try {
			PreparedStatement p = con.prepareStatement("update departamento set fl_inativo = 0 where id_departamento = ?");
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
