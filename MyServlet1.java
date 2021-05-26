package com.codeupcodeup.com;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet1
 */
@WebServlet("/MyServlet1")
public class MyServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MyServlet1() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
throws ServletException, IOException {
		// TODO Auto-generated method stub
		String yourName = request.getParameter("yourName");
		
		List<Person> persons = new ArrayList<>();
		
		Person person = new Person();
		person.setName(yourName);
		person.setAge("17");
		
		request.setAttribute("person", persons);
		
		
		persons.add(person);
		
		person=new Person();
		person.setName("Willy");
		person.setAge("20");
		
		persons.add(person);
				
	
		request.setAttribute("persons", persons);
		
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("Home.jsp");
				dispatcher.forward(request, response);
				
	
	}

}
