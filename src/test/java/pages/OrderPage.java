package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class OrderPage {

    private final WebDriver driver;
    public String pageUrl = "http://automationpractice.com/index.php?controller=order";

    public OrderPage(WebDriver driver) {this.driver = driver;}

    // Interactions
    public void proceedToCheckout(){driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();}
    public void proceedToCheckoutAdress(){driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span")).click();}
    public void agreeTerms(){driver.findElement(By.xpath("//*[@id=\"cgv\"]")).click();}
    public void proceedToCheckoutShipping(){driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click();}
    public void payByBank(){driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a/span")).click();}
    public void confirmOrder(){driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span")).click();}
    public void msg(){
        String name = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/p/strong")).getText();
        String message = "Your order on My Store is complete.";
        assertEquals(name, message);}



    // Asserts
    public void url(){assertEquals(driver.getCurrentUrl(), pageUrl);}

}
