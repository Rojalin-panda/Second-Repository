package Stepdefinations;

import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
public class HotelAppLoginList {
	WebDriver driver;
	@Given("I am on Hotel App Page")
	public void i_am_on_hotel_app_page() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://adactinhotelapp.com/" );
	}

//	@When("I Enter Credentials To Login")
//	public void i_enter_credentials_to_login(io.cucumber.datatable.DataTable dataTable) {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
//	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
//	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
//	    //
//	    // For other transformations you can register a DataTableType.
//	    List<List<String >> data=dataTable.cells();
//	    driver.findElement(By.id("username")).sendKeys(data.get(0).get(0));
//	    driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));
//	    driver.findElement(By.id("login")).click();
//	}
	
	@When("I Enter Credentials To Login")
	public void i_enter_credentials_to_login(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    for(Map<String,String>data:dataTable.asMaps(String.class,String.class)) {
	    	driver.findElement(By.id("username")).sendKeys(data.get("username"));
	    	driver.findElement(By.id("password")).sendKeys(data.get("password"));
	    	driver.findElement(By.id("login")).click();
	    	
	    }
	}

	@Then("I am logged In successfully")
	public void i_am_logged_in_successfully() {
		String name="Hello vasuvespag!";
	    Assert.assertEquals(name, "Hello vasuvespag!");
		System.out.println("My java");
	}
	

}
