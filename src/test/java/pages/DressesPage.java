package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class DressesPage {
    private final WebDriver driver;
    public String pageUrl = "http://automationpractice.com/index.php?id_category=8&controller=category";
    public DressesPage(WebDriver driver) {this.driver = driver;}

    // Interactions
    public void produtosEmLista(){driver.findElement(By.xpath("//*[@id=\"list\"]/a/i")).click();}
    public void continueComprando(){driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span")).click();}
    public void printedSummerDress(){driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div/div[3]/div/div[2]/a[1]/span")).click();}
    public void printedChiffonDress(){driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[5]/div/div/div[3]/div/div[2]/a[1]/span")).click();}
    public void proceedToCheckout(){driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();}

    // Asserts
    public void url(){assertEquals(driver.getCurrentUrl(), pageUrl);}







}
