package model;

public class OperacoesAritimeticas {
	
	private String tipoOperacao;
	private int resultado;
	private int n1;
	private int n2;
	
	public OperacoesAritimeticas() {
		super();
	}
	
	public OperacoesAritimeticas(String tipoOperacao, int resultado, int n1, int n2) {
		this.tipoOperacao = tipoOperacao;
		this.resultado = resultado;
		this.n1 = n1;
		this.n2 = n2;
	}
	
	
	
	
	
	

	public String getTipoOperacao() {
		return tipoOperacao;
	}

	public void setTipoOperacao(String tipoOperacao) {
		this.tipoOperacao = tipoOperacao;
	}

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}
	
	
	
	
	

	public OperacoesAritimeticas Calcular(int tipoOperacao, int n1, int n2) {
		String operacaoExtenso = null;
		int resultado = 0;
		
		switch (tipoOperacao) {
		case 1: operacaoExtenso="soma";
				resultado=n1+n2;
				break;
		case 2: operacaoExtenso="subtração";
				resultado=n1-n2;
				break;
		case 3: operacaoExtenso="multiplicação";
				resultado=n1*n2;
				break;
		case 4: operacaoExtenso="divisão";
				resultado=n1/n2;
				break;			
		}
		return new OperacoesAritimeticas(operacaoExtenso, resultado, n1, n2);
	}
}
