package br.com.rd.controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.rd.dao.LoginDao;
import br.com.rd.model.UserADM;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    LoginDao dao = new LoginDao();
    UserADM u = new UserADM();
    int r;
    
    public LoginController() {
        super();
//       this.dao = new LoginDao();
//       this.u = new UserADM();
    }
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LoginDao loginDao = new LoginDao();
		
		String username = request.getParameter("email");
		String password = request.getParameter("senha");
		String name = request.getParameter("nome");


		UserADM loginBean = new UserADM();
		loginBean.setEmail(username);
		loginBean.setSenha(password);
		loginBean.setNome(name);
		if (loginDao.validate(loginBean)){
			response.sendRedirect("HomeController");
			if(loginBean != null) {
				HttpSession session = request.getSession(true);
				session.setAttribute("email", username);
			}
		}else {
			String message="Email ou Senha inválidos";
			request.setAttribute("message", message);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	}
}	