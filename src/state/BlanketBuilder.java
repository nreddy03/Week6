package state;

import java.util.ArrayList;
import java.util.List;

public abstract class BlanketBuilder {
	String name;
	List<String> textiles = new ArrayList<String>();
	public abstract BlanketBuilder addCotton();
	public abstract BlanketBuilder addFeathers();
	public abstract BlanketBuilder addPolyfill();
	public abstract BlanketBuilder addFleece();
	public abstract BlanketBuilder addMicroFiber();
	public abstract BlanketBuilder addVellux();
	

	public BlanketModel build() {
		BlanketModel model = new BlanketModel();

		model.setName(this.name);
		model.addMaterial(textiles);
		return model;
	}

}
