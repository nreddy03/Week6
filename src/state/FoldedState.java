package state;

public class FoldedState implements State {
	Blanket blanket;
	public FoldedState(Blanket blanket) {
		this.blanket = blanket;
	}

	@Override
	public void fold() {
		System.out.println("Blanket is folded");
	}
	@Override
	public void newBlanket() {
		System.out.println("New Blanket is to prepared.");
		
	}

	@Override
	public void makeBed() {
		System.out.println("Blanket laid on bed");
		blanket.setState(blanket.getNewBlanketState());
	}

	@Override
	public void makeWet() {
		System.out.println("Blanket made wet");
		blanket.setState(blanket.getWetState());
	}

	@Override
	public void makeDry() {
		System.out.println("Blanket already dry");

	}
	public String toString() {
		return " folded state" ;
	}

	

	
}
