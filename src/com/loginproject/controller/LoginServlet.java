package com.loginproject.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public LoginServlet() {
        super();

    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//le decimos al objeto response que voy a generar una pagina HTML
		response.setContentType("text/html");
		
		//creamos el objeto printWriter para generar una salida
		PrintWriter salida = response.getWriter();
		request.getRequestDispatcher("links.jsp").include(request,response);
		
		//nos traemos el contenido de los textboxes
		
		String usuario = request.getParameter("txtUsername");
		String password = request.getParameter("txtPassword");
		
		if(password.equals("tacos"))
		{
			salida.println("Bienvenido "+usuario);
			HttpSession objSesion = request.getSession();
			objSesion.setAttribute(" usuario ",usuario);
		}
		else
		{
			salida.print("Lo siento hay tabla");
			request.getRequestDispatcher("login.jsp").include(request, response);
		}
		salida.close();
		
		}
	}


