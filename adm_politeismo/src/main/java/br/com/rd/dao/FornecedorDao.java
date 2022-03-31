package br.com.rd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import br.com.rd.model.Fornecedor;


public class FornecedorDao {



public void insert(Fornecedor fornecedor) {
	Conexao c = Conexao.getInstance();
	Connection con = c.getConnection();
	
	try {
		PreparedStatement p = con.prepareStatement("insert into FORNECEDOR (RAZAO_SOCIAL,CNPJ,EMAIL) values (?,?,?)");
		p.setString(1, fornecedor.getRazao());
		p.setString(2, fornecedor.getCnpj());
		p.setString(3, fornecedor.getEmail());
		System.out.println(p);
		p.executeUpdate();
		System.out.println("Comando executado");
		p.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

public ArrayList<Fornecedor> selectAll(){
	Conexao c = Conexao.getInstance();
	Connection con = c.getConnection();
	ArrayList<Fornecedor> lista = new ArrayList<Fornecedor>();
	try {
		PreparedStatement p = con.prepareStatement("select * from fornecedor order by id_fornecedor ;");
		ResultSet r = p.executeQuery();			
		
		while (r.next()) {
			Integer id = r.getInt("id_fornecedor");
			String razao_social = r.getString("razao_social");
			String CNPJ = r.getString("cnpj");
			String email = r.getString("email");
			Fornecedor u = new Fornecedor(razao_social, CNPJ, email);
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

public void removeFornecedor(Integer id) {
	Conexao c = Conexao.getInstance();
	Connection con = c.getConnection();
	
	try {
		PreparedStatement p = con.prepareStatement("delete from FORNECEDOR where ID_FORNECEDOR = ?");
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

public void updateFornecedor(Fornecedor updateFornecedor) {
	Conexao c = Conexao.getInstance();
	Connection con = c.getConnection();
	
	try {
		PreparedStatement p = con.prepareStatement("UPDATE FORNECEDOR SET RAZAO_SOCIAL = ?, CNPJ= ?, EMAIL= ? WHERE id_fornecedor = ?");
		p.setString(1, updateFornecedor.getRazao());
		p.setString(2, updateFornecedor.getCnpj());
		p.setString(3, updateFornecedor.getEmail());
		p.setInt(4, updateFornecedor.getId());
		System.out.println(p);
		p.executeUpdate();
		System.out.println("Comando executado");
		p.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	
public Fornecedor selectById(Integer id) {
	Conexao c = Conexao.getInstance();
	Connection con = c.getConnection();
	Fornecedor fc = null;
	try {
		PreparedStatement p = con.prepareStatement("SELECT * FROM fornecedor WHERE id_fornecedor = ?");
		p.setInt(1, id);
		ResultSet r = p.executeQuery();			
		
		
		while (r.next()) {
			//Integer id2 = r.getInt("id");
			String razao_social = r.getString("razao_social");
			String CNPJ = r.getString("cnpj");
			String email = r.getString("email");
			 fc = new Fornecedor(razao_social, CNPJ, email);
			 fc.setId(id);
		}
		r.close();
		p.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return fc;
}
} //endFornecedorDao


