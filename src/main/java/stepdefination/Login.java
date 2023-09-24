package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Login {
    WebDriver driver;
    @Given("Facebook Application should open")
    public void facebook_application_should_open() {
        System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

    }
    @When("User send username in userbox")
    public void user_send_username_in_userbox() {
        driver.findElement(By.id("email")).sendKeys("abc@hotmail.com");

    }
    @When("User send password in passwordbox")
    public void user_send_password_in_passwordbox() {
        driver.findElement(By.id("pass")).sendKeys("nis123");

    }
    @When("User click on login button")
    public void user_click_on_login_button() {
        driver.findElement(By.name("login")).click();

    }
    @Then("User login to the Facebook")
    public void user_login_to_the_facebook() {
         String title = driver.getTitle();
         System.out.println("Title is =" + title);
    }
    }
