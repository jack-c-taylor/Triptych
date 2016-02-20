package triptych;

public class HandCard extends ButtonCard {

	private static final long serialVersionUID = 1L;
	private GameProperties gameProperties=GameProperties.getInstance();

	public HandCard(Card card){
		super(card);
	}
	
	public void onClick(){
		if (!gameProperties.isHandCardSelected()){
			gameProperties.isHandCardSelected(true);
			gameProperties.setSelectedCard(this);
		}else{
			gameProperties.isHandCardSelected(false);
		}
	}
}
