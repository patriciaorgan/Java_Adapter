package Adapter.adapter;

import static org.junit.Assert.*;

import org.junit.Test;

public class US_to_UK_Adapter_Test {

	@Test
	public void test_US_to_UK_Adapter() {
		// client plug
		US_Plug client = new US_Plug();

		//polymorphic reference to Concrete Adapter
		US_Interface calc = new US_to_UK_Adapter(); 
		
		//plug client into adapter
		client.setAdapter(calc);
		
		//input
		double[] data = {0.15, -0.45, 0.7, 0.9, -1.4};
		
		double expected =1.867; // expected result
		
		//plug requests power
		double result = client.length(data); // output
		
		//check if it received what was expected
		assertEquals(expected,result, 0.001); // test assertion
	}
}

