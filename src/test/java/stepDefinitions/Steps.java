package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;


public class Steps {

    private WebDriver driver;
    HomePage homePage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;
    DressesPage dressesPage;
    OrderPage orderPage;
    AccountCreate accountCreate;

    @Before
    public void beforeCenario(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        myAccountPage = new MyAccountPage(driver);
        dressesPage = new DressesPage(driver);
        orderPage = new OrderPage(driver);
        accountCreate = new AccountCreate(driver);
    }

    @After
    public void afterCenario(){
        this.driver.quit();
    }

    @Dado("que o usuario realize o login no site com sucesso")
    public void login_com_sucesso(){
        loginPage.accesPage();
        loginPage.title();
        loginPage.user();
        loginPage.pass();
        loginPage.clickLogin();
        myAccountPage.url();
    }

    @Quando("selecionar os produtos desejados")
    public void selecionar_produtos(){
        myAccountPage.dressPageClick();
        dressesPage.url();
        dressesPage.produtosEmLista();
        dressesPage.printedSummerDress();
        try { Thread.sleep (2000); } catch (InterruptedException ex) {}
        dressesPage.continueComprando();
        dressesPage.printedChiffonDress();
        try { Thread.sleep (2000); } catch (InterruptedException ex) {}
        dressesPage.proceedToCheckout();
    }

    @Entao("deverá finalizar compra")
    public void finalizar_compra() {
        orderPage.url();
        orderPage.proceedToCheckout();
        orderPage.proceedToCheckoutAdress();
        orderPage.agreeTerms();
        orderPage.proceedToCheckoutShipping();
        orderPage.payByBank();
        orderPage.confirmOrder();
        orderPage.msg();
    }

    @Dado("que o usuário efetue seu cadastro com sucesso")
    public void que_o_usuario_efetue_seu_cadastro_com_sucesso() {
        homePage.accesPage();
        homePage.url();
        homePage.login();
        loginPage.userNew();
        loginPage.createAccount();
        accountCreate.url();
        try { Thread.sleep (2000); } catch (InterruptedException ex) {}
        accountCreate.cadastro();
        accountCreate.registrar();
    }

}
