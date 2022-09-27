package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginFactory {

    WebDriver driver;

    public loginFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this); //what is this for?
    }

    @FindBy(id = "name")
    WebElement inp_username;
    @FindBy(id = "password")
    WebElement inp_password;
    @FindBy(id = "login")
    WebElement btn_login;
    @FindBy(id = "greetings")
    WebElement txt_greetings;

    public void inputUsername(String username){
        inp_username.sendKeys(username);
    }

    public void inputPassword(String password){
        inp_password.sendKeys(password);
    }

    public void clickLoginButton(){
        btn_login.click();
    }

    public String verifyGreetingsText(){
        return txt_greetings.getText();
    }

}
