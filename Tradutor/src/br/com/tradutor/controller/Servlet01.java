package br.com.tradutor.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.tradutor.model.Traduzir;

@WebServlet("/Servlet01")
public class Servlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	

    public Servlet01() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String palavraPortugues = request.getParameter("palavraPortugues");
		Traduzir traduzir = new Traduzir();
		
		request.setAttribute("resultado", traduzir.lerCSV(palavraPortugues));
		
		request.getRequestDispatcher("jsp/resultado.jsp").forward(request, response);
	}

}
