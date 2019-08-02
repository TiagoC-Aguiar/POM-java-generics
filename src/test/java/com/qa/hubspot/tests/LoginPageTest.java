package com.qa.hubspot.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.hubspot.pages.LoginPage;

public class LoginPageTest extends BaseTest {

	@Test(priority=1)
	public void verificaTituloPaginaLogin() {
		String title = page.getInstance(LoginPage.class).getLoginPageTitle();
		System.out.println("Título da página de login: " + title);
		Assert.assertEquals(title, "Login do HubSpot");
	}
	
	@Test(priority = 2)
	public void loginTest() {
		page.getInstance(LoginPage.class).logar("naveenanimation20@gmail.com", "Test@1234");
	}
}
