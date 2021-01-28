package model;

public class OperacoesAritimeticas {

	private int n1;
	private int n2;
	private int operador;
	private int resultado;

	public OperacoesAritimeticas() {
		
	}

	public int Calcular(int n1, int n2, int operador) {
		switch (operador) {
			case 1:
				resultado = n1 + n2;
				break;
			case 2:
				resultado = n1 - n2;
				break;
			case 3:
				resultado = n1 * n2;
				break;
			case 4:
				resultado = n1 / n2;
				break;
		}
		return resultado;
	}

}
