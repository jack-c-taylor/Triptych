package triptych;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public abstract class ButtonCard extends JButton {
	
	private static final long serialVersionUID = 1L;
	protected Card card=new EmptyCard();
	
	public ButtonCard(Card card){
		this.card=card;
		refreshIcon();
		setBorder(BorderFactory.createEmptyBorder());
		setContentAreaFilled(false);
	}
	
	public Card getCard(){
		return card;
	}
	
	public void setCard(Card card){
		this.card=card;
		refreshIcon();
	}
	
	protected void refreshIcon(){
		String name=card.getName();
		if ((this.card instanceof EmptyCard)){
			name="Empty Card";
		}
		ImageIcon icon=new ImageIcon(System.getProperty("user.dir")+"\\res\\graphics\\cards\\"+name.replace(' ', '_')+".jpg");
		icon=new ImageIcon(icon.getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
		setIcon(icon);
	}
}
