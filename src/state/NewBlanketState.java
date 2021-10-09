package state;

public class NewBlanketState implements State{
	Blanket blanket;
	public NewBlanketState(Blanket blanket) {
		this.blanket = blanket;
	}

	@Override
	public void fold() {
		System.out.println("Blanket is folded");

		
	}	
	@Override
	public void newBlanket() {
		System.out.println("New Blanket is to prepared.");
		BlanketBuilder builder=new ComforterBlanketBuilder();
		BlanketModel model=builder.addCotton().addFeathers().addFleece().addMicroFiber().addPolyfill().addVellux().build();
		
		model.prepareYarn();
		model.Knitting();
		model.Dyeing();
		model.Enhancing();
		model.QualityCheck();
		model.Packing();
		
		builder=new ThrowBlanketBuilder();
		model=builder.addCotton().addFeathers().addFleece().addMicroFiber().addPolyfill().addVellux().build();
		
		model.prepareYarn();
		model.Knitting();
		model.Dyeing();
		model.Enhancing();
		model.QualityCheck();
		model.Packing();
//		System.out.println(model);
	}

	@Override
	public void makeBed() {
		System.out.println("Blanket laid on bed");
		blanket.setState(blanket.getNewBlanketState());		
	}

	@Override
	public void makeWet() {
		System.out.println("Blanket is wet");

		
	}

	@Override
	public void makeDry() {
		System.out.println("Blanket dry");
		
	}
	public String toString() {
		return "New Blanket State";
		
	}



}
