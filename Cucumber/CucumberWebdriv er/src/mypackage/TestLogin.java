package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestLogin {
	public static void main(String[] args) {
		
		
		
		  WebDriver driver = new FirefoxDriver();  
		  String link ="http://localhost:9091/Testingproject/index.jsp";
		  
		  
		  String username = "myusername";
		  // Driver.get method will open browser and avigate to parameter
		  driver.get(link);
		  
		  driver.findElement(By.name("uname")).sendKeys(username);
		  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  driver.findElement(By.name("pass")).sendKeys("sendpasswordhere");
		  try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  driver.findElement(By.xpath("html/body/form/input[3]")).click();
		  
		  // WD should submit
		  
		  driver.quit();
		  
		  
	}
}
