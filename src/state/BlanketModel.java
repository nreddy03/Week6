package state;

import java.util.List;

public class BlanketModel {
	
	String name;
	List<String> textiles;
	public void addMaterial(List<String> textiles) {
		this.textiles = textiles;
	}
	void prepareYarn() {
		System.out.println("Prepare " + name);
		System.out.println("The suited yarn is collected and placed.");
		for(String textile: textiles) {
			System.out.println("   " + textile);
		}
	}
	void Knitting() {
		System.out.println("After choosing the right yarn our circular knitting machine will knit and bind the yarn into a continuous tube of fabric that is hundreds of yards long.");
	}
	void Dyeing() {
		System.out.println("For solid color designs, we will use one environment-friendly dye to apply on both sides of the fabric equally. For printed designs, we will use screen printing or digital printing techniques according to the fleece fabric type. ");
	}
	void Enhancing () {
		System.out.println("We will finish the fleece fabric by brushing and other ways to enhance the feel and look. Once brushing is done, a blade is used to trim the fleece fiber of the blanket to give a beautiful, leveled pile.");
	}
	void QualityCheck() {
		System.out.println("The blankets are inspected for length, width, loose threads, dirt, stains, holes, poor stitching, embroidery, and printing.");
	}
	void Packing() {
		System.out.println("Band label will be attached for each blanket, and you can also choose various packaging.");
	}
	public void setName(String name) {
		this.name = name;

	}
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("-----" + this.name + "-----");
		for(String textile : textiles) {
			display.append(textile + "\n");
		}
		return display.toString();
	}

}
