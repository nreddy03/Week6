package state;

public class ThrowBlanketBuilder extends BlanketBuilder {
	
	public ThrowBlanketBuilder () {
		this.name="ThrowBlanket";
	}

	@Override
	public BlanketBuilder addCotton() {
		return this;
	}

	@Override
	public BlanketBuilder addFeathers() {
		return this;
	}

	@Override
	public BlanketBuilder addPolyfill() {
		return this;
	}

	@Override
	public BlanketBuilder addFleece() {
		this.textiles.add("Fleece");
		return this;
	}

	@Override
	public BlanketBuilder addMicroFiber() {
		this.textiles.add("MicroFiber");
		return this;
	}

	@Override
	public BlanketBuilder addVellux() {
		this.textiles.add("Vellux");
		return this;
	}
	

}
