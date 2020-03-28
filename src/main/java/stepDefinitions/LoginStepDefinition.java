/*package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class LoginStepDefinition {

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
    
    @Then("^user enter username and password$")
    public void user_enter_username_and_password() {
        driver.findElement(By.name("username")).sendKeys("batchautomation");
        driver.findElement(By.name("password")).sendKeys("Test@12345");
    }
    
                        RegExp:
                            1. \"([^\"]*)\"
                            2. \"(.*)\"
                           
    
    @Then("^user enter \"(.*)\" and \"(.*)\"$")  //  Username and password represented by expression \"(.*)\"
    public void user_enter_username_and_password(String username, String password) {
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
    }
    
    @Then("^user clicks on login button$")
    public void user_clicks_on_login_button() {
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }

    @Then("^user is on Home page$")
    public void user_is_on_Home_page() {
       System.out.println("Entered into home page");
    }
 
    @Then("^user move to new contact page\\.$")
    public void user_move_to_new_contact_page(){
        driver.switchTo().frame("mainpanel");
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
        driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
    }
    
    @Then("^user enters contact details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_contact_details_and_and(String firstName, String lastName, String position) throws InterruptedException  {
         driver.findElement(By.id("first_name")).sendKeys(firstName);
         driver.findElement(By.id("surname")).sendKeys(lastName);
         driver.findElement(By.id("company_position")).sendKeys(position);
         Thread.sleep(3000);
         driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
    }
    
    @Then("^close the browser$") 
        public void close_the_browser(){
        driver.quit();
    }
}
*/