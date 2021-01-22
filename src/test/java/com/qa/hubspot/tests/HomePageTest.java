package com.qa.hubspot.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.qa.hubspot.pages.HomePage;
import com.qa.hubspot.pages.LoginPage;

public class HomePageTest extends BaseTest {

	private static final String SENHA = "Test@1234";
	private static final String EMAIL = "naveenanimation20@gmail.com";

	@Test(priority = 1)
	public void homePageTitleTest() {
		page.getInstance(LoginPage.class).logar(EMAIL, SENHA);
		String title = page.getInstance(HomePage.class).getHomePagetitle();
		System.out.println("O título da Homepage é: " + title);
		assertEquals(title, "Reports dashboard");
	}
	
	@Test
	public void verificarHomePageHeaderTest() {
		page.getInstance(LoginPage.class).logar(EMAIL, SENHA);
		String header = page.getInstance(HomePage.class).getHomePageHeader();
		System.out.println(header);
		assertEquals(header, "Sales Dashboard");	
	}
}
