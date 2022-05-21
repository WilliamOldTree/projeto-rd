package br.com.rd.dao;

import java.util.ArrayList;

import br.com.rd.model.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;

public class ClienteDao {

	public ArrayList<Cliente> selectAll(){
		Conexao c = Conexao.getInstance();
		Connection con = c.getConnection();
		ArrayList<Cliente> listaFisica = new ArrayList<Cliente>();
		
		try {
			PreparedStatement p = con.prepareStatement("SELECT * FROM CLIENTE");
			ResultSet r = p.executeQuery();			
			
			while (r.next()) {
				
				
				Cliente cliente = new Cliente();
				cf.setId(id);
				listaFisica.add(cf);
			}

}//end class
