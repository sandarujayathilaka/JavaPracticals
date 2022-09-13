

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/logservlet")
public class logservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String uname = request.getParameter("name");
		String pword = request.getParameter("pword");
		
		if(uname.equals("sandaru") && pword.equals("1234")) {
			
		  RequestDispatcher rd = request.getRequestDispatcher("welcomejsp.jsp");
		  rd.forward(request, response);
			
		}
		
		else{
			
			response.sendRedirect("logjs.jsp");
			
		}
		
	}

}
