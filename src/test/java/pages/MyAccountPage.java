package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class MyAccountPage {
    private final WebDriver driver;
    public String pageUrl = "http://automationpractice.com/index.php?controller=my-account";
    public MyAccountPage(WebDriver driver) {this.driver = driver;}

    // Interactions
    public void dressPageClick(){driver.findElement(By.cssSelector("#block_top_menu > ul > li:nth-child(2) > a")).click();}


    // Asserts
    public void url(){assertEquals(driver.getCurrentUrl(), pageUrl);}

}
