package myPackage.Test;

import myPackage.Main.MyTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RunMyTest {
	private MyTest test;
	
	
	
	@Before
	public void initialiseTest(){
		test = new MyTest();
	}

	
	@After
	public void finalisedTest(){
		test.finish();
		test = null;
	}

	
	
	@Test
	public void autoTest(){
		test.loadPage();
	}
	
	
	
	@Test
	public void autoTest1(){
		test.loadPage();
	}
}
