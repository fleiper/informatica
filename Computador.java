package informatica;

public class Computador {
	private String modelo;
	private Processador processo;
	
	public Computador(String modelo, Processador processo) {
		this.modelo = modelo;
		this.processo = processo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Processador getProcesso() {
		return processo;
	}

	public void setProcesso(Processador processo) {
		this.processo = processo;
	}
	
}
