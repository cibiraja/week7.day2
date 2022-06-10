package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ProjectSpecificMethods;


public class CreateLeadPage extends ProjectSpecificMethods {
	public CreateLeadPage(RemoteWebDriver inWardDriver) {
		this.driver=inWardDriver;

	}
	public CreateLeadPage typecompanyName() {	
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		return this;

	}
	public CreateLeadPage typefirstName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Cibi");
		return this;
}
	public CreateLeadPage typelastName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		return this;
		
	}
	public ViewLeadPage clickcreatelead() {
		driver.findElement(By.name("submitButton")).click();
        return new ViewLeadPage(driver);


		
		
	}

}
