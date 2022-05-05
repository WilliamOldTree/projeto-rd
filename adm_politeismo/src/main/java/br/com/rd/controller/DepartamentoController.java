package br.com.rd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.rd.dao.DepartamentoDao;
import br.com.rd.model.Departamento;

/**
 * Servlet implementation class DepartamentoController
 */
@WebServlet("/DepartamentoController")
public class DepartamentoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    DepartamentoDao dep;
    
	public DepartamentoController() {
    	super();
 
        this.dep = new DepartamentoDao();
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
				showInsertDepartamento(request, response);
			break;
			case ("updateForm"):
				showUpdateDepartamento(request, response);
			break;
			case ("update"):
				updateDepartamento(request, response);
			break;
			case ("delete"):
				deleteDepartamento(request, response);
			break;
			case ("insert"):
				insertDepartamento(request, response);
			break;
			case ("sair"):
				Sair(request, response);
			break;
			default:
				selectAllDepartamento(request, response);
		}
	}
    
	

	private void Sair(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		   response.sendRedirect("deslogar.jsp");
	}

	private void showInsertDepartamento(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.getRequestDispatcher("formDepartamento.jsp").forward(request, response);
	}
	
	private void showUpdateDepartamento(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		Integer id = Integer.parseInt(request.getParameter("id"));
		Departamento d = this.dep.selectById(id);
		request.setAttribute("departamento", d);
		request.getRequestDispatcher("formDepartamento.jsp").forward(request, response);
	}
	
	private void insertDepartamento(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String nomeBack = request.getParameter("nome");
		if (nomeBack != null) {
			if (!nomeBack.equals("")){
				Departamento cat1 = new Departamento(nomeBack);
				this.dep.insert(cat1);
			}
		}
		response.sendRedirect("DepartamentoController");
	}
	
	private void selectAllDepartamento(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setAttribute("listaDepartamento", this.dep.selectAll());
		request.getRequestDispatcher("listDepartamento.jsp").forward(request, response);
	}
	
	private void deleteDepartamento(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idBack = request.getParameter("id");
		if (idBack != null) {
			Integer id = Integer.parseInt(idBack);
			this.dep.exclusionDepartamento(id);
		}
		response.sendRedirect("DepartamentoController");
	}
	
	private void updateDepartamento(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeBack = request.getParameter("nome");
		String idBack = request.getParameter("id");
		if ((nomeBack != null) && (idBack != null)) {
			if (!nomeBack.equals("")){
				Integer id = Integer.parseInt(idBack);
				Departamento dep1 = new Departamento(nomeBack);
				dep1.setId(id);
				this.dep.updateDepartamento(dep1);
			}
		}
		response.sendRedirect("DepartamentoController");
	}
}