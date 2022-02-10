package br.com.rd.admPanel.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.rd.admPanel.model.Categoria;

public class CategoriaDao implements ICategoriaDao{

	private Connection c;
	
	public CategoriaDao() throws ClassNotFoundException, SQLException {
			IGenericDao gDao = new GenericDao();
			c = gDao.getConnection();
	}

	@Override
	public void inserirCategoria(Categoria categoria) throws SQLException {
		
		String sql = "INSERT INTO CATEGORIA (ID_CATEGORIA, NOME) VALUES (?,?)";
		PreparedStatement ps = c.prepareStatement(sql);
		ps.setInt(1, categoria.getId());
		ps.setString(2, categoria.getNome());
		ps.execute();
		ps.close();
		
	}//end inserirCategoria

	
	@Override
	public void atualizarCategoria(Categoria categoria) throws SQLException {
		
		String sql = "UPDATE CATEGORIA SET NOME = ? WHERE ID_CATEGORIA = ?";
		PreparedStatement ps = c.prepareStatement(sql);
		ps.setString(1, categoria.getNome());
		ps.setInt(2,categoria.getId());
		ps.execute();
		ps.close();
		
	}// end atualizarCategoria

	
	@Override
	public void deletarCategoria(Integer id) throws SQLException {
		
		String sql = "DELETE CATEGORIA WHERE ID_CATEGORIA = ?";
		PreparedStatement ps = c.prepareStatement(sql);
		ps.setInt(1, id);
		ps.execute();
		ps.executeUpdate();
		ps.close();	
	
	}//end deletarCategoria

	
	@Override
	public List<Categoria> listarCategoria() throws SQLException {
		
		List<Categoria> listaCategoria = new ArrayList<Categoria>();
		String sql = "SELECT ID_CATEGORIA, NOME FROM CATEGORIA";
		PreparedStatement ps = c.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			Categoria categoria = new Categoria(rs.getInt("ID_CATEGORIA"), rs.getString("NOME"));
			listaCategoria.add(categoria);	
		}
		
		ps.execute();
		ps.executeUpdate();
		rs.close();
		ps.close();
		
		return listaCategoria;
		
	}//end listarCategoria
	
}//endCategoriaDao
