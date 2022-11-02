package Selfdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class defination {
		WebDriver driver;
	
	@Given("broweser is open")
public void broweser_is_open() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
   driver.get("https://www.flipkart.com");
}

@When("user enter username and password")
public void user_enter_username_and_password() {
   driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("7013665954");
   driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Vijay@4496");
}

@And("hits login button")
public void hits_login_button() {
   driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
}

@Then("user is navigated to home page")
public void user_is_navigated_to_home_page() throws Exception {
   Thread.sleep(3000);
}


}
