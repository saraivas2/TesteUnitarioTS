package br.ufrpe.testesoftware;

public class IMCCalculo {

	public String getMagreza() {
		return "Magreza";
	}
	public String getNormal() {
		return "Normal";
	}
	public String getSobrepeso() {
		return "Sobrepeso";
	}
	public String getObesidade() {
		return "Obesidade";
	}
	public String getObesidadeGrave() {
		return "Obesidade Grave";
	}
	public float TesteImc(float altura,float peso) {
		return peso/(altura*altura);
	}
	public String Resultado(float imc) {
		String resposta = "";
		
		if (imc <18.5) {
			resposta=getMagreza();
		}
		if (imc >=18.5 & imc <24.9) {
			resposta=getNormal();
		}
		if (imc >=25.0 & imc <29.9) {
			resposta=getSobrepeso();
		}
		if (imc >=30.0 & imc <39.9) {
			resposta=getObesidade();
		}
		if (imc >40.0) {
			resposta=getObesidadeGrave();
		}
		return resposta;
	}
}
