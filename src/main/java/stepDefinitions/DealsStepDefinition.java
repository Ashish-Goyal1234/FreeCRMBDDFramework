package stepDefinitions;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DealsStepDefinition {
WebDriver driver;
    
    @Given("^user is already on login page$")
    public void user_already_on_login_page() {
        System.setProperty("webdriver.chrome.driver", "E:\\Study\\2. Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe"); 
        driver = new ChromeDriver();
        driver.get("https://classic.crmpro.com");
    }
    
    @When("^title of login page id free crm$")
    public void title_of_login_page_is_free_crm() {
        String title = driver.getTitle();
        System.out.println(title);
        //Assert.assertEquals("CRMPRO  - CRM software for customer relationship management, sales, and support.", title);
    }
    
    @Then("^user enters username and password$")  //  Username and password represented by expression \"(.*)\"
    public void user_enter_username_and_password(DataTable credentials) {
        List<List<String>> data =  credentials.raw(); // It will give list of strings.
        driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
        driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
    }
    
    @Then("^user clicks on login button$")
    public void user_clicks_on_login_button() {
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }
    
    @Then("^user is on Home page$")
    public void user_is_on_Home_page() {
       System.out.println("Entered into home page");
    }
    
    @Then("^user move to new deal page$")
    public void user_move_to_new_contact_page(){
        driver.switchTo().frame("mainpanel");
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
        driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
    }
    
    @Then("^user enters deal details$")
    public void user_enters_deal_details(DataTable dealData){
        List<List<String>> dealdata =  dealData.raw(); // It will give list of strings.
        driver.findElement(By.id("title")).sendKeys(dealdata.get(0).get(0));
        driver.findElement(By.id("amount")).sendKeys(dealdata.get(0).get(1));
        driver.findElement(By.id("probability")).sendKeys(dealdata.get(0).get(2));
        driver.findElement(By.id("commission")).sendKeys(dealdata.get(0).get(3));
    }
    
    @Then("^close the browser$") 
    public void close_the_browser(){
    driver.quit();
}
    
    
    
    
}
