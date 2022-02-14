package br.com.rd.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.rd.dao.ListaClienteDao;


@WebServlet("/ListaClientes")
public class ListaClienteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	ListaClienteDao lsDao;
    
    public ListaClienteController() {
        super();
        this.lsDao = new ListaClienteDao();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			request.setAttribute("lista", this.lsDao.listarClientes());
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		request.getRequestDispatcher("listCliente.jsp").forward(request, response);
		
	}

}
