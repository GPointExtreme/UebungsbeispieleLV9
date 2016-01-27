package org.campus02.rekursion;

import java.util.ArrayList;

public class Ort {
	
	private String name;
	private ArrayList<Ort> verbundeneOrte = new ArrayList<>();
	
	public Ort(String name) {
		super();
		this.name = name;
	}

	public ArrayList<Ort> getNachbarn() {
		return verbundeneOrte;
	}
	
	public void addNachbarn(Ort ort) {
		verbundeneOrte.add(ort);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
