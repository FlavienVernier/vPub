package sandBox;

import fr.usmb.idu.pub.Boisson;
import fr.usmb.idu.pub.Cocktail;
import fr.usmb.idu.pub.Pub;

public class mainPub {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/* Creation du pub */
		Pub pub = new Pub();

		Boisson coca = new Boisson("Coca");
		Boisson eau = new Boisson("Eau");
		Boisson sky = new Boisson("Whisky", new Float(40));
		Boisson bierre = new Boisson("Bierre", new Float(8));

		pub.approvisionnerCave(coca);
		pub.approvisionnerCave(coca);
		pub.approvisionnerCave(coca);
		pub.approvisionnerCave(sky);
		pub.approvisionnerCave(sky);
		pub.approvisionnerCave(bierre);
		pub.approvisionnerCave(bierre);
		pub.approvisionnerCave(eau);

		System.out.println("Pub initiale :");
		System.out.println(pub);

		pub.approvisionnerBar("bierre");
		pub.approvisionnerBar("Whisky");
		pub.approvisionnerBar("Coca");
		pub.approvisionnerBar("eau");

		Cocktail maz = new Cocktail("Mazout");
		maz.add("bierre", new Double(50));
		maz.add("coca", new Double(50));
		pub.approvisionnerCave(maz);
		pub.approvisionnerBar("Mazout");

		Boisson cafe = new Boisson("cafe", true);
		pub.approvisionnerCave(cafe);
		pub.approvisionnerBar("cafe");

		System.out.println(pub);

		System.out.println("Boisson servie : " + pub.serv("cafe"));
		System.out.println(pub);
	}
}
