package org.campus02.konto;

public class Demo {

	public static void main(String[] args) {
		
		Konto emp1 = new Konto("emp1");
		emp1.einzahlen(100);
		emp1.auszahlen(150);
		System.out.println("emp1 " + emp1.kontostand);
		
		GiroKonto emp2 = new GiroKonto("emp2", 100);
		emp2.einzahlen(100);
		emp2.auszahlen(200);
		System.out.println("emp2 " + emp2.kontostand);
		
		JugendGiroKonto emp3 = new JugendGiroKonto("Stefan", 200, 100);
		emp3.einzahlen(200);
		emp3.auszahlen(100);
		System.out.println("emp3 " + emp3.kontostand);
		
		SparKonto emp4 = new SparKonto("emp4");
		emp4.einzahlen(200);
		emp4.auszahlen(200);
		System.out.println("emp4 " + emp4.kontostand);
		
		Konto emp5 = emp3;
		
		emp5 = (GiroKonto) emp3;
		emp5.einzahlen(100);
		emp5.auszahlen(150);
		System.out.println(emp5.kontostand);
		
	}

}
