package fr.usmb.idu.money;


/**
 * La classe Money permet de déclarer une valeur manaitaire avec sa devise. La valeur pouvant être positive ou négative.
 *
 * @author Pierre Tartampion
 *
 */
public class Money {

	private double amount ;
	private String currency ;

	/**
	 * Construction d'une monnaie avec sa valeur et sa devise
	 *
	 * @param amount valeur positive ou non
	 * @param currency devise
	 */
	public Money( double amount , String currency ) {
		if(currency == null) {
			throw new NullPointerException("Currency cannot be null");
		}
		if(currency.trim().isEmpty()){
			throw new IllegalArgumentException("Currency cannot be empty");
		}
		this.amount = amount ;
		this.currency = currency ;
	}

	/**
	 * Retourne la valeur de la monnaie
	 *
	 * @return valeur de la monnaie de type double
	 */
	public double getAmount() {
		return this.amount ;
	}

	/**
	 * retourne la devise de la monnaie
	 *
	 * @return devise de la monnaie sous forme de chaîne de caractères
	 */
	public String getCurrency() {
		return this.currency ;
	}

	/**
	 * Crée une nouvelle monnaie contenant la somme de la monaie courante et celle passée en paramètre
	 *
	 * @param m monnaie additionnée à la monnaie courante
	 * @return nouvelle monnaie
	 */
	public Money add (Money m) {
		return new Money( this.getAmount() + m.getAmount() , this.getCurrency() ) ;
	}
}
