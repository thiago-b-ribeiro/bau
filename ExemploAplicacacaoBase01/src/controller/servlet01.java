package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO;
import model.OperacoesAritimeticas;

@WebServlet(urlPatterns = {"/calcular", "/inserir", "/consultar"})
public class servlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	DAO dao = new DAO();
	OperacoesAritimeticas resultado = new OperacoesAritimeticas();
	
    public servlet01() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();
		if (action.equals("/calcular")) {
			calcular(request, response);
		} else if (action.equals("/inserir")) {
			inserir(request, response);
		} else if (action.equals("/consultar")) {
			consultar(request, response);
		}

	}

	protected void calcular(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int n1 = Integer.parseInt(request.getParameter("n1"));
		int n2 = Integer.parseInt(request.getParameter("n2"));
		int tipoOperacao = Integer.parseInt(request.getParameter("tipoOperacao"));

		resultado = resultado.Calcular(tipoOperacao, n1, n2);
		
		request.setAttribute("resultado", resultado);

		
		request.getRequestDispatcher("jsp/resultado.jsp").forward(request, response);		
	}
	
	protected void inserir (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(resultado != null) {
			dao.inserirEquacao(resultado);
			request.setAttribute("msgResultado", "Gravação realizada com sucesso.");
		} else {
			request.setAttribute("msgResultado", "Falha na gravação. Realize o cálculo antes de gravar.");
		}
		
		request.getRequestDispatcher("jsp/resultado.jsp").forward(request, response);
	}
	
	protected void consultar (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		OperacoesAritimeticas[] arrayEquacoes = new DAO().resgatarEquacao();
		request.setAttribute("arrayEquacoes", arrayEquacoes);
		
		request.getRequestDispatcher("jsp/resultado.jsp").forward(request, response);
	}

}
