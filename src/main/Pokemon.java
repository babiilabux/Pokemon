package main;

import java.util.Random;

public abstract class Pokemon {
	//ATTRIBUTS
	private String nom;
	private int niveau;
	protected int hp;
	private int atk;
	private static Random random = new Random();// Création de la seed random pour garder la même dans toute la classe 
	private static int niveaumax = 10;// Définition d'un niveau max 
	private String type; 
	
	//CONSTRUCTEUR
	public Pokemon(String nom, String type) {
		this.nom = nom;
		this.niveau = random.nextInt(niveaumax);
		this.hp = this.niveau * 2;
		this.atk = (this.niveau / 2) + 1;
		this.type = type; 
	}
	
	//GETTERS
	public String getName() {
		return nom;
	}

	public int getNiveau() {
		return niveau;
	}

	public int getHp() {
		return hp;
	}

	public int getAtk() {
		return atk;
	}
	
	public String getType() {
		return type;
	}
	
	//METHODES
	// Retourne True si le Pokemon a 0 hp
	public boolean isKO() {
		return hp == 0;
	}
	
	// Un Pokemon fait des dégats à un autre Pokemon (abstraite)
	public abstract void attaquer(Pokemon p);
	
	public abstract void subir(Pokemon p);
	
	// Restaure les hp de base du Pokemon
	public void soigner() {
		this.hp = niveau * 2;
	}
	
	public void log(String msg) {
		System.out.println(this.nom + " - " + msg);
	}
	
	// METHODE TOSTRING
	public String toString() {
		return "Nom : " + this.nom + " ; Niveau : " + this.niveau + " ; HP : " + this.hp + " ; Attaque : " + this.atk;
	}
	
	
	
}
