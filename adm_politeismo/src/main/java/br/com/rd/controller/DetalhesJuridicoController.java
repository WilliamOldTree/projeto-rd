//package br.com.rd.controller;
//
//import java.io.IOException;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import br.com.rd.dao.DetalhesJuridicoDao;
//import br.com.rd.model.DetalhesJuridico;
//
//
//
//@WebServlet("/DetalhesJuridicoController")
//
//public class DetalhesJuridicoController extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//       
//    private DetalhesJuridicoDao dtJurDao;
//    
//    public DetalhesJuridicoController() {
//        super();
//        this.dtJurDao = new DetalhesJuridicoDao();
//    }
//
//	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		showDetalhesJuridico(request, response);
//	}
//
//	
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//	
//	}
//	
//	private void showDetalhesJuridico(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
//		Integer id = Integer.parseInt(request.getParameter("id"));
//		DetalhesJuridico dj = this.dtJurDao.showDetalhes(id);
//		request.setAttribute("detalhesJuridico", dj);
////		request.getRequestDispatcher("formCategoria.jsp").forward(request, response); precisa setar a pagina jsp
//		 
//		 
//	}
//
//}// end servlet
