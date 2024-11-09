package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass{
@Test(enabled=true,priority = 1)
public void clickLogoTest() {
	homePage.clickLogo();
  } 
@Test(enabled=true,priority = 2)
public void clickLoginButtonTest() throws InterruptedException {
	homePage.clickLoginButton();
	}
@Test
public void clickUserIdTest() {
	homePage.clickUserId();
	}
@Test
public void clickPasswordTest() {  
	
}
@Test
public void clickNewUserRegistrationTest() {
	homePage.clickNewUserRegistration();
}

}

