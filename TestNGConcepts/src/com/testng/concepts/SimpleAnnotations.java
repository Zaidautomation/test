package com.testng.concepts;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotations {
	
	@BeforeSuite
	private void setup() {
		System.out.println("setup");
	}

	@BeforeTest
	private void browserLaunch() {
		System.out.println("Browser Launch");
	}
	
	@BeforeClass
	private void enterUrl() {
		System.out.println("enterUrl");
	}
	
	@BeforeMethod
	private void login() {
		System.out.println("login");
	}
	
	@Test()
	private void searchMobile() {
		System.out.println("searchMobile");
	}
	
	@Test
	private void searchLaptop() {
		System.out.println("searchLaptop");
	}
	
	@AfterMethod
	private void logout() {
		System.out.println("logout");
	}
	
	@AfterClass
	private void verifyHomePage() {
		System.out.println("verifyHomePage");
	}
	
	@AfterTest
	private void browserClose() {
		System.out.println("browserClose");
	}
	
	@AfterSuite
	private void deleteCookies() {
		System.out.println("deleteCookies");
	}
	
	
	
	
	
	
}
