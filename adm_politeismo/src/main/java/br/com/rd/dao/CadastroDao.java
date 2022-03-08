package br.com.rd.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import br.com.rd.model.UserADM;

public class CadastroDao {
	
	public void insert(UserADM user) {
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();
		
		try {
			PreparedStatement p = con.prepareStatement("insert into USER_ADM (NOME, CARGO, EMAIL, SENHA) values (?,?,?,MD5(?))");
            
			p.setString(1, user.getNome());
			p.setString(2, user.getCargo());
			p.setString(3, user.getEmail());
			p.setString(4, user.getSenha());
			System.out.println(p);
			p.executeUpdate();
			System.out.println("Comando executado");
			p.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ArrayList<UserADM> selectAll(){
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();
		ArrayList<UserADM> lista = new ArrayList<UserADM>();
		try {
			PreparedStatement p = con.prepareStatement("select * from USER_ADM");
			ResultSet r = p.executeQuery();			
			
			while (r.next()) {
				Integer id = r.getInt("ID_ADM");
				String nome = r.getString("nome");
				String cargo = r.getString("cargo");
				String email = r.getString("email");
				UserADM usuario = new UserADM(nome, cargo, email);
				usuario.setId(id);
				lista.add(usuario);
			}
			r.close();
			p.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	public void removeUser(Integer id) {
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();
		
		try {
			PreparedStatement p = con.prepareStatement("delete from USER_ADM where ID_ADM = ?");
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

	public void updateFornecedor(UserADM updateUser) {
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();
		
		try {
			PreparedStatement p = con.prepareStatement("UPDATE USER_ADM SET NOME = ?, CARGO = ?, EMAIL = ?, SENHA =MD5(?) WHERE ID_ADM = ?");
			p.setString(1, updateUser.getNome());
			p.setString(2, updateUser.getCargo());
			p.setString(3, updateUser.getEmail());
			p.setString(4, updateUser.getSenha());
			p.setInt(5, updateUser.getId());
			System.out.println(p);
			p.executeUpdate();
			System.out.println("Comando executado");
			p.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	public UserADM selectById(Integer id) {
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();
		UserADM user = null;
		try {
			PreparedStatement p = con.prepareStatement("SELECT * FROM USER_ADM WHERE ID_ADM = ?");
			p.setInt(1, id);
			ResultSet r = p.executeQuery();			
			
			
			while (r.next()) {
				String nome = r.getString("NOME");
				String cargo = r.getString("CARGO");
				String email = r.getString("EMAIL");
				String senha = r.getString("SENHA");
				user = new UserADM(nome, cargo, email,senha);
				user.setId(id);
			}
			r.close();
			p.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}
	
}
