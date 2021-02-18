package com.testng.concepts;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTest {
	
	@Test
	private void searchMobile() {
		System.out.println("searchMobile");
	}
	
	@Test
	private void searchLaptop() {
		System.out.println("searchLaptop");
	}
}
