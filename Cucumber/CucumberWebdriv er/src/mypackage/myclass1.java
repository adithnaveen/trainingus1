package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class myclass1 {
	 public static void main(String[] args) {
	        WebDriver driver = new FirefoxDriver();
	        String baseUrl = "http://www.facebook.com";
	        String tagName = "";
	 
	        driver.get(baseUrl);
	        tagName = driver.findElement(By.id("email")).getTagName();
	        System.out.println(tagName);
	        driver.close();
	        System.exit(0);
	    }
}
