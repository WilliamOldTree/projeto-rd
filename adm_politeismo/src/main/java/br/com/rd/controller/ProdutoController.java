//package br.com.rd.controller;
//
//import java.io.IOException;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import br.com.rd.dao.ProdutoDao;
//import br.com.rd.model.Produto;
//
<<<<<<< HEAD
//
=======
>>>>>>> 647b63eda594e92c6bc4d3079b1c4fb2f17e1d3b
///**
// * Servlet implementation class ProdutoController
// */
//@WebServlet("/ProdutoController")
//public class ProdutoController extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//    ProdutoDao prod;
//    
//    
//	public ProdutoController() {
//    	super();
// 
//        this.prod = new ProdutoDao();
//    }
//
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		
//		doPost(request, response);
//	}
//
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		String option = request.getParameter("option");
//		if (option == null) {
//			option = "Entrou";
//		}
//		switch(option) {
//			case ("insertForm"):
//				showInsertProduto(request, response);
//			break;
//			case ("updateForm"):
//				showUpdateProduto(request, response);
//			break;
//			case ("update"):
//				updateProduto(request, response);
//			break;
//			case ("delete"):
//				deleteProduto(request, response);
//			break;
//			case ("insert"):
//				insertProduto(request, response);
//			break;
//			case ("sair"):
//				Sair(request, response);
//			break;
//			default:
//				selectAllProdutos(request, response);
//		}
//	}
//	
//	private void Sair(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
//		   response.sendRedirect("deslogar.jsp");
//	}
//	
//
//	private void showInsertProduto(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
//		request.getRequestDispatcher("formProduto.jsp").forward(request, response);
//	}
//	
//	private void showUpdateProduto(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
//		Integer id = Integer.parseInt(request.getParameter("id"));
//		Produto p = this.prod.selectById(id);
//		request.setAttribute("produto", p);
//		request.getRequestDispatcher("formProduto.jsp").forward(request, response);
//	}
//	
//	private void insertProduto(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
<<<<<<< HEAD
//		String descricaoBack = request.getParameter("descricao");
//		String volumeBack = request.getParameter("volume");
//		String pesoBack = request.getParameter("peso");
//		String precoBack = request.getParameter("preco");
//		String quantidadeBack = request.getParameter("quantidade");
//		String descontoBack = request.getParameter("desconto");
//		if ((descricaoBack != null) && (volumeBack != null) && (pesoBack != null) && (precoBack != null) && (quantidadeBack != null)  && (descontoBack != null) ){
//			if (!descricaoBack.equals("")){
//				
//			     Double volume2 = Double.parseDouble(volumeBack.replace(",", "."));
//			     Double preco2 = Double.parseDouble(precoBack.replace(",", "."));
//			     Double peso2 = Double.parseDouble(pesoBack.replace(",", "."));
//
//				Integer quantidadeBack1 = Integer.parseInt(quantidadeBack);
//				Double descontoBack1 = Double.parseDouble(descontoBack);
//				
//				Produto prod1 = new Produto(descricaoBack, volume2, peso2, preco2, quantidadeBack1, descontoBack1);
=======
//		String nomeBack = request.getParameter("nome");
//		String estoqueBack = request.getParameter("estoque");
//		String precoBack = request.getParameter("preco");
//		String categoriaBack = request.getParameter("categoria");
//		String departamentoBack = request.getParameter("departamento");
//		String fornecedorBack = request.getParameter("fornecedor");
//		if ((nomeBack != null) && (estoqueBack != null) && (precoBack != null) && (categoriaBack != null) && (departamentoBack != null)  && (fornecedorBack != null) ){
//			if (!nomeBack.equals("")){
//			
//				Integer estoqueBack1 = Integer.parseInt(estoqueBack);
//				Double precoBack1 = Double.parseDouble(precoBack);
//				Integer categoriaBack1 = Integer.parseInt(categoriaBack);
//				Integer departamentoBack1 = Integer.parseInt(departamentoBack);
//				Integer fornecedorBack1 = Integer.parseInt(fornecedorBack);
//
//				Produto prod1 = new Produto(nomeBack, estoqueBack1, precoBack1, categoriaBack1, departamentoBack1, fornecedorBack1);
>>>>>>> 647b63eda594e92c6bc4d3079b1c4fb2f17e1d3b
//				this.prod.insert(prod1);
//			}
//		}
//		response.sendRedirect("ProdutoController");
//	}
//	
//	private void selectAllProdutos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
//		request.setAttribute("listaProduto", this.prod.selectAll());
//		request.getRequestDispatcher("listProduto.jsp").forward(request, response);
//	}
//	
//
//	private void deleteProduto(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String idBack = request.getParameter("id");
//		if (idBack != null) {
//			Integer id = Integer.parseInt(idBack);
//			this.prod.exclusionProduto(id);
//		}
//		response.sendRedirect("ProdutoController");
//	}
//	
//	private void updateProduto(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
<<<<<<< HEAD
//		String descricaoBack = request.getParameter("descricao");
//		String volumeBack = request.getParameter("volume");
//		String pesoBack = request.getParameter("peso");
//		String precoBack = request.getParameter("preco");
//		String quantidadeBack = request.getParameter("quantidade");
//		String descontoBack = request.getParameter("desconto");
//
//		String idBack = request.getParameter("id");
//		if ((descricaoBack != null) && (volumeBack != null) && (pesoBack != null) && (quantidadeBack != null) && (precoBack != null) && (descontoBack != null)) {
//			if (!descricaoBack.equals("")){
//	             
//				
//				Double volume2 = Double.parseDouble(volumeBack.replace(",", "."));
//			     Double preco2 = Double.parseDouble(precoBack.replace(",", "."));
//			     Double peso2 = Double.parseDouble(pesoBack.replace(",", "."));
//			     
//				
//				Integer quantidadeBack1 = Integer.parseInt(quantidadeBack);
//				Double descontoBack1 = Double.parseDouble(descontoBack);
//
//				Integer id = Integer.parseInt(idBack);
//				Produto prod1 = new Produto(descricaoBack, volume2, peso2, preco2, quantidadeBack1, descontoBack1);
=======
//		String nomeBack = request.getParameter("nome");
//		String estoqueBack = request.getParameter("estoque");
//		String precoBack = request.getParameter("preco");
//		String categoriaBack = request.getParameter("categoria");
//		String departamentoBack = request.getParameter("departamento");
//		String fornecedorBack = request.getParameter("fornecedor");
//
//		String idBack = request.getParameter("id");
//		if ((nomeBack != null) && (estoqueBack != null) && (precoBack != null) && (categoriaBack != null) && (departamentoBack != null)  && (fornecedorBack != null) ){
//			if (!nomeBack.equals("")){
//	
//				Integer estoqueBack1 = Integer.parseInt(estoqueBack);
//				Double precoBack1 = Double.parseDouble(precoBack);
//				Integer categoriaBack1 = Integer.parseInt(categoriaBack);
//				Integer departamentoBack1 = Integer.parseInt(departamentoBack);
//				Integer fornecedorBack1 = Integer.parseInt(fornecedorBack);
//
//				Integer id = Integer.parseInt(idBack);
//				Produto prod1 = new Produto(nomeBack, estoqueBack1, precoBack1, categoriaBack1, departamentoBack1, fornecedorBack1);
>>>>>>> 647b63eda594e92c6bc4d3079b1c4fb2f17e1d3b
//				prod1.setId(id);
//				this.prod.updateProduto(prod1);
//			}
//		}
//		response.sendRedirect("ProdutoController");
//	}
//}