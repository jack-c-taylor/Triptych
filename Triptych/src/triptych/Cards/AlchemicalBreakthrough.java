package triptych.Cards;

import triptych.Card;

public class AlchemicalBreakthrough extends Card {

	public AlchemicalBreakthrough(){
		name="Alchemical Breakthrough";
		element="Fire";
		type="Effect";
		description="1: Gain 500 health.\n2: Deal 100 damage for every Fire card you control.\n3: Double the effect of Scientific Revolution if in play.";
	}
	
	@Override
	public void firstEffect() {
			System.out.println("AlchemicalBreakthrough");
	}

	@Override
	public void secondEffect() {
		// TODO Auto-generated method stub

	}

	@Override
	public void thirdEffect() {
		// TODO Auto-generated method stub

	}

}
