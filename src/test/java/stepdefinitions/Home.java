package stepdefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Home {
	WebDriver driver;
	@Before
	public void before_suite()

	{
		System.out.println("This is before");
	}
	
	@When("user opens browser")
	public void user_opens_browser()
	{
		  WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

   }
	
	@When("enters the appication url")
	public void enters_the_appication_url()
	{
		driver.get("https://magento.softwaretestingboard.com/");
	}
	@Then("user should successfully navigates the homepage")
	public void user_should_successfully_navigates_the_homepage()
	{
		Assert.assertEquals(driver.getTitle(), "Home Page");
	}
	@Then("^user should find the below contents$")
	public void user_should_find_the_below_contents(DataTable arg1) throws Throwable {
		List<String> data=arg1.asList(String.class);
		for(int i=0;i<data.size();i++)
		{
			driver.findElement(By.xpath("//span[text()='"+data.get(i)+"'")).isDisplayed();
		}
	     
	}
	@When("^user clicks on sigin link$")
	public void user_clicks_on_sigin_link() throws Throwable {
	    // Write code here thatturns the phrase above into concrete actions
		driver.findElement(By.xpath("(//a[normalize-space()='Sign In'])[1]")).click();
	     
	}

//	@And("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\" credentials$")
	public void user_enters_and_credentials(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("email")).sendKeys(arg1);
		driver.findElement(By.id("pass")).sendKeys(arg2);
		driver.findElement(By.xpath("//*[@id='logInModal']/div/div/div[3]/button[2]")).click();

	     
	}

}
