package state;

public class ComforterBlanketBuilder extends BlanketBuilder {

public ComforterBlanketBuilder() {
	this.name="ComforterBlanket";
}

	@Override
	public BlanketBuilder addCotton() {
		this.textiles.add("Cotton");
		return this;
	}

	@Override
	public BlanketBuilder addFeathers() {
		this.textiles.add("Feathers");
		return this;
	}

	@Override
	public BlanketBuilder addPolyfill() {
		this.textiles.add("Polyfill");
		return this;
	}

	@Override
	public BlanketBuilder addFleece() {
	
		return this;
	}

	@Override
	public BlanketBuilder addMicroFiber() {
		return this;
	}

	@Override
	public BlanketBuilder addVellux() {
		return this;
	}

}
