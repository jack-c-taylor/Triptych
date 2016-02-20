package triptych.Cards;

import triptych.Card;

public class ColdSnap extends Card {

	public ColdSnap(){
		name="Cold Snap";
		element="Water";
		type="Spell";
		description="1: Destroy all fire cards on the field.\n2: If the opponent has no fire cards, deal 500 damage.\n3: Deal 200 damage for every Water card on the field.";
				}
	
	@Override
	public void firstEffect() {
			System.out.println("ColdSnap");
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
