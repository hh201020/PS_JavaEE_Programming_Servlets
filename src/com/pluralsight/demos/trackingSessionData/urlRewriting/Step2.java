package com.pluralsight.demos.trackingSessionData.urlRewriting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Step2
 */
@WebServlet("/Step2r")
public class Step2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Step2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String guestName = request.getParameter("guestName");
		String email = request.getParameter("email");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Greetings </title>");
		out.println("</head>");
		out.println("<body>");
		String queryString = "guestName=" + guestName + "&email=" + email;
		out.println("<a href='Previewr?" + queryString + "'>Preview Data </a> &nbsp;"
				+ "<a href='SaveDatar?" + queryString + "'>Save Data </a>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
