//
//package br.com.rd.controller;
//import java.io.IOException;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import br.com.rd.dao.ClienteFisicaDao;
//
//
//@WebServlet("/ClienteFisicaController")
//public class ClienteFisicaController extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//       
//   ClienteFisicaDao fisicaDao;
//   
//    public ClienteFisicaController() {
//        super();
//        this.fisicaDao = new ClienteFisicaDao();
//    }
//
//	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//				selectAllClienteFisica(request, response);
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
//				selectAllClienteFisica(request, response);
//		}
//	}
//	
//	private void Sair(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
//		   response.sendRedirect("deslogar.jsp");
//	}
//	
//	private void selectAllClienteFisica(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
//		request.setAttribute("listaClienteFisica", this.fisicaDao.selectAll());
//		request.getRequestDispatcher("listClienteFisico.jsp").forward(request, response);
//	}
//	
//	
//}
//	
////end class

