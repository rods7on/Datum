package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class HomePage {

    private final WebDriver driver;
    private final String pageUrl = "http://automationpractice.com/index.php";

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    // Interactions
    public void accesPage(){driver.get(this.pageUrl);
    }
    public void login(){driver.findElement(By.className("login")).click();}

    // Asserts
    public void url(){assertEquals(driver.getCurrentUrl(), pageUrl);}

}
