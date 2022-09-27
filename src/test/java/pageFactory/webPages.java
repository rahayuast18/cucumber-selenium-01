package pageFactory;

import org.openqa.selenium.WebDriver;

public class webPages {
    WebDriver driver;

    public void loginUrl(){
        driver.navigate().to("https://example.testproject.io/web/");
    }
}
