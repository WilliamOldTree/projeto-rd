package br.com.rd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
<<<<<<< HEAD
import javax.servlet.ServletRequest;
=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
<<<<<<< HEAD

import br.com.rd.dao.PedidosDao;
import br.com.rd.model.Pedidos;

=======
import br.com.rd.dao.PedidosDao;
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750

@WebServlet("/PedidosController")
public class PedidosController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   PedidosDao pedidoDao;
   
    public PedidosController() {
        super();
        this.pedidoDao = new PedidosDao();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
<<<<<<< HEAD
		showPedidos(request, response);
		showDetalhesPedidos(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
	
	private void showPedidos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("listaPedidos", this.pedidoDao.selectSimple());
		request.getRequestDispatcher("listPedidos.jsp").forward(request, response);
	}
	
	private void showDetalhesPedidos (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("listaDetalhes", this.pedidoDao.selectAll());
		request.getRequestDispatcher("listaDetalhes.jsp").forward(request, response);
		
	}
=======
		doPost(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request.setAttribute("listaPedidos", this.pedidoDao.selectSimple());
		request.setAttribute("listaDetalhes", this.pedidoDao.selectAll());
		request.getRequestDispatcher("listPedidos.jsp").forward(request, response);
	}
	
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750

}// end Servlet
