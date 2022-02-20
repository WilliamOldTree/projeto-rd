package br.com.rd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.rd.dao.DetalhesFisicaDao;
import br.com.rd.model.DetalhesFisica;


@WebServlet("/DetalhesFisicaController")
public class DetalhesFisicaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private DetalhesFisicaDao dtFisDao;
    
    public DetalhesFisicaController() {
        super();
      this.dtFisDao = new DetalhesFisicaDao();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		showDetalhesFisica(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
	
	private void showDetalhesFisica(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		Integer id = Integer.parseInt(request.getParameter("id"));
		DetalhesFisica df= this.dtFisDao.showDetalhesFisica(id);
		request.setAttribute("detalhesFisica", df);
//		request.getRequestDispatcher("formCategoria.jsp").forward(request, response); precisa setar a pagina jsp
		 
	}


}// end Servlet
