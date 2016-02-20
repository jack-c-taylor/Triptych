package triptych;

public class GameProperties {
	
	private static GameProperties INSTANCE;
	private HumanPlayer player1=new HumanPlayer();
	private HumanPlayer player2=new HumanPlayer();
	private boolean handCardSelected=false;
	private ButtonCard selectedCard;
	
	private GameProperties(){
		
	}
	
	public static GameProperties getInstance(){
		if (INSTANCE==null){
			INSTANCE=new GameProperties();
		}
		return INSTANCE;
	}
	
	public boolean isHandCardSelected(){
		return handCardSelected;
	}
	
	public void isHandCardSelected(boolean handCardSelected){
		this.handCardSelected=handCardSelected;
	}

	public ButtonCard getSelectedCard() {
		return selectedCard;
	}

	public void setSelectedCard(ButtonCard selectedCard) {
		this.selectedCard = selectedCard;
	}

	public HumanPlayer getPlayer1() {
		return player1;
	}

	public HumanPlayer getPlayer2() {
		return player2;
	}

	public void setPlayer2(HumanPlayer player2) {
		this.player2 = player2;
	}
}
