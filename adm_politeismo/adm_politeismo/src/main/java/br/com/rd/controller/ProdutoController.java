package br.com.rd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.rd.dao.ProdutoDao;
import br.com.rd.model.Produto;

/**
 * Servlet implementation class testeController
 */
@WebServlet("/testeController")
public class ProdutoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private ProdutoDao prd;

    
    public ProdutoController() {
    	super();
 
        this.prd = new ProdutoDao();
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
				selectAllProduto(request, response);
		}
	}
	

	private void showInsertProduto(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.getRequestDispatcher("formCategoria.jsp").forward(request, response);
	}
	
	private void showUpdateProduto(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String idBack = request.getParameter("id");
		Integer id = Integer.getInteger(idBack);
		Produto p = this.prd.selectById(id);
		request.setAttribute("produto", p);
		request.getRequestDispatcher("formProduto.jsp").forward(request, response);
	}
	
	private void insertProduto(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String descricaoBack = request.getParameter("descricao");
		String volumeBack = request.getParameter("volume");
		Double volume = Double.parseDouble(volumeBack);
		String pesoBack = request.getParameter("peso");
		Double peso = Double.parseDouble(pesoBack);
		String situacaoBack = request.getParameter("situacao");
		String precoBack = request.getParameter("preco");
		Double preco = Double.parseDouble(precoBack);
		String estoqueBack = request.getParameter("estoque");
		Integer estoque = Integer.parseInt(estoqueBack);
		String prdtDestaqueBack = request.getParameter("prdtDestaque");
		Integer destaque = Integer.parseInt(prdtDestaqueBack);
		
		
		if (descricaoBack != null && volumeBack != null && pesoBack != null && situacaoBack  != null && precoBack  != null && estoqueBack  != null && prdtDestaqueBack  != null ) {
			if (!descricaoBack.equals("")){
				Produto produto = new Produto(descricaoBack, volume, peso, situacaoBack, preco, estoque, destaque);
				this.prd.insert(produto);
			}
		}
		response.sendRedirect("ProdutoController");
	}
	
	private void selectAllProduto(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setAttribute("listaProduto", this.prd.selectAll());
		request.getRequestDispatcher("listProduto.jsp").forward(request, response);
	}
	
	private void deleteProduto(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idBack = request.getParameter("id");
		if (idBack != null) {
			Integer id = Integer.parseInt(idBack);
			this.prd.removeProduto(id);;
		}
		response.sendRedirect("ProduroController");
	}
	
	private void updateProduto(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String descricaoBack = request.getParameter("descricao");
		String volumeBack = request.getParameter("volume");
		Double volume = Double.parseDouble(volumeBack);
		String pesoBack = request.getParameter("peso");
		Double peso = Double.parseDouble(pesoBack);
		String situacaoBack = request.getParameter("situacao");
		String precoBack = request.getParameter("preco");
		Double preco = Double.parseDouble(precoBack);
		String estoqueBack = request.getParameter("estoque");
		Integer estoque = Integer.parseInt(estoqueBack);
		String prdtDestaqueBack = request.getParameter("prdtDestaque");
		Integer destaque = Integer.parseInt(prdtDestaqueBack);
		
		if (descricaoBack != null && volumeBack != null && pesoBack != null && situacaoBack  != null && precoBack  != null && estoqueBack  != null && prdtDestaqueBack  != null ) {
			if (!descricaoBack.equals("") && !volumeBack.equals("") && !pesoBack.equals("") && !situacaoBack.equals("") && !precoBack.equals("") && !estoqueBack.equals("") && !prdtDestaqueBack.equals("")){
				
				Produto produto = new Produto(descricaoBack, volume, peso, situacaoBack, preco, estoque, destaque);
				this.prd.updateProduto(produto);
			}
		}
		response.sendRedirect("ProdutoController");
	}
}
