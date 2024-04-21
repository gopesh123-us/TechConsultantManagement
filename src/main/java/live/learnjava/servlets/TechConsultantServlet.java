package live.learnjava.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import live.learnjava.dao.TechConsultantDAO;
import live.learnjava.model.TechConsultant;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class TechConsultantServlet
 */
public class TechConsultantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TechConsultantServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			int eid = Integer.parseInt(request.getParameter("eid"));
			TechConsultantDAO dao = new TechConsultantDAO();
			TechConsultant tc = dao.getTechConsultant(eid);
			RequestDispatcher rd = request.getRequestDispatcher("displayTechConsultant.jsp");
			request.setAttribute("techConsultant", tc);
			rd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
