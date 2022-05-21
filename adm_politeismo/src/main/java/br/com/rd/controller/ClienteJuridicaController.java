//
//package br.com.rd.controller;
//
//import java.io.IOException;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import br.com.rd.dao.ClienteJuridicaDao;
//
//
//@WebServlet("/ClienteJuridicaController")
//public class ClienteJuridicaController extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//    
//	ClienteJuridicaDao juridicaDao;
//    
//    public ClienteJuridicaController() {
//        super();
//        
//        this.juridicaDao = new ClienteJuridicaDao();
//       
//    }
//
//	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		selectAllClienteJuridica(request, response);
//	}
//
//	
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		String option = request.getParameter("option");
//		if (option == null) {
//			option = "Entrou";
//		}
//		switch(option) {
//
//			case ("sair"):
//			     Sair(request, response);
//			break;
//			default:
//				selectAllClienteJuridica(request, response);
//		}
//	}
//	
//	private void Sair(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
//		   response.sendRedirect("deslogar.jsp");
//	}
//	
//	private void selectAllClienteJuridica(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
//		request.setAttribute("listaClienteJuridica", this.juridicaDao.selectAll());
//		request.getRequestDispatcher("listClienteJuridico.jsp").forward(request, response);
//	}
//
//}

