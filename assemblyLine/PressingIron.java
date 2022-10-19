package assemblyLine;

public class PressingIron extends HomeAppliances {

	public PressingIron(String name) {
		super(name);
	
	}

	@Override
	public void testAppliance(Boolean t) {
		if (t==true) {
			System.out.println("The Iron is approved");
		}else
		{
			System.out.println("The Iron is rejected");			
		}
		
	}

}
