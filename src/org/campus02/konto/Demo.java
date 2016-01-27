package org.campus02.konto;

import java.util.ArrayList;
import java.util.HashMap;

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
		
		Konto k1 = new Konto("Dominik");
		GiroKonto k2 = new GiroKonto("Dominik", 1000);
		JugendGiroKonto k3 = new JugendGiroKonto("Dominik", 1000, 100);
		
		ArrayList<Konto> list = new ArrayList<>();
		list.add(k1);
		list.add(k2);
		list.add(k3);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for (Konto konto : list) {
			if(!map.containsKey(konto.inhaber)) {
				map.put(konto.inhaber, 1);
			}
			else {
				int value = map.get(konto.inhaber);
				map.put(konto.inhaber, value + 1);
			}
		}	
	}
}
