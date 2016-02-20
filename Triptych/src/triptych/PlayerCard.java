package triptych;

public class PlayerCard extends FieldCard{

	private static final long serialVersionUID = 1L;
	
	public PlayerCard(Card card, int layer){
		super(card,layer);
	}
	public void onClick(){
		switch(layer){
		case 1: card.firstEffect();
			break;
		case 2: card.secondEffect();
			break;
		case 3: card.thirdEffect();
			break;			
		}
	}
}
