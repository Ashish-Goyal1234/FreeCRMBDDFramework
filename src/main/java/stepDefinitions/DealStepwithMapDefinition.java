
package stepDefinitions;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DealStepwithMapDefinition {

    WebDriver driver;

    @Given("^user is already on the login page$")
    public void user_already_on_login_page() {
        System.setProperty("webdriver.chrome.driver",
                "E:\\Study\\2. Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://classic.crmpro.com");
    }

    @When("^title of the login page id free crm$")
    public void title_of_login_page_is_free_crm() {
        String title = driver.getTitle();
        System.out.println(title);
        // Assert.assertEquals("CRMPRO - CRM software for customer relationship
        // management, sales, and support.", title);
    }

    @Then("^user enters the username and password$") // Username and password
    public void user_enter_username_and_password(DataTable credentials) {
        for (Map<String, String> data : credentials.asMaps(String.class,String.class)) {

            driver.findElement(By.name("username"))
                    .sendKeys(data.get("username"));
            driver.findElement(By.name("password"))
                    .sendKeys(data.get("password"));

        }
    }

    @Then("^user clicks on the login button$")
    public void user_clicks_on_login_button() {
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }

    @Then("^user is on the Home page$")
    public void user_is_on_Home_page() {
        System.out.println("Entered into home page");
    }

    @Then("^user move to the new deal page$")
    public void user_move_to_new_contact_page() {
        driver.switchTo().frame("mainpanel");
        Actions action = new Actions(driver);
        action.moveToElement(
                driver.findElement(By.xpath("//a[contains(text(),'Deals')]")))
                .build().perform();
        driver.findElement(By.xpath("//a[contains(text(),'New Deal')]"))
                .click();
    }

    @Then("^user enters the deal details$")
    public void user_enters_deal_details(DataTable dealData) {
        for (Map<String, String> dealdata : dealData.asMaps(String.class,String.class)) {
        
        driver.findElement(By.id("title")).sendKeys(dealdata.get("title"));
        driver.findElement(By.id("amount")).sendKeys(dealdata.get("amount"));
        driver.findElement(By.id("probability")).sendKeys(dealdata.get("probability"));
        driver.findElement(By.id("commission")).sendKeys(dealdata.get("commission"));
        driver.findElement(By.xpath("//input[@value='Save' and @type='submit']")).click();
        
        //Move to new Deal Page
        Actions action = new Actions(driver);
        action.moveToElement(
                driver.findElement(By.xpath("//a[contains(text(),'Deals')]")))
                .build().perform();
        driver.findElement(By.xpath("//a[contains(text(),'New Deal')]"))
                .click();
        }
    }

    @Then("^closes the browser$")
    public void close_the_browser() {
        driver.quit();
    }

}
