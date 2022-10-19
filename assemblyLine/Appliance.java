package assemblyLine;

public abstract class Appliance implements Tester {
	protected String brand, type;
	
	public Appliance(String name) {
		super();
		this.setBrand(name);
	}

	public void switchON() {
		System.out.println("The "+getBrand()+ "is switched ON");
	}
	
	public void switchOFF() {
		System.out.println("The "+getBrand()+ "is switched OFF");
	}	

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}	
//declare abstract method for testing in this class
}
