package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertEquals;
import static org.openqa.selenium.Keys.SPACE;

public class AccountCreate {
    private final WebDriver driver;
    public String pageUrl = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
    public AccountCreate(WebDriver driver) {this.driver = driver;}


    // Interactions
    public void cadastro(){
        driver.findElement(By.id("id_gender1")).sendKeys(SPACE);
        String firstName = "Richard";
        driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]")).sendKeys(firstName);
        String lastName = "Soares";
        driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]")).sendKeys(lastName);
        String password = "teste2021";
        driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys(password);
        String dia = "23";
        driver.findElement(By.id("days")).sendKeys(dia);
        String mes = "march";
        driver.findElement(By.id("months")).sendKeys(mes);
        String ano = "1992";
        driver.findElement(By.id("years")).sendKeys(ano);
        String adress = "Rua da Qualidade";
        driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys(adress);
        String city = "Datum City";
        driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys(city);
        String state = "California";
        driver.findElement(By.xpath("//*[@id=\"id_state\"]")).sendKeys(state);
        String zipCode = "00000";
        driver.findElement(By.xpath("//*[@id=\"postcode\"]")).sendKeys(zipCode);
        String phone = "+5551999999999";
        driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]")).sendKeys(phone);
    }
    public void registrar(){driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();}

    // Asserts
    public void url(){assertEquals(driver.getCurrentUrl(), pageUrl);}




}

