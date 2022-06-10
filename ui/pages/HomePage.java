package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {
	public HomePage(RemoteWebDriver inWardDriver) {
		this.driver=inWardDriver;

		
	}
	public MyLeadPage clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadPage(driver);

	}

}
