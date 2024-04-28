package tests.admin;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.admin.DashboardPage;
import pages.admin.LoginPage;
import pages.base.BasePage;
import tests.base.BaseTest;

public class LoginPageTest extends BaseTest {

    @Test
    public void testSuccesfulLogin() {
        LoginPage.goToLoginPage();
        LoginPage.login("admin", "parola123!");
        String actualUserNameText = DashboardPage.getUsernameText();
        Assert.assertEquals(actualUserNameText, "Milen Strahinski");
    }

    @Test
    public void testSuccessfulLoginWithAdmin1() {
        LoginPage.goToLoginPage();
        LoginPage.login("admin1", "parola123!");
        String actualUsernameText = DashboardPage.getUsernameText();
        Assert.assertEquals(actualUsernameText, "AdminQAC22_First AdminQAC22_Last");
    }

    @Test
    public void testSuccessfulLogoutWithAdmin27() {
        LoginPage.goToLoginPage();
        LoginPage.login("admin27", "parola123!");
        BasePage.clickOnElementByLocator(By.cssSelector(".fa.fa-sign-out"));
        String loginPageText = LoginPage.getLoginPageText();
        Assert.assertEquals(loginPageText, "Please enter your login details.");
    }
}
