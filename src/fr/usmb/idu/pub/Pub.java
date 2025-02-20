package fr.usmb.idu.pub;

/**
 * Virtual PUB
 *
 * un PUB est constitué d'un bar et d'une cave,
 * l'aprovisionnement du PUB se fait toujours par la cave, c'est à dire que toute nouvelle boisson doit être initialement ajouté à la cave
 * l'aprovisionnement du bar se fait toujours par la cave, c'est à dire que les boissons du bar proviennent forcément du bar
 */
public class Pub {


	private Bar bar;
	private Cave cave;

	/**
	 * Construit un PUB vide
	 */
	public Pub(){
		this.bar = new Bar();
		this.cave = new Cave();
	}

	/**
	 * Prend une boisson de la cave pour l'ajouter au bar
	 * @param nom nom de la boisson en question
	 */
	public void approvisionnerBar(String nom){
		this.bar.add(this.cave.take(nom));
	}

	/**
	 * Ajoute une nouvelle boisson à la cave
	 * @param boisson boisson en question
	 */
	public void approvisionnerCave(Boisson boisson){
		this.cave.add(boisson);
	}

	public Boisson serv(String string) {
		return this.bar.serv(string);
	}
}
