package Adapter.adapter;

public class US_to_UK_Adapter implements US_Interface {
	/* 
	 * converts array of doubles 
	 * to a String with values
	 * in CSV format
	 */
	public double length(double[] dbl) {
	String csv = "";
	
	//convert the values to CSV format
	for(int i = 0; i<dbl.length; i++){
		csv+=dbl[i];
		if(i!=dbl.length-1){
			csv+=",";
		}
	}
	
	//then call UK_Socket.length()
	return UK_Socket.uk_length(csv);
	}
	
}

