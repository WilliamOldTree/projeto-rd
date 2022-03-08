package br.com.rd.controller;

import java.io.IOException;
<<<<<<< HEAD
=======

>>>>>>> 0918a4fffc96c61f9513e9cbcf57aa129fdc1fad
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
<<<<<<< HEAD
import br.com.rd.dao.DetalhesFisicaDao;

=======

import br.com.rd.dao.DetalhesFisicaDao;
import br.com.rd.model.DetalhesFisica;
>>>>>>> 0918a4fffc96c61f9513e9cbcf57aa129fdc1fad


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
<<<<<<< HEAD
		String op = request.getParameter("op");
		if (op == null) {
			op = "Entrou";
		}
		switch(op) {

		default:
				showDetalhesFisica(request, response);
	
		}
	
=======
		
>>>>>>> 0918a4fffc96c61f9513e9cbcf57aa129fdc1fad
		doGet(request, response);
	}
	
	private void showDetalhesFisica(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
<<<<<<< HEAD
		request.setAttribute("detalhesFisica", this.dtFisDao.showDetalhesFisica());
	    request.getRequestDispatcher("df.jsp").forward(request, response); 
=======
		Integer id = Integer.parseInt(request.getParameter("id"));
		DetalhesFisica df= this.dtFisDao.showDetalhesFisica(id);
		request.setAttribute("detalhesFisica", df);
//		request.getRequestDispatcher("formCategoria.jsp").forward(request, response); precisa setar a pagina jsp
		 
>>>>>>> 0918a4fffc96c61f9513e9cbcf57aa129fdc1fad
	}


}// end Servlet
