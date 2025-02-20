package fr.usmb.idu.money;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Un money bag serv à stoquer un ensemble de money de devises différentes
 *
 * @author Pierre Tartampion
 *
 */
public class MoneyBag {
	private ArrayList<Money> bag;

	/**
	 * Création d'un money bag vide
	 */
	public MoneyBag(){
		this.bag = new ArrayList<>();
	}

	/**
	 * Ajoute une nouvelle monnaie au sac, si la devise est déjà présente, les valeurs sont ajoutées
	 * @param m monnaie ajoutée
	 * @return la monaie passée en paramètre si la devise n'existait pas ou la monaie existante dans le sac à laquelle la valeur de m a été ajoutée
	 */
	public Money add(Money m){
		Iterator<Money> it = this.bag.iterator();
		Money current;

		while(it.hasNext()){
			current = it.next();
			if(current.getCurrency()==m.getCurrency()){
				current.add(m);
				return current;
			}
		}
		this.bag.add(m);
		return m;
	}

	/**
	 * retire la monaie passée en paramètre du sac
	 * @param m monnaie a retirer
	 * @return monnaie corespondant à la devise de m restant dans le sac
	 */
	public Money withdraw(Money m){
		Money mNeg = new Money(-m.getAmount(), m.getCurrency());
		return this.add(mNeg);
	}
}
