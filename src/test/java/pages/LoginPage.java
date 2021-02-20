package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Random;

import static org.junit.Assert.assertEquals;


public class LoginPage {
    private final WebDriver driver;
    public String pageUrl = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
    //Apoio para geração do email.
    Random random = new Random();
    int gerador = random.nextInt() * 2;
    private final String user = gerador+"@teste.com";

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    // Interactions
    public void user(){
        String userDatum = "datumqatest@soprock.com";
        driver.findElement(By.cssSelector("#email")).sendKeys(userDatum);}
    public void pass(){
        String senhaDatum = "datum2021";
        driver.findElement(By.cssSelector("#passwd")).sendKeys(senhaDatum);}
    public void accesPage(){driver.get(this.pageUrl);
    }
    public void clickLogin(){driver.findElement(By.id("SubmitLogin")).click();
    }
    public void userNew(){driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys(user);}
    public void createAccount(){driver.findElement(By.id("SubmitCreate")).click();}

    // Asserts
    public void title(){assertEquals(driver.getTitle(), "Login - My Store");}
}
