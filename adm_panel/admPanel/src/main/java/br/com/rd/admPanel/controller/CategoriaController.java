package br.com.rd.admPanel.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.rd.admPanel.model.Categoria;
import br.com.rd.admPanel.persistence.CategoriaDao;


@WebServlet("/Categoria")
public class CategoriaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private CategoriaDao catDao;
	
	
  
    public CategoriaController() throws ClassNotFoundException, SQLException {
		super();
		this.catDao = new CategoriaDao();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
	}//end doGet

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String option = request.getParameter("option");
		if (option == null  || option == "") {
			// criar metodo de erro na tela			
		}
		
		switch(option) {
		
		case ("inserirCat"):
			inserirCat(request, response);
		break;
		
		case ("deletarCat"):
			deletarCat(request, response);
		break;
		
		case ("atualizarCat"):
			atualizarCat(request, response);
		break;
		
		case ("listarCat"):
			listarCat(request, response);
		break;
		
		default:
			mostrarCat(request, response);
		
		
		}//end switch
		
	}//end doPost



	private void mostrarCat (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("Categoria").forward(request, response);
		
	}

	

	private void inserirCat (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nameBack = request.getParameter("nome");
		
		if (nameBack != null ) {
				}else if (!nameBack.equals("")) {
			Categoria categoria = new Categoria(nameBack);
			
			try {
				this.catDao.inserirCategoria(categoria);
			
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		 response.sendRedirect("CategoriaController");
	}//end inserirCat
	
	

	private void deletarCat (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String idBack = request.getParameter("id");
		int id = Integer.parseInt(idBack);
		
		try {
			this.catDao.deletarCategoria(id);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		response.sendRedirect("CategoriaController");
		
	}//end deletarCatt
	
	
	
	private void atualizarCat (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String idBack = request.getParameter("id");
		String nameBack = request.getParameter("nome");
		
		if ((idBack != null) && (nameBack != null)) {
		
		}else if (!nameBack.equals ("")) {
			Integer id = Integer.parseInt(idBack);
			Categoria cat = new Categoria (nameBack);
			cat.setId(id);
			
			try {
				this.catDao.atualizarCategoria(cat);
			
			} catch (SQLException e) {
				e.printStackTrace();
				
			}
		}
		response.sendRedirect("CategoriaController");
		
	}// end altualizarCat
	
	
	
	private void listarCat (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			request.setAttribute("listaCategoria", this.catDao.listarCategoria());
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.getRequestDispatcher("Categoria").forward(request, response);	
	
		
	}//end listarCat
	
	
}//end CategoriaController
