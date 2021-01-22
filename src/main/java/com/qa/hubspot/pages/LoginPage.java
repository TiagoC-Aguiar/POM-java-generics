package com.qa.hubspot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	// page locators:
	By emailId = By.id("username");
	By senhaId = By.id("password");
	By entrarId = By.id("loginBtn");
	
	// page actions
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public void logar(String usuario, String senha) {
		digitar(emailId, usuario);
		digitar(senhaId, senha);
		clicar(entrarId);
		try { 
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
