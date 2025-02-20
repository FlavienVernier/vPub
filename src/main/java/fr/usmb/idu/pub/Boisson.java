package fr.usmb.idu.pub;

import fr.usmb.idu.money.Money;

/**
 * @author Pierre Le Fameux
 *
 */
public class Boisson {
	private String nom;
	private Boolean alcoolise;
	private Boolean chaud;
	private Float degre;
	private Float volume; // volume de la bouteille, cennette, fut ...
	private Money prix;

	/**
	 * @param nom
	 */
	public Boisson(String nom){
		this.nom = nom;
		this.alcoolise = new Boolean(false);
	}

	/**
	 * @param nom
	 * @param degre
	 */
	public Boisson(String nom, Float degre){
		this(nom);
		this.degre = degre;
		this.alcoolise = new Boolean(true);
	}

	/**
	 * @param nom
	 */
	public Boisson(String nom, Boolean chaud){
		this(nom);
		this.chaud = chaud;
	}

	/**
	 * @param nom
	 * @param degre
	 */
	public Boisson(String nom, Float degre, Boolean chaud){
		this(nom, degre);
		this.chaud = chaud;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
		String retour = this.nom;
		if(this.alcoolise){
			return retour + " (l'abus d'alcool est dangereux pour la sante)";
		}else{
			return retour;
		}
	}

	public boolean isAlcoolise() {
		return this.alcoolise;
	}

	public String getNom() {
		return this.nom;
	}
}
