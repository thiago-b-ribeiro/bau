package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.OperacoesAritimeticas;

@WebServlet("/servlet01")
public class servlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public servlet01() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int n1 = Integer.parseInt(request.getParameter("n1"));
		int n2 = Integer.parseInt(request.getParameter("n2"));
		int[] resultado;

		OperacoesAritimeticas equacao = new OperacoesAritimeticas();
		
		resultado = equacao.Calcular(n1, n2);
		
		request.setAttribute("resultado", resultado);
		request.getRequestDispatcher("jsp/resultado.jsp").forward(request, response);
		
		
	}

}
