package br.com.rd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.rd.dao.DetalhesFisicaDao;



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
		String op = request.getParameter("op");
		if (op == null) {
			op = "Entrou";
		}
		switch(op) {

		default:
				showDetalhesFisica(request, response);
	
		}
	
		doGet(request, response);
	}
	
	private void showDetalhesFisica(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setAttribute("detalhesFisica", this.dtFisDao.showDetalhesFisica());
	    request.getRequestDispatcher("df.jsp").forward(request, response); 
	}


}// end Servlet
