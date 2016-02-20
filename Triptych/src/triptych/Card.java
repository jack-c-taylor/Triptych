package triptych;

/** A collection of methods required by every instance of a card.
 * 
 * @author Jack
 *
 */
public abstract class Card {
	protected String name;
	protected String element;
	protected String type; 
	protected String description; 
	
	public abstract void firstEffect();
	public abstract void secondEffect();
	public abstract void thirdEffect();
	
	/**
	 * Retrieves the name of the card.
	 * @return name
	 * 	The name of the card.
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * Retrieves the element of the card.
	 * @return element
	 * 	The element of the card.
	 */
	public String getElement(){
		return element;
	}
	
	/**
	 * Retrieves the type of the card.
	 * @return type
	 * 	The type of the card.
	 */
	public String getType(){
		return type;
	}
	
	/**
	 * Retrieves the description of the card.
	 * @return description
	 * 	The description of the card.
	 */
	public String getDescription(){
		return description;
	}
}
