package org.campus02.konto;

public class JugendGiroKonto extends GiroKonto {
	
	protected double buchungslimit;

	public JugendGiroKonto(String inhaber, double limit, double buchungslimit) {
		super(inhaber, limit);
		this.buchungslimit = buchungslimit;
	}
	
	public void einzahlen(double wert) {
		super.einzahlen(wert);
	}
	
	public void auszahlen(double wert) {
		if(buchungslimit < wert) {
			System.out.println("Buchungslimit überschritten");
		}
		else {
		super.auszahlen(wert);
		}
	}
}
