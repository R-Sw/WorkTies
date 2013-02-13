package util;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class STraitement
 */
@WebServlet("/SAuthentif")
public class SAuthentif extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SAuthentif() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login=request.getParameter("pseudo");
		String psswd=request.getParameter("mdp");
		//PrintWriter out=response.getWriter();
		
		if(login.equals("toto") && psswd.equals("toto")){
			RequestDispatcher rd=request.getRequestDispatcher("/SChat");
			rd.forward(request, response);
		}else{	
			RequestDispatcher rd=request.getRequestDispatcher("/Sform");
			rd.forward(request, response);
		}
	}

}
