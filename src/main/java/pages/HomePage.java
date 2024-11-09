package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
WebDriver driver;

  public HomePage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
}
  
  @FindBy(id="cms-login-submit")
  WebElement loginButton;
  
  @FindBy(name="user-d")
  WebElement userId;
  @FindBy(how=How.NAME,using="pass-d")
  WebElement password;
  @FindBy(className="cms-newuser-reg")
  WebElement newUserRegistration;
  
@FindBy(xpath ="//em[@id='cms-homepage-header-logo-unauth'and@class='cms-icon cms-sprite-loggedout ms-3']")
WebElement logo;
public void clickLoginButton() throws InterruptedException   {
	Thread.sleep(4000);
	loginButton.click();
	Thread.sleep(4000);
	
}
public  void clickUserId() {
	userId.click();
}
public void clickPassword() {
	password.click();
}
public void clickLogo() { 
	  logo.click();
}
public void clickNewUserRegistration() {
	try {
		Thread.sleep(4000);
		newUserRegistration.click();
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
}
		  
		  
	  }	  
	  



