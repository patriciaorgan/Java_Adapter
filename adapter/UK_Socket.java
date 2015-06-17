package Adapter.adapter;



/**
 * @author Conor Hayes
 * UK Socket 
 * length method accepts a String formatted as
 * comma separated values (CSV)
 */
public class UK_Socket {
	
	public static double uk_length(String csv){
		//input is a comma separated series of double values (csv)
		String[] in  = csv.split(",");
		double a = 0.0;
		
		for (String i: in){
			double j = Double.parseDouble(i);
			a +=j*j;
		}
		return Math.sqrt(a);
	}

}

