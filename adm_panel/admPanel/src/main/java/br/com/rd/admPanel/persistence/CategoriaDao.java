package br.com.rd.admPanel.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
	}

	@Override
	public void atualizarCategoria(Categoria categoria) throws SQLException {
		String sql = "UPDATE CATEGORIA SET NOME = ? WHERE ID_CATEGORIA = ?";
		PreparedStatement ps = c.prepareStatement(sql);
		ps.setString(1, categoria.getNome());
		ps.setInt(2,categoria.getId());
		ps.execute();
		ps.close();
	}

	@Override
	public void deletarCategoria(Categoria categoria) throws SQLException {
		String sql = "DELETE CATEGORIA WHERE ID_CATEGORIA = ?";
		PreparedStatement ps = c.prepareStatement(sql);
		ps.setInt(1, categoria.getId());
		ps.execute();
		ps.close();	
	}

	@Override
	public List<Categoria> listarCategoria() throws SQLException {
		List<Categoria> listaCategoria = new ArrayList<Categoria>();
		
		return null;
	}
	
	

}
