package rubySurvey;
import java.awt.AWTException;
import java.io.IOException;


public class testRubySurvey {

	public static void main(String[] args) throws IOException, AWTException {
		rubySurvey test = new rubySurvey();
		

		
		test.setDetails("yes", "This is a Java Code\n I am a Ruby Evangelist","first");
		test.setUp();
		test.survey();	
		test.tearDown();
		
		
		

	}

}

