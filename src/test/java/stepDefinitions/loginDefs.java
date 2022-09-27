package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageFactory.loginFactory;


public class loginDefs {

    WebDriver driver;
    loginFactory login;

    @Given("user open the browser")
    public void userOpenTheBrowser() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        login = new loginFactory(driver);
    }

    @And("user open login page")
    public void userOpenLoginPage() {
        driver.navigate().to("https://example.testproject.io/web/");
    }

    @When("^user fill the (.*) and (.*)$")
    public void userFillTheUsernameAndPassword(String username, String password) {
        login.inputUsername(username);
        login.inputPassword(password);
    }

    @And("user click login button")
    public void userClickLoginButton(){
        login.clickLoginButton();
    }

    @Then("user success to login")
    public void userSuccessToLogin() throws InterruptedException {
        System.out.println(login.verifyGreetingsText());
        Thread.sleep(2000);
        driver.quit();
    }

}
