package main;

public enum Type {
	//INSTANCES
	Eau("Eau"),
	Feu("Feu"),
	Plante("Plante");
	
	//ATTRIBUTS
	private String type;
	
	//CONSTRUCTEUR
	private Type(String type) {
		this.type = type;
	}
	
	
	
}
