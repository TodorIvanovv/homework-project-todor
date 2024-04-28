package pages.admin;

import org.openqa.selenium.By;
import pages.base.BasePage;

public class LoginPage extends BasePage {

    private static final By USERNAME_INPUT_FIELD = By.id("input-username");
    private static final By PASSWORD_INPUT_FIELD = By.id("input-password");
    private static final By LOGIN_BUTTON = By.cssSelector(".btn-primary");
    private static final String LOGIN_PAGE_URL = "https://shop.pragmatic.bg/admin";

    private static final By LOGIN_PAGE_TEXT = By.cssSelector(".panel-title");

    public static void goToLoginPage() {
        driver.get(LOGIN_PAGE_URL);
    }

    private static void writeInUsernameInputField(String username) {
        textInputInElementByLocator(USERNAME_INPUT_FIELD, username);
    }

    private static void writeInPasswordInputField(String password) {
        textInputInElementByLocator(PASSWORD_INPUT_FIELD, password);
    }

    private static void clickLoginButton() {
        clickOnElementByLocator(LOGIN_BUTTON);
    }

    public static void login (String username, String password) {
        writeInUsernameInputField(username);
        writeInPasswordInputField(password);
        clickLoginButton();
    }

    public static String getLoginPageText() {
        return driver.findElement(LOGIN_PAGE_TEXT).getText();
    }


}
