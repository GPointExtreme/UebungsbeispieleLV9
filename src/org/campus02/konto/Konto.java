package org.campus02.konto;

public class Konto {
	
	protected String inhaber;
	protected double kontostand;
	
	public Konto(String inhaber) {
		super();
		this.inhaber = inhaber;
		kontostand = 0;
	}
	
	public void einzahlen(double wert) {
		kontostand += wert;
	}
	
	public void auszahlen(double wert) {
		kontostand -= wert;
	}

}
