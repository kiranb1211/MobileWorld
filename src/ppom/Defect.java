package ppom;

import org.openqa.selenium.By;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Defect {
	Landingpage landingpage1;
@Test
    public void defect() throws Exception
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiran.b\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
        
         landingpage1 = new Landingpage(driver);
         landingpage1.goTo();
         Thread.sleep(1000);
         landingpage1.searchbox("lenovo");
         Thread.sleep(1000);
         landingpage1.searchbox("samsung");
        Thread.sleep(1000);
        landingpage1.searchbox("sa");
         Thread.sleep(1000);
         landingpage1.searchbox("12345");
         Thread.sleep(1000);
         landingpage1.searchbox("!@#$% ");
         Thread.sleep(1000);
         driver.quit();
    }
    

         @Test
         public void defect1 () throws Exception
         {
             System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiran.b\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
             WebDriver driver = new ChromeDriver();
              driver.manage().window().maximize();
             
              Landingpage landingpage1 = new Landingpage(driver);
              landingpage1.goTo();
              landingpage1.searchbox("lenovo");
              Thread.sleep(1000);
              Assert.assertEquals("https://qualicoach.org/mwapp/index.html",driver.getCurrentUrl());
              }
         @Test
         public void verifyLenovoOrderPage() throws InterruptedException{
        	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiran.b\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
             WebDriver driver = new ChromeDriver();
              driver.manage().window().maximize();
              Landingpage landingpage1 = new Landingpage(driver);
              landingpage1.goTo();
              landingpage1.searchbox("lenovo");
              Thread.sleep(1000);
              driver.findElement(By.xpath("//tbody/tr[4]/td[5]/a[1]")).click();
              String parenthandle = driver.getWindowHandle();
              Set<String> handles = driver.getWindowHandles();
              for(String handle : handles) {
                  if(!handle.equals(parenthandle)) {
                      driver.switchTo().window(handle);
                  
                      Assert.assertEquals(driver.getCurrentUrl(),"https://qualicoach.org/mwapp/order.html");    
                  }
              
              }  
                     
               
         }
                  
         @Test(testName = "ex")
         public void verifyLenovoTableTest() throws InterruptedException {
        	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiran.b\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
             WebDriver driver = new ChromeDriver();
              driver.manage().window().maximize();
              Landingpage landingpage1 = new Landingpage(driver);
              landingpage1.goTo();
              landingpage1.searchbox("lenovo");
              Thread.sleep(1000);
              Assert.assertEquals(driver.findElement(By.xpath("//td[normalize-space()='Lenovo Legion 2']")).getText(),"Lenovo Legion 2");
        	 
         }
        
         
}
         
       
         