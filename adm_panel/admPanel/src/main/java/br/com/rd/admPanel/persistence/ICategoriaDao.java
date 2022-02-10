package br.com.rd.admPanel.persistence;

import java.sql.SQLException;
import java.util.List;

import br.com.rd.admPanel.model.Categoria;

public interface ICategoriaDao {
	public void inserirCategoria (Categoria categoria) throws SQLException;
	public void atualizarCategoria(Categoria categoria) throws SQLException;
	public void deletarCategoria(Integer id) throws SQLException;
	public List<Categoria> listarCategoria() throws SQLException;

}// end ICategoriaDao
