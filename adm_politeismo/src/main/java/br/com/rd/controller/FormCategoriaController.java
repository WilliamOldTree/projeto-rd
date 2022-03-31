package br.com.rd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.rd.dao.CategoriaDao;
import br.com.rd.model.Categoria;

/**
 * Servlet implementation class CategoriaController
 */
@WebServlet("/FormCategoriaController")
public class FormCategoriaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CategoriaDao cat;

       
    public FormCategoriaController() {
    	super();
 
        this.cat = new CategoriaDao();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String option = request.getParameter("option");
		if (option == null) {
			option = "Entrou";
		}
		switch(option) {
		case ("insertForm"):
			showInsertCategoria(request, response);
		break;
		case ("updateForm"):
			showUpdateCategoria(request, response);
		break;
			case ("update"):
				updateUser(request, response);
			break;
			case ("delete"):
				deleteCategoria(request, response);
			break;
			case ("insert"):
				insertCategoria(request, response);
			break;
		//	case ("sair"):
			//     Sair(request, response);
		//	break;
			default:
				selectAllCategorias(request, response);
		}
	}
	
//	private void Sair(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	//	request.getRequestDispatcher("deslogar.jsp").forward(request, response);
	//}

	private void showInsertCategoria(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.getRequestDispatcher("formCategoria.jsp").forward(request, response);
	}
	
	private void showUpdateCategoria(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		Integer id = Integer.parseInt(request.getParameter("id"));
		Categoria c = this.cat.selectById(id);
		request.setAttribute("categoria", c);
		request.getRequestDispatcher("formCategoria.jsp").forward(request, response);
	}
	
	private void insertCategoria(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String nomeBack = request.getParameter("nome");
		if (nomeBack != null) {
			if (!nomeBack.equals("")){
				Categoria cat1 = new Categoria(nomeBack);
				this.cat.insert(cat1);
			}
		}
		response.sendRedirect("CategoriaController");
	}
	
	private void selectAllCategorias(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setAttribute("listaCategoria", this.cat.selectAll());
		request.getRequestDispatcher("listCategoria.jsp").forward(request, response);
	}
	
	private void deleteCategoria(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idBack = request.getParameter("id");
		if (idBack != null) {
			Integer id = Integer.parseInt(idBack);
			this.cat.removeCategoria(id);;
		}
		response.sendRedirect("CategoriaController");
	}
	
	private void updateUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeBack = request.getParameter("nome");
		String idBack = request.getParameter("id");
		if ((nomeBack != null) && (idBack != null)) {
			if (!nomeBack.equals("")){
				Integer id = Integer.parseInt(idBack);
				Categoria cat1 = new Categoria(nomeBack);
				cat1.setId(id);
				this.cat.updateCategoria(cat1);
			}
		}
		response.sendRedirect("CategoriaController");
	}
	
}
