package casestudycasestudy;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinitionclass {
	public static WebDriver driver;
	
	@When("^user open testmeapp$")
	public void useropentestmeapp() {
		System.setProperty("webdriver.chrome.driver", "C:\\shweta\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	   }
	@And("^click on signUp$")
	public void clickonsignUp() {
		driver.findElement(By.xpath("//a[@href='RegisterUser.htm']")).click();
		}
	@And("^enter Username as \"([^\"]*)\"$")
	 public void userame(String uname) {                                                     
		driver.findElement(By.id("userName")).sendKeys(uname);
    }

	@And("^enter FirstName as \"([^\"]*)\"$" )
	 public void firstname(String fname) {
		driver.findElement(By.id("firstName")).sendKeys(fname);;
   }
	
	@And("^enter Last Name as \"([^\"]*)\"$")
	 public void LastName(String lname) {
		driver.findElement(By.id("lastName")).sendKeys(lname);;
  }
	
	@And("^enter Password as \"([^\"]*)\"$")
	 public void Password (String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);;
 }	
	
	@And("^enter Confirm Password as \"([^\"]*)\"$")
	 public void ConfirmPassword (String cpwd) {
		driver.findElement(By.id("pass_confirmation")).sendKeys(cpwd);
}	
		
	@And("^select gender as \"([^\"]*)\"$")
	 public void selectgender (String gen) {
	if(gen.equalsIgnoreCase("male")) {
		driver.findElement(By.xpath("//input[@value='Male']")).click();
	}
		else if(gen.equalsIgnoreCase("female")) {
			driver.findElement(By.xpath("//input[@value='Female']")).click();
	}
}
	
		
	@And("^enter E-mail as \"([^\"]*)\"$")
	 public void enterEmail (String eml) {
		driver.findElement(By.id("emailAddress")).sendKeys(eml);	
	}
	
	@And("^enter Mobile Number as \"([^\"]*)\"$")
	 public void mobno(String no) {
		driver.findElement(By.id("mobileNumber")).sendKeys(no);	
	}
	
	
	@And("^enter DOB as \"([^\"]*)\"$")
	 public void date(String bd) {
		driver.findElement(By.id("dob")).sendKeys(bd);	
	}
	
	@And("^enter Address as \"([^\"]*)\"$")
	 public void addr(String ress) {
		driver.findElement(By.id("address")).sendKeys(ress);	
	}
	
	@And("^select Security Question as \"([^\"]*)\"$")
	 public void add(String que) {
	Select s=new Select(driver.findElement(By.id("securityQuestion")));
	s.selectByIndex(1);
	}
	
	@And("^enter Answer as \"([^\"]*)\"$")
	 public void answer(String ans) {
		driver.findElement(By.id("answer")).sendKeys(ans);	
	
	}
	@Then("^click on Register$")
	public void clickonregister() {
		driver.findElement(By.name("Submit")).click();
}
}
