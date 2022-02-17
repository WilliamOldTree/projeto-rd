package br.com.rd.controller;

import java.io.IOException;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.rd.dao.ProdutoDao;
import br.com.rd.model.Produto;


/**
 * Servlet implementation class ProdutoController
 */
@WebServlet("/ProdutoController")
public class ProdutoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    ProdutoDao prod;
    
    
	public ProdutoController() {
    	super();
 
        this.prod = new ProdutoDao();
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
				showInsertProduto(request, response);
			break;
			case ("updateForm"):
				showUpdateProduto(request, response);
			break;
			case ("update"):
				updateProduto(request, response);
			break;
			case ("delete"):
				deleteProduto(request, response);
			break;
			case ("insert"):
				insertProduto(request, response);
			break;
			default:
				selectAllProdutos(request, response);
		}
	}
	

	private void showInsertProduto(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.getRequestDispatcher("formProduto.jsp").forward(request, response);
	}
	
	private void showUpdateProduto(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		Integer id = Integer.parseInt(request.getParameter("id"));
		Produto p = this.prod.selectById(id);
		request.setAttribute("produto", p);
		request.getRequestDispatcher("formProduto.jsp").forward(request, response);
	}
	
	private void insertProduto(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String descricaoBack = request.getParameter("descricao");
		String volumeBack = request.getParameter("volume");
		String pesoBack = request.getParameter("peso");
		String situacaoBack = request.getParameter("situacao");
		String precoBack = request.getParameter("preco");
		if ((descricaoBack != null) && (volumeBack != null) && (pesoBack != null) && (situacaoBack != null) && (precoBack != null)){
			if (!descricaoBack.equals("")){
				Locale.setDefault(Locale.US);
				Double volumeBack1 = Double.valueOf(volumeBack);
				Double pesoBack1 = Double.valueOf(pesoBack);
				Double precoBack1 = Double.valueOf(precoBack);
				Produto prod1 = new Produto(descricaoBack,volumeBack1,pesoBack1,situacaoBack,precoBack1);
				this.prod.insert(prod1);
			}
		}
		response.sendRedirect("ProdutoController");
	}
	
	private void selectAllProdutos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setAttribute("listaProduto", this.prod.selectAll());
		request.getRequestDispatcher("listProduto.jsp").forward(request, response);
	}
	
	private void deleteProduto(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idBack = request.getParameter("id");
		if (idBack != null) {
			Integer id = Integer.parseInt(idBack);
			this.prod.removeProduto(id);
		}
		response.sendRedirect("ProdutoController");
	}
	
	private void updateProduto(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String descricaoBack = request.getParameter("descricao");
		String volumeBack = request.getParameter("volume");
		String pesoBack = request.getParameter("peso");
		String situacaoBack = request.getParameter("situacao");
		String precoBack = request.getParameter("preco");
		String idBack = request.getParameter("id");
		if ((descricaoBack != null) && (volumeBack != null) && (pesoBack != null) && (situacaoBack != null) && (precoBack != null)) {
			if (!descricaoBack.equals("")){
				Locale.setDefault(new Locale("US"));
				Double volumeBack1 = Double.valueOf(volumeBack);
				Double pesoBack1 = Double.valueOf(pesoBack);
				Double precoBack1 = Double.valueOf(precoBack);
				Integer id = Integer.parseInt(idBack);
				Produto prod1 = new Produto(descricaoBack,volumeBack1,pesoBack1,situacaoBack,precoBack1);
				prod1.setId(id);
				this.prod.updateProduto(prod1);
			}
		}
		response.sendRedirect("ProdutoController");
	}
}
