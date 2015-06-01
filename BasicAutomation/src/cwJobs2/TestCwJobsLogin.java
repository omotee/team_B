package cwJobs2;

public class TestCwJobsLogin {

	public static void main(String[] args) {

		CwJobsLogin test = new CwJobsLogin();
		
		test.setDetails("dine@yahoo.com","12345abc");
		test.setUp();
		test.verifyLogin();
		test.tearDown();
	}

}
