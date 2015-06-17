package Adapter.adapter;

public class US_Plug {
	
	private US_Interface interfac;
	
	//sets the adapter to use
	public void setAdapter(US_Interface calAdapt){
		this.interfac = calAdapt;
	}
	
	public double length(double[] data){
		return interfac.length(data);
	}
	
}

