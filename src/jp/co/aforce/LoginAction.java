package jp.co.aforce;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.aforce.bean.User;
import jp.co.aforce.dao.UserDAO;

@WebServlet(urlPatterns= {"/LoginAction"})
public class LoginAction extends HttpServlet{
		public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
			
			request.setCharacterEncoding("UTF-8");
			response.setContentType("text/html; charset=UTF-8");
			
			
			
			try {
				HttpSession session=request.getSession();
				
				String id=request.getParameter("id");
				String pass=request.getParameter("pass");
				UserDAO dao=new UserDAO();
				User members=dao.search(id, pass);
				RequestDispatcher dispatcher;
				if(members!=null) {
					session.setAttribute("members", members);
					dispatcher = request.getRequestDispatcher("/jsp/index.jsp");
					dispatcher.forward(request, response);
				}
				request.setAttribute("message", "IDまたはパスワードが違います");
				dispatcher = request.getRequestDispatcher("/jsp/login.jsp");
				dispatcher.forward(request, response);
			}catch (Exception e){
				e.printStackTrace();
			}
			
			
		}
}
