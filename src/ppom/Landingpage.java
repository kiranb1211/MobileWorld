package ppom;
import org.openqa.selenium.WebDriver;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class Landingpage {
	
    WebDriver driver;
    
     public  Landingpage(WebDriver driver)
//    (WebDriver driver)
  {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
   //SignUp
    @FindBy(xpath="//*[text()='SIGN IN']")
    WebElement signin;
    
    @FindBy(css="a[href='signup.html']")
    WebElement signup;
    
    @FindBy(xpath="//input[@id='myName']")
    WebElement firstname;
    
    @FindBy(css="input[placeholder='Last Name']")
    WebElement lastname;
    
    @FindBy(css="input[placeholder='Enter Email']")
    WebElement email;
    
    @FindBy(css="input[placeholder='Password']")
    WebElement singuppassword;
    
    @FindBy(css="input[type='date']")
    WebElement date;
    
    @FindBy(css="div[class='col-md-2'] input[name='gender']")
    WebElement gender;
    
    @FindBy(css="input[placeholder='91XXXXXXXXXX']")
    WebElement mobile;
    
    @FindBy(css="textarea[placeholder='Short Bio']")
    WebElement shortbio;
    
    @FindBy(xpath="//button[normalize-space()='Register']")
    WebElement register;
    
     //Signin  
    @FindBy(id="username")
    WebElement username;
    
    @FindBy(id="password")
    WebElement signinpassword;
    
    @FindBy(css="a[type='submit']")
    WebElement submit;
    
    //amobile
    @FindBy(linkText="All Mobiles")
    WebElement clickmobile;
    
    @FindBy(css="input#myInput")
    WebElement searchbox;
    
    //action
    public void goTo()
    {
        driver.get("https://qualicoach.org/mwapp/index.html");
    }
     public void signinapplication(String name,String pwd)
    {
        signin.click();
        username.sendKeys(name);
        signinpassword.sendKeys(pwd);
        submit.click();
    }
    public void signupapplication(String fname,String lname,String mail,String uppwd,String dob,String phone,String bio)
    {
        signin.click();
        signup.click();
        firstname.sendKeys(fname);
        lastname.sendKeys(lname);
        email.sendKeys(mail);
        singuppassword.sendKeys(uppwd);
        date.sendKeys(dob);
        gender.click();
        mobile.sendKeys(phone);
        shortbio.sendKeys(bio);
        register.click();
    }
   public void searchbox(String search) {
		clickmobile.click();
		searchbox.sendKeys(search);
	}}