package model;

public class OperacoesAritimeticas {

	public int[] Calcular(int n1, int n2) {
		int[] resultado = new int[4];
				resultado[0] = n1 + n2;
				resultado[1] = n1 - n2;
				resultado[2] = n1 * n2;
				resultado[3] = n1 / n2;
		return resultado;
	}

}
