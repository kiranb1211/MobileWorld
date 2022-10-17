package ppom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Amobiles {
	
	@Test
    public void allmobiles() throws Exception
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiran.b\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         Thread.sleep(2000);
         Landingpage landingpage1 = new Landingpage(driver);
         landingpage1.goTo();
         Thread.sleep(2000);
         landingpage1.searchbox("lenovo");
         Thread.sleep(2000);
         landingpage1.searchbox("samsung");
        Thread.sleep(2000);
        landingpage1.searchbox("sa");
         Thread.sleep(2000);
         landingpage1.searchbox("12345");
         Thread.sleep(2000);
         landingpage1.searchbox("!@#$% ");
         Thread.sleep(2000);
         landingpage1.searchbox(" ");
         //driver.quit();
             }
	
	
}