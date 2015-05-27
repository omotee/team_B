import java.awt.AWTException;
import java.io.IOException;


public class testRubySurvey {

	public static void main(String[] args) throws IOException, AWTException {
		rubySurvey test = new rubySurvey();
		test.setDetails("yes", "A dynamic, open source programming language with a "
				+ "focus on simplicity and productivity. "
				+ "It has an elegant syntax that is natural to "
				+ "read and easy to write.","first");
		test.setUp();
		test.survey();	
		test.tearDown();
		
		
		

	}

}

