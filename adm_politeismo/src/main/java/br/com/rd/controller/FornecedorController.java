package br.com.rd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.rd.dao.FornecedorDao;
import br.com.rd.model.Fornecedor;

/**
 * Servlet implementation class FornecedorController
 */
@WebServlet("/FornecedorController")
public class FornecedorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 FornecedorDao fc;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FornecedorController() {
        super();
     this.fc = new FornecedorDao();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String option = request.getParameter("option");
		if (option == null) {
			option = "Entrou";
		}
		switch(option) {
			case ("insertForm"):
				showInsertFornecedor(request, response);
			break;
			case ("updateForm"):
				showUpdateFornecedor(request, response);
			break;
			case ("update"):
				updateUser(request, response);
			break;
			case ("delete"):
				deleteFornecedor(request, response);
			break;
			case ("insert"):
				insertFornecedor(request, response);
			break;
			case ("sair"):
			     Sair(request, response);
			break;
			default:
				selectAllFornecedor(request, response);
		}
	}
	
	private void Sair(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.getRequestDispatcher("deslogar.jsp").forward(request, response);
	}

	private void showInsertFornecedor(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.getRequestDispatcher("FormFornecedores.jsp").forward(request, response);
	}
	
	private void showUpdateFornecedor(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		Integer id = Integer.parseInt(request.getParameter("id"));
		Fornecedor fornecdor = this.fc.selectById(id);
		request.setAttribute("fornecedor", fornecdor);
		request.getRequestDispatcher("FormFornecedores.jsp").forward(request, response);
	}
	
	private void insertFornecedor(HttpServletRequest tomate, HttpServletResponse alface) throws ServletException, IOException{
		String razaoBack = tomate.getParameter("razao");
		String cnpjBack = tomate.getParameter("cnpj");
		String emailBack = tomate.getParameter("email");
		String telefoneBack = tomate.getParameter("telefone");

		if (razaoBack != null && cnpjBack !=null && emailBack !=null && telefoneBack !=null) {
			if (!razaoBack.equals("")){
				Fornecedor fc1 = new Fornecedor(razaoBack, cnpjBack, emailBack,telefoneBack);
				this.fc.insert(fc1);
			}
		}
		alface.sendRedirect("FornecedorController");
	}
	
	private void selectAllFornecedor(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setAttribute("listFornecedor", this.fc.selectAll());
		request.getRequestDispatcher("listFornecedores.jsp").forward(request, response);
	}
	
	private void deleteFornecedor(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idBack = request.getParameter("id");
		if (idBack != null) {
			Integer id = Integer.parseInt(idBack);
			this.fc.exclusionFornecedor(id);
		}
		response.sendRedirect("FornecedorController");
	}
	
	private void updateUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String razaoBack = request.getParameter("razao");
		String cnpjBack = request.getParameter("cnpj");
		String emailBack = request.getParameter("email");
		String telefoneBack = request.getParameter("telefone");
		String idBack = request.getParameter("id");

		if ((razaoBack != null) && (idBack != null) && (cnpjBack != null) && (emailBack != null && telefoneBack !=null)) {
			if (!razaoBack.equals("")){
				Integer id = Integer.parseInt(idBack);
				Fornecedor fc1 = new Fornecedor(razaoBack, cnpjBack, emailBack,telefoneBack);
				fc1.setId(id);
				this.fc.updateFornecedor(fc1);
			}
		}
		response.sendRedirect("FornecedorController");
	}
	
}