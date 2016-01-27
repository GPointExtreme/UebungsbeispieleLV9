package org.campus02.konto;

public class SparKonto extends Konto{

	public SparKonto(String inhaber) {
		super(inhaber);
	}
	
	public void einzahlen(double wert) {
		super.einzahlen(wert);
	}
	
	public void auszahlen(double wert) {
		if(kontostand-wert > 0) {
			System.out.println("Konto kann nicht überzogen werden");
		}
		else {
			super.auszahlen(wert);
		}
	}
}
