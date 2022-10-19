package assemblyLine;

public class Mixer extends KitchenAppliance {

	public Mixer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void testAppliance(Boolean t) {
		if (t==true) {
			System.out.println("The" +this.getBrand()+" mixer is approved");
		}else
		{
			System.out.println("The mixer is rejected");			
		}
		
	}

}
