package WordPress.WordPressProject.TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.WordPress.PO.Login;



public class TC01_ValidLoginUser {

	@Test	
	public void VerifyValidLogin()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Software\\Browser_Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Opening Chrome Driver");
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php?loggedout=true");
		
		Login login = new Login(driver);
		login.typeUsername();
		login.password();
		login.ClickonLoginButton();
		
		driver.quit();
	}
}
