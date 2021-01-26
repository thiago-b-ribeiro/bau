package model;

public class Temperatura {

	private String tipoTemperatura;
	private double valorTemperatura;
	
	public ClasseRetorno classeRetorno = new ClasseRetorno(0, null);
	
	public ClasseRetorno converteTemperatura(String tipoTemperatura, double valorTemperatura) {
		if (tipoTemperatura.equals("Celsius")) {
			classeRetorno.setValorConvertido(((valorTemperatura*9)/5)+32);
			classeRetorno.setTipoTemperaturaOriginal("Fahrenheit");
			} else {
				classeRetorno.setValorConvertido(((valorTemperatura-32)*5)/9);
				classeRetorno.setTipoTemperaturaOriginal("Celsius");
			}
		return classeRetorno;
	}	
}
