package com.sainsbury.mytv;


import org.junit.Test;

import com.sainsburys.tayo.Car;

public class CartTest {
	Car volvo = new Car();
	
	@Test
	public void runMyTest(){
		volvo.setUp();
		volvo.tearDown();
	}
	
	
	@Test
	public void test1(){
		volvo.setUp();
		volvo.tearDown();	
	}
	
	

}
