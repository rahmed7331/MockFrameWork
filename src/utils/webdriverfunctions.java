package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class webdriverfunctions {

	protected WebDriver driver ; 
	
	
    public void typebyxpath(String loc, String value){
		
		driver.findElement(By.xpath(loc)).sendKeys(value);
		
		
	}
	
	public void xpathclick (String loc){
		
		driver.findElement(By.xpath(loc)).click();
		
	}
	
	public String placeholdtext (String loc){
		
		return driver.findElement(By.xpath(loc)).getAttribute("placeholder");
	}
	
	public boolean displayverification (String loc){
		
	    return driver.findElement(By.xpath(loc)).isDisplayed();
		
	}
	
}
