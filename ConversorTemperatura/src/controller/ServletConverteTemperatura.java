package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ClasseRetorno;
import model.Temperatura;

@WebServlet(urlPatterns="/servletConverteTemperatura")
public class ServletConverteTemperatura extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletConverteTemperatura() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Temperatura temperatura = new Temperatura();
		ClasseRetorno classeRetorno = new ClasseRetorno(0, null);
		
		double valorTemperatura = Double.parseDouble(request.getParameter("valorTemperatura"));
		String tipoTemperatura = request.getParameter("tipoTemperatura");
		
		classeRetorno = temperatura.converteTemperatura(tipoTemperatura, valorTemperatura);
		
		PrintWriter saida = response.getWriter();		
		saida.println("<div>" +
		              "<h1>RESULTADO DA CONVERSÃO DA TEMPERATURA</h1>" + 
		              "<hr>" + 
		              "<br>" +
		              "<p id='resultado'>" +
				      "A temperatura de " + 
		              valorTemperatura + 
		              "° " +
		              classeRetorno.getTipoTemperaturaOriginal() +
				      " convertida para " + 
		              tipoTemperatura + 
		              " é de " +
		              classeRetorno.getValorConvertido() + 
		              "°." +
		              "</p>" +
		              "</div>");
	}
	

}
