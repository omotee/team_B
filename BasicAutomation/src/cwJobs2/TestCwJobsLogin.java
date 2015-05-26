package cwJobs2;

public class TestCwJobsLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CwJobsLogin test = new CwJobsLogin();
		
		test.setDetails("dine@yahoo.com","12345abc");
		test.setUp();
		test.verifyLogin();
		test.tearDown();
	}

}
