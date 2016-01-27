package org.campus02.rekursion;

public class OrtDemo {

	public static void main(String[] args) {
		
		Ort graz = new Ort("graz");
		Ort wien = new Ort("wien");
		Ort marburg = new Ort("marburg");
		Ort linz = new Ort("linz");
		
		graz.addNachbarn(wien);
		graz.addNachbarn(marburg);
		
		wien.addNachbarn(linz);
		
		linz.addNachbarn(graz);
		
		System.out.println(hasCircle(graz, graz));

	}
	
	public static boolean hasCircle(Ort o, Ort start) {
		for (Ort ort : o.getNachbarn()) {
			if (ort == start) 
				return true;
			
			boolean b = hasCircle(ort, start);
			if (b == true) 
				return true;
		}
		return false;
	}
}
