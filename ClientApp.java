import assemblyLine.*; 
import java.util.ArrayList; 


public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Appliance>stock = new ArrayList() {
			{
			add (new Mixer("Phillips")); 
			add (new PressingIron("Bajaj")); 
			add (new Mixer ("Preethi"));
			}
		};	
			for(int i=0; i<stock.size(); i++ ) {
				Appliance a = stock.get(i);
				
				a.testAppliance(true);
				a.testAppliance(false);
			}
	}
	
}
