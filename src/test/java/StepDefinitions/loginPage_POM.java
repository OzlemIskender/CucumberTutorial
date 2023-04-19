package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.loginPage;

import java.util.concurrent.TimeUnit;

public class loginPage_POM {

   /* WebDriver driver = null;
    loginPage login;

    @Given("browser is open")
    public void browser_is_open() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        DesiredCapabilities cp=new DesiredCapabilities();

        cp.setCapability(ChromeOptions.CAPABILITY, options);

        options.merge(cp);

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
    }

    @And("user is on login page")
    public void user_is_on_login_page() {

        driver.navigate().to("https://example.testproject.io/web/");
    }

    @When("^user enters (.*) and (.*)$")
    public void user_enters_username_and_password(String username, String password) throws InterruptedException {


        login = new loginPage(driver);
        login.enterUsername(username);
        login.enterPassword(password);
        Thread.sleep(2000);

    }

    @And("user clicks on login")
    public void user_clicks_on_login() throws InterruptedException {
        login.clickLogin();
        //driver.findElement(By.id("login")).click();
        Thread.sleep(2000);
    }

    @Then("user is navigated to login page")
    public void user_is_navigated_to_the_login_page() {

        login.checkLogout();
        //driver.findElement(By.id("logout")).isDisplayed();
        driver.close();
        driver.quit();
    }*/
}
