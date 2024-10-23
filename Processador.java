package informatica;

import Composição.Coracao;

public class Processador {
	
	private String marca;
	private String frequencia;
	
	
	public Processador (String marca,String frequencia) {
		this.marca = marca;
		this.frequencia = new frequencia (frequencia);
	}
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getFrequencia() {
		return frequencia;
	}
	public void setFrequencia(String frequencia) {
		this.frequencia = frequencia;
	}

public int getProcessador() {
	return coracao.getBatimento();
}
}

