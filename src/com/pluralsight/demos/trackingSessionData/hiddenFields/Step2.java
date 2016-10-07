package com.pluralsight.demos.trackingSessionData.hiddenFields;

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
@WebServlet("/Step2")
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
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Greetings </title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h3>Welcome " + guestName + "</h3>");
		out.println("<form name='frm' action='Preview' method='post'>");
		out.println("<input type='hidden' name='guestName' value='" + guestName +"'/>");  // Hidden field
		out.println("<p>Enter Email Id : </p>");
		out.println("<p><input type='email' name='email' /> </p>");
		out.println("<p><input type='submit' value='Preview' name='btnPreview' /> </p>");		
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
