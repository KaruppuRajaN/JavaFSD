package com.tcs.servletdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieServlet
 */
@WebServlet("/counter")
public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int count=1;
		Cookie cds[]=request.getCookies();
		PrintWriter out=response.getWriter();
		if(cds==null) {
			Cookie cd = new Cookie("visits",String.valueOf(1));
			response.addCookie(cd);
		}
		else {
			for(Cookie c:cds) {
				out.println(c.getName()+" - "+c.getValue());
				if(c.getName().equals("visits")) {
					count=Integer.parseInt(c.getValue());
				out.println(count);
				}
			}
			count=count+1;
			Cookie cd = new Cookie("visits",String.valueOf(count));
			response.addCookie(cd);
		}
		
		
		

		
		out.println("Visited Times "+count);
		
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
