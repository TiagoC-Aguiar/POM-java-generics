package com.qa.hubspot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}
	
	By header = By.className("private-page__title");
	
	public String getHomePagetitle() {
		return driver.getTitle();
	}
	
	public String getHomePageHeader() {
		return pegarTexto(header);
	}

}
