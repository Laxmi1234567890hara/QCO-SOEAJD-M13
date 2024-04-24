package Beauty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchNykaa_Test {
@Test
public void Nyka() {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.nykaafashion.com/");
	driver.quit();
	
}
}
