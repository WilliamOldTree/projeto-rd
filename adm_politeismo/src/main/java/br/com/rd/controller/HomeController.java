package br.com.rd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.rd.dao.CadastroDao;
import br.com.rd.dao.ClienteDao;
import br.com.rd.dao.HomeDao;
import br.com.rd.dao.PedidosDao;
import br.com.rd.dao.ProdutoDao;
import br.com.rd.model.UserADM;

/**
 * Servlet implementation class HomeController
 */
@WebServlet("/HomeController")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProdutoDao prod;
	HomeDao usuario;
	ClienteDao cliente;
	CadastroDao user;
	PedidosDao pedidos;
    
    
	public HomeController() {
    	super();
 
        this.prod = new ProdutoDao();
        this.usuario = new HomeDao();
        this.cliente = new ClienteDao();
        //this.cjuridica = new ClienteJuridicaDao();
        this.user = new CadastroDao();
        this.pedidos = new PedidosDao();
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
		case ("updateForm"):
			showUpdateUser(request, response);
		break;
			case ("update"):
				updateUser(request, response);
			break;
			case ("delete"):
				deleteUser(request, response);
			break;
			case ("insert"):
				insertUser(request, response);
			break;
			
			case ("insertForm"):
				showInsertUser(request, response);
			break;
			case ("sair"):
			     Sair(request, response);
			break;
			default:
				selectAllUser(request, response);

		}
	}
	
	private void Sair(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		   response.sendRedirect("deslogar.jsp");
	}
	
	private void showUpdateUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		Integer id = Integer.parseInt(request.getParameter("id"));
		UserADM u = this.user.selectById(id);
		request.setAttribute("usuario", u);
		request.getRequestDispatcher("formCadastro.jsp").forward(request, response);
	}
	
	private void showInsertUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.getRequestDispatcher("formCadastro.jsp").forward(request, response);
	}
	
	private void insertUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String nomeBack = request.getParameter("nome");
		String cargoBack = request.getParameter("cargo");
		String emailBack = request.getParameter("email");
		String senhaBack = request.getParameter("senha");
		if (nomeBack != null && cargoBack !=null && emailBack !=null && senhaBack !=null) {
			if (!emailBack.equals("")){
				UserADM user1 = new UserADM(nomeBack, cargoBack, emailBack, senhaBack);
				this.user.insert(user1);
			}
		}
		response.sendRedirect("HomeController");
	}
	
	
	private void deleteUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idBack = request.getParameter("id");
		if (idBack != null) {
			Integer id = Integer.parseInt(idBack);
			this.user.removeUser(id);
		}
		response.sendRedirect("HomeController");
	}
	
	private void selectAllUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setAttribute("listaProduto", this.prod.selectAll());
		request.setAttribute("listaCliente", this.cliente.selectCliente());
		request.setAttribute("listaUser", this.user.selectAll());
		request.setAttribute("listaDetalhes", this.pedidos.selectAll());
		request.getRequestDispatcher("home.jsp").forward(request, response);
	}
	
	private void updateUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idBack = request.getParameter("id");
		String nomeBack = request.getParameter("nome");
		String cargoBack = request.getParameter("cargo");
		String emailBack = request.getParameter("email");
		String senhaBack = request.getParameter("senha");
		if (nomeBack != null && cargoBack !=null && emailBack !=null && senhaBack !=null) {
			if (!emailBack.equals("")){
				Integer id = Integer.parseInt(idBack);
				UserADM user1 = new UserADM(nomeBack, cargoBack, emailBack, senhaBack);
				user1.setId(id);
				this.user.updateFornecedor(user1);
			}
		}
		response.sendRedirect("HomeController");
	}
	
	
}
