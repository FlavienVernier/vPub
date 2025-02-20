package fr.usmb.idu.pub;
import java.util.Vector;
import java.util.Enumeration;

/**
 * @author Pierre Le Fameux
 *
 */
public class Bar {
	private Vector<Boisson> boissonChaude;
	private Vector<Boisson> boissonFroide;
	private Vector<Boisson> boissonAlcoolisee;
	private Vector<Cocktail> cocktailSansAlcoole;
	private Vector<Cocktail> cocktailAvecAlcoole;

	/**
	 *
	 */
	public Bar(){
		this.boissonChaude = new Vector<Boisson>();
		this.boissonFroide = new Vector<Boisson>();
		this.boissonAlcoolisee = new Vector<Boisson>();

		this.cocktailAvecAlcoole = new Vector<Cocktail>();
		this.cocktailSansAlcoole = new Vector<Cocktail>();
	}

	/**
	 * @param boisson
	 */
	public void add(Boisson boisson){
		if(boisson.isAlcoolise()){
			this.boissonAlcoolisee.add(boisson);
		}else{
			this.boissonFroide.add(boisson);
		}
	}

	/**
	 * @param cocktail
	 */
	public void add(Cocktail cocktail){
		if(cocktail.alcoolFree()){
			this.cocktailSansAlcoole.add(cocktail);
		}else{
			this.cocktailAvecAlcoole.add(cocktail);
		}
	}

	/**
	 * @param command
	 * @return
	 */
	public Boisson serv(String command){
		Boisson retourB=null;
		Cocktail retourC=null;
		Enumeration e;

		e = this.boissonFroide.elements ();
		while (e.hasMoreElements () && !((retourB=(Boisson)e.nextElement()).getNom().equalsIgnoreCase(command))){}
		if(retourB.getNom().equalsIgnoreCase(command)){
			this.boissonFroide.remove(retourB);
			return retourB;
		}

		e = this.boissonAlcoolisee.elements ();
		while (e.hasMoreElements () && !((retourB=(Boisson)e.nextElement()).getNom().equalsIgnoreCase(command))){}
		if(retourB.getNom().equalsIgnoreCase(command)){
			this.boissonAlcoolisee.remove(retourB);
			return retourB;
		}

		e = this.boissonChaude.elements ();
		while (e.hasMoreElements () && !((retourB=(Boisson)e.nextElement()).getNom().equalsIgnoreCase(command))){}
		if(retourB.getNom().equalsIgnoreCase(command)){
			this.boissonChaude.remove(retourB);
			return retourB;
		}

		e = this.cocktailSansAlcoole.elements ();
		while (e.hasMoreElements () && !((retourC=(Cocktail)e.nextElement()).nom.equalsIgnoreCase(command))){}
		if(retourC.nom.equalsIgnoreCase(command)){
			this.cocktailSansAlcoole.remove(retourC);
			return retourC;
		}

		e = this.cocktailAvecAlcoole.elements ();
		while (e.hasMoreElements () && !((retourC=(Cocktail)e.nextElement()).nom.equalsIgnoreCase(command))){}
		if(retourC.nom.equalsIgnoreCase(command)){
			this.cocktailAvecAlcoole.remove(retourC);
			return retourC;
		}

		return null;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
		String retour = new String();
		String eol = System.getProperty("line.separator");
		Enumeration e;

		retour = retour + "Bar : " + eol;

		retour = retour + "\t Sans alcool" + eol;
		e = this.boissonFroide.elements ();
		while (e.hasMoreElements ()) {
			retour = retour + "\t\t" + e.nextElement().toString() + eol;
		}

		retour = retour + "\t Avec alcool" + eol;
		e = this.boissonAlcoolisee.elements();
		while (e.hasMoreElements ()) {
			retour = retour + "\t\t" + e.nextElement().toString() + eol;
		}

		retour = retour + "\t Cocktail sans alcool" + eol;
		e = this.cocktailSansAlcoole.elements();
		while (e.hasMoreElements ()) {
			retour = retour + "\t\t" + e.nextElement().toString() + eol;
		}

		retour = retour + "\t Cocktail avec alcool" + eol;
		e = this.cocktailAvecAlcoole.elements();
		while (e.hasMoreElements ()) {
			retour = retour + "\t\t" + e.nextElement().toString() + eol;
		}

		retour = retour + "\t Boissons chaudes" + eol;
		e = this.boissonChaude.elements();
		while (e.hasMoreElements ()) {
			retour = retour + "\t\t" + e.nextElement().toString() + eol;
		}

		return retour;
	}

}
