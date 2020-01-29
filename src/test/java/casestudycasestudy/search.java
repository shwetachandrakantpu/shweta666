package casestudycasestudy;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class search {
	public static WebDriver driver;
	@Given("^open test me app$")
		public void useropenapp() {
			System.setProperty("webdriver.chrome.driver", "C:\\shweta\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://10.232.237.143:443/TestMeApp");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		   }

@When("^user search product$")
public void searched(DataTable dt) {
List<String> s=dt.asList(String.class);
driver.findElement(By.name("products")).sendKeys(s.get(0));;

}
@And("^product display$")
public void display() {
	driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	System.out.println("search successfully");
}

}