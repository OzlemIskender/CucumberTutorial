package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

    protected WebDriver driver;

    private By username_login = By.id("name");
    private By password_login = By.id("password");
    private By login_button = By.id("login");
    private By logout_button = By.id("logout");

    public loginPage(WebDriver driver){
        this.driver = driver;

        if(!driver.getTitle().equals("TestProject Demo")){
            throw new IllegalStateException("This is not Login Page. The current page is" + driver.getCurrentUrl());
        }

    }

    public void enterUsername(String username){
        driver.findElement(username_login).sendKeys(username);

    }

    public void enterPassword(String password){
        driver.findElement(password_login).sendKeys(password);
    }

    public void clickLogin(){
        driver.findElement(login_button).click();
    }

    public void checkLogout(){
        driver.findElement(logout_button).isDisplayed();
    }

    public void loginValidUser(String username, String password){
        driver.findElement(username_login).sendKeys(username);
        driver.findElement(password_login).sendKeys(password);
        driver.findElement(login_button).click();
    }


    public void enter_text(By locator , String text){
        driver.findElement(locator).sendKeys(text);
    }


}
