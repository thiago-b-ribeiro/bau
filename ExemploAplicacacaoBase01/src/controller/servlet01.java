package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO;
import model.OperacoesAritimeticas;

@WebServlet(urlPatterns = {"/calculo"})
public class servlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	DAO dao = new DAO();
	OperacoesAritimeticas equacao = new OperacoesAritimeticas();
	
    public servlet01() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();
		if (action.equals("/calculo")) {
			calculo(request, response);
		} else if (action.equals("/inserir")) {
			calculo(request, response);
		}

	}

	protected void calculo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		int n1 = Integer.parseInt(request.getParameter("n1"));
		int n2 = Integer.parseInt(request.getParameter("n2"));
		int tipoOperacao = Integer.parseInt(request.getParameter("tipoOperacao"));

		OperacoesAritimeticas resultado = new OperacoesAritimeticas().Calcular(tipoOperacao, n1, n2);
		
		request.setAttribute("resultado", resultado);
		
		dao.inserirEquacao(resultado);
		
		request.getRequestDispatcher("jsp/resultado.jsp").forward(request, response);		
	}

}
