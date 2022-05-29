
package br.com.rd.controller;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.rd.dao.ClienteDao;


@WebServlet("/ClienteController")
public class ClienteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   ClienteDao clienteDao;
   
    public ClienteController() {
        super();
        this.clienteDao = new ClienteDao();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				selectCliente(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String option = request.getParameter("option");
		if (option == null) {
			option = "Entrou";
		}
		switch(option) {

			case ("sair"):
			     Sair(request, response);
			break;
			default:
				selectCliente(request, response);
		}
	}
	
	private void Sair(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		   response.sendRedirect("deslogar.jsp");
	}
	
	private void selectCliente(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setAttribute("listaCliente", this.clienteDao.selectCliente());
		request.getRequestDispatcher("listClienteFisico.jsp").forward(request, response);
	}
	
	
}
	
//end class

