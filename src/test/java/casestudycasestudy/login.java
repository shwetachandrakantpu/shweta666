package casestudycasestudy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class login {
	public static WebDriver driver;
	@When("^user open app$")
		public void useropenapp() {
			System.setProperty("webdriver.chrome.driver", "C:\\shweta\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://10.232.237.143:443/TestMeApp");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		   }

	@And("^click on signin$")
	 public void clickonsignin() {                                                     
		driver.findElement(By.xpath("//a[@href='login.htm']")).click();
   }
	@And("^user enter credential$")
	 public void validcredential(DataTable dt) {    
		List<String> crd=dt.asList(String.class);
		driver.findElement(By.name("userName")).sendKeys(crd.get(0));
		driver.findElement(By.name("password")).sendKeys(crd.get(1));
		driver.findElement(By.name("Login")).click();
		
   }
	
}
