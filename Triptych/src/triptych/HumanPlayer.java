package triptych;

import java.util.Random;

import triptych.Cards.AlchemicalBreakthrough;
import triptych.Cards.ColdSnap;
import triptych.Cards.Doom;

public class HumanPlayer implements Player{
	private Card[] deck={new Doom(), new AlchemicalBreakthrough(), new ColdSnap()};
	private int health=4000;
	private String resistances="";
	
	public Card drawCard(){
		int i=random.nextInt(deck.length);
		return deck[i];
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	public void takeDamage(int health, String element){
		if (resistances.contains(element)){
			health/=2;
		}
		this.health+=health;
	}
}
