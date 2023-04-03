package edu.ucj.programacion.pec1.AlvaroHernanz;

public class Aula {
	private int numero;
	private int planta;
	private int asiento;
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getPlanta() {
		return planta;
	}
	public void setPlanta(int planta) {
		this.planta = planta;
	}
	public int getAsiento() {
		return asiento;
	}
	public void setAsiento(int asiento) {
		this.asiento = asiento;
	}
	public Aula(int numero, int planta, int asiento) {
		super();
		this.numero = numero;
		this.planta = planta;
		this.asiento = asiento;
	}

}
