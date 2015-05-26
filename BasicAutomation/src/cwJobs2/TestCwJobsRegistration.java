package cwJobs2;

import java.io.IOException;

public class TestCwJobsRegistration {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		CwJobsRegisteration test = new CwJobsRegisteration();
		
		test.setDetails("Aijay","Dine", "dine@yahoo.com","12345abc");
		test.setUp();
		test.RegisterUser();
		test.verifyRegistration();
		test.tearDown();
		
		
	
		

	}

}
