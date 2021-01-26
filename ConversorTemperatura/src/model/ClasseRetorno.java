package model;

public class ClasseRetorno {

	private double valorConvertido;
	private String tipoTemperaturaOriginal;
	
	public ClasseRetorno(double valorConvertido, String tipoTemperaturaOriginal) {
		this.valorConvertido = valorConvertido;
		this.tipoTemperaturaOriginal = tipoTemperaturaOriginal;
	}

	public double getValorConvertido() {
		return valorConvertido;
	}

	public void setValorConvertido(double valorConvertido) {
		this.valorConvertido = valorConvertido;
	}

	public String getTipoTemperaturaOriginal() {
		return tipoTemperaturaOriginal;
	}

	public void setTipoTemperaturaOriginal(String tipoTemperaturaOriginal) {
		this.tipoTemperaturaOriginal = tipoTemperaturaOriginal;
	}
	
	
	
}
