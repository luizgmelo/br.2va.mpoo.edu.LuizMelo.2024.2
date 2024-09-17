package model;

public class Telefone {
	private int ddd;
	private int ddi;
	private String numero;
	private boolean isZap;
	
	public Telefone(int ddd, int ddi, String numero, boolean isZap) {
		this.ddd = ddd;
		this.ddi = ddi;
		this.numero = numero;
		this.isZap = isZap;
	}
}
