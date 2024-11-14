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

	public int getHp() {
		return hp;
	}

	public double getAtk() {
		return atk;
	}
	
	//METHODES
	public boolean isKO() {
		return hp == 0;
	}
	
	public void attaquer(Pokemon0 p) {
		double hp = p.hp;
		hp -= this.atk;
	}
	
	
}
