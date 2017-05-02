package servlets;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ejb.CalculatriceLocal;

/**
 * Servlet implementation class CalculServlet
 */
@WebServlet("/CalculServlet")
public class CalculServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	private CalculatriceLocal calculatriceLocal;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int x = Integer.parseInt(request.getParameter("x"));
		int y = Integer.parseInt(request.getParameter("y"));
	
		int resultatadd =0;
		int resultatsous = 0;
		int resultatdiv = 0;
		int resultatmult = 0;
			resultatadd = calculatriceLocal.addition(x, y);
			request.setAttribute("resultatadd", resultatadd);
			resultatsous = calculatriceLocal.soustraction(x, y);
			resultatdiv = calculatriceLocal.division(x, y);
			resultatmult = calculatriceLocal.multiplication(x, y);
			request.setAttribute("resultatsous", resultatsous);
			request.setAttribute("resultatdiv", resultatdiv);
			request.setAttribute("resultatmult", resultatmult);
			request.getRequestDispatcher("index.jsp").forward(request, response);	
		}
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
