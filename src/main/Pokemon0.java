package main;

import java.util.Random;

public class Pokemon0 {
	//ATTRIBUTS
	private String nom;
	private int niveau;
	private double hp;
	private double atk;
	
	//CONSTRUCTEUR
	public Pokemon0(String nom) {
		this.nom = nom;
		Random random = new Random();
		this.niveau = random.nextInt(10);
		this.hp = this.niveau * 2;
		this.atk = (this.niveau / 2) + 1;
	}
	
	//GETTERS
	public String getName() {
		return nom;
	}

	public int getNiveau() {
		return niveau;
	}

	public double getHp() {
		return hp;
	}

	public double getAtk() {
		return atk;
	}
	
	//METHODES
	// Retourne True si le Pokemon a 0 hp
	public boolean isKO() {
		return hp == 0;
	}
	
	// Un Pokemon fait des dégats à un autre Pokemon
	public void attaquer(Pokemon0 p) {
		double hp = p.hp;
		hp -= this.atk;
	}
	
	// Restaure les hp de base du Pokemon
	public void soigner() {
		this.hp = niveau * 2;
	}
	
	public void log(String msg) {
		System.out.println(this.nom + " - " + msg);
	}
	
	// METHODE TOSTRING
	public String toString() {
		return "Nom : " + this.nom + "Niveau : " + this.niveau + "HP : " + this.hp + "Attaque : " + this.atk;
	}
	
	
	
}
