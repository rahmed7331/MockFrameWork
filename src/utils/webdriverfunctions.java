package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class webdriverfunctions {

	protected WebDriver driver ; 
	
	
    public String typebyxpath(String loc, String val){
		driver.findElement(By.xpath(loc)).clear();
		driver.findElement(By.xpath(loc)).sendKeys(val);
		return val ;
		
		
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
