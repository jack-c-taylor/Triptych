package triptych;

public class EmptyCard extends Card {
	
	public EmptyCard(){
		name="";
		element="";
		type="";
		description="";
	}
	
	public void firstEffect() {
		System.out.println("Testing");
	}

	public void secondEffect() {
		System.out.println("Testing 2");
	}

	public void thirdEffect() {
		System.out.println("Testing 3");
	}

}
