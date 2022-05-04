package br.com.rd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.rd.model.UserADM;

public class HomeDao {
	public ArrayList<UserADM> selectAll(){
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();
		ArrayList<UserADM> lista = new ArrayList<UserADM>();
		try {
			PreparedStatement p = con.prepareStatement("select * from user_adm");
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

}
