package triptych;

public abstract class FieldCard extends ButtonCard{

	private static final long serialVersionUID = 1L;
	protected int layer;
	
	
	public FieldCard(Card card, int layer){
		super(card);
		this.layer=layer;
	}
	
	public abstract void onClick();
}
