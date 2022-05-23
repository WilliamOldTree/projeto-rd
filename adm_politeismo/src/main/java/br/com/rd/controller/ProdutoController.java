package br.com.rd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.rd.dao.CategoriaDao;
import br.com.rd.dao.DepartamentoDao;
import br.com.rd.dao.FornecedorDao;
import br.com.rd.dao.ProdutoDao;
import br.com.rd.model.Produto;

/**
 * Servlet implementation class ProdutoController
 */
@WebServlet("/ProdutoController")
public class ProdutoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    ProdutoDao prod;
    CategoriaDao categoria;
    DepartamentoDao departamento;
    FornecedorDao fornecedor;
    

    
	public ProdutoController() { 
        this.prod = new ProdutoDao();
        this.categoria = new CategoriaDao();
        this.departamento = new DepartamentoDao();
        this.fornecedor = new FornecedorDao();
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
			case ("sair"):
				Sair(request, response);
			break;
			default:
				selectAllProdutos(request, response);
		}
	}
	
	private void Sair(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		   response.sendRedirect("deslogar.jsp");
	}
	

	private void showInsertProduto(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setAttribute("listCategoria", this.categoria.selectAll());
		request.setAttribute("listDepartamento", this.departamento.selectAll());
		request.setAttribute("listFornecedor", this.fornecedor.selectAll());

		request.getRequestDispatcher("formProduto.jsp").forward(request, response);
	}
	
	private void showUpdateProduto(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setAttribute("listCategoria", this.categoria.selectAll());
		request.setAttribute("listDepartamento", this.departamento.selectAll());
		request.setAttribute("listFornecedor", this.fornecedor.selectAll());
		Integer id = Integer.parseInt(request.getParameter("id"));
		Produto p = this.prod.selectById(id);
		request.setAttribute("produto", p);
		request.getRequestDispatcher("formProduto.jsp").forward(request, response);
	}
	
	private void insertProduto(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String nomeBack = request.getParameter("nome");
		String descricaoBack = request.getParameter("descricao");
		String urlProdutoBack = request.getParameter("urlProduto");
		String volumeBack = request.getParameter("volume");
		String estoqueBack = request.getParameter("quantidade");
		String pesoBack = request.getParameter("peso");
		String precoBack = request.getParameter("preco");
		String categoriaBack = request.getParameter("categoria");
		String destaqueBack = request.getParameter("desconto");
		String departamentoBack = request.getParameter("departamento");
		String fornecedorBack = request.getParameter("fornecedor");
		
		if ((nomeBack != null) && (descricaoBack != null) && (urlProdutoBack != null) && (volumeBack != null) && (estoqueBack != null) 
				&& (pesoBack != null)  && (precoBack != null) && (categoriaBack != null) && (departamentoBack != null) && (fornecedorBack != null) && (destaqueBack != null)){
			if (!nomeBack.equals("")){
			
				Integer estoqueBack1 = Integer.parseInt(estoqueBack);
				Double precoBack1 = Double.parseDouble(precoBack);
				Double pesoBack1 = Double.parseDouble(pesoBack);
				Double volumeBack1 = Double.parseDouble(volumeBack);
				Integer categoriaBack1 = Integer.parseInt(categoriaBack);
				Double destaqueBack1 = Double.parseDouble(destaqueBack);
				Integer departamentoBack1 = Integer.parseInt(departamentoBack);
				Integer fornecedorBack1 = Integer.parseInt(fornecedorBack);

				Produto prod1 = new Produto(nomeBack, descricaoBack, urlProdutoBack, volumeBack1,pesoBack1 , precoBack1, estoqueBack1, departamentoBack1, categoriaBack1, fornecedorBack1, destaqueBack1);
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
			this.prod.exclusionProduto(id);
		}
		response.sendRedirect("ProdutoController");
	}
	
	private void updateProduto(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeBack = request.getParameter("nome");
		String descricaoBack = request.getParameter("descricao");
		String urlProdutoBack = request.getParameter("urlProduto");
		String volumeBack = request.getParameter("volume");
		String estoqueBack = request.getParameter("quantidade");
		String pesoBack = request.getParameter("peso");
		String precoBack = request.getParameter("preco");
		String categoriaBack = request.getParameter("categoria");
		String destaqueBack = request.getParameter("desconto");
		String departamentoBack = request.getParameter("departamento");
		String fornecedorBack = request.getParameter("fornecedor");
		String idBack = request.getParameter("id");
		if ((nomeBack != null) && (descricaoBack != null) && (urlProdutoBack != null) && (volumeBack != null) && (estoqueBack != null) 
				&& (pesoBack != null)  && (precoBack != null) && (categoriaBack != null) && (departamentoBack != null) && (fornecedorBack != null) && (destaqueBack != null)){
			if (!nomeBack.equals("")){
				
				Integer id = Integer.parseInt(idBack);

				Integer estoqueBack1 = Integer.parseInt(estoqueBack);
				Double precoBack1 = Double.parseDouble(precoBack);
				Double pesoBack1 = Double.parseDouble(pesoBack);
				Double volumeBack1 = Double.parseDouble(volumeBack);
				Integer categoriaBack1 = Integer.parseInt(categoriaBack);
				Integer departamentoBack1 = Integer.parseInt(departamentoBack);
				Integer fornecedorBack1 = Integer.parseInt(fornecedorBack);
				Double destaqueBack1 = Double.parseDouble(destaqueBack);

				Produto prod1 = new Produto(nomeBack, descricaoBack, urlProdutoBack, volumeBack1,pesoBack1 , precoBack1, estoqueBack1, departamentoBack1, categoriaBack1, fornecedorBack1, destaqueBack1);
				prod1.setId(id);
				this.prod.updateProduto(prod1);
			}
		}
		
		response.sendRedirect("ProdutoController");
	}
}