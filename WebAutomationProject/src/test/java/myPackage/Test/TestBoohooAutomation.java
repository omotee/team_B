package myPackage.Test;

import myPackage.Main.BohooAutomation;

import org.junit.Ignore;
import org.junit.Test;

public class TestBoohooAutomation {

	
BohooAutomation boohoo;

	
	
	public TestBoohooAutomation(){
	boohoo = new BohooAutomation();
		}
	@Test
	public void runBoohoo(){
	boohoo.searchFeature();
		
	}
}
