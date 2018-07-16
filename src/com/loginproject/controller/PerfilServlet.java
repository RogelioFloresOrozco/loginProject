package com.loginproject.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/PerfilServlet")
public class PerfilServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public PerfilServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter salida = response.getWriter();
	
	request.getRequestDispatcher("links.jsp").include(request,response);
	
	HttpSession objSesion = request.getSession();
	
	if(objSesion != null && objSesion.getAttribute("usuario") != null)
	{
		String usuario =(String) objSesion.getAttribute("usuario ");
		salida.println("hola "+usuario+" Bienvenido a tu perfil");
		
	}
	else
	{
		salida.println("Por favor logueate de primero");
		request.getRequestDispatcher("login.jsp").include(request,response);
	}
	}

}
