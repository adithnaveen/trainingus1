package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class myclass {
 
    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "http://naveenks.com";
        String expectedTitle = "naveenks | -Technical Evangelist";
        String actualTitle = "";
 
        // launch Firefox and direct it to the Base URL
        driver.get(baseUrl);
 
        // get the actual value of the title
        actualTitle = driver.getTitle();
 
        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        
        //close Firefox
        driver.close();
        
        // exit the program explicitly
        System.exit(0);
    }
 
}