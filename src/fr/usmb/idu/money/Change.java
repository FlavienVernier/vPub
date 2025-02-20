package fr.usmb.idu.money;

public class Change extends MoneyBag{

	public Money change(Money m, String c){

		Money tmpChange;

		if(m.getCurrency().equals("EUR")){
			if(c.equals("USD")){
				tmpChange = new Money(1.372 * m.getAmount(), c);
				if(this.withdraw(tmpChange) == null){
					return null;
				}else{
					this.add(m);
					return tmpChange;
				}
			}else{
				System.out.println("Devise non supportée");
				return null;
			}
		}else if(m.getCurrency().equals("USD")){
			if(c.equals("EUR")){
				tmpChange = new Money(1.372 * m.getAmount(), c);
				if(this.withdraw(tmpChange) == null){
					return null;
				}else{
					this.add(m);
					return tmpChange;
				}
			}else{
				System.out.println("Devise non supportée");
				return null;
			}
		}
		return null;
	}
}
