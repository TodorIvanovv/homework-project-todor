package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.base.BasePage;
import pages.frontend.MainPage;

public class FrontendHeader extends MainPage {
    private static final By OPENCART_LOGO = By.xpath("//img[@title='Your Store']");

    private static final By SEARCH_INPUT_FIELD = By.cssSelector(".form-control.input-lg");

    private static final By SEARCH_BUTTON = By.cssSelector(".fa.fa-search");

    private static final By CART_TOTAL_BUTTON = By.id("cart-total");

    private static final By EMPTY_CART = By.cssSelector("#cart p");

    private static final By SEARCH_TEXT_VALUE = By.id("input-search");
    private static final By DESKTOPS_DROPDOWN_BUTTON = By.xpath("//ul[@class='nav navbar-nav']/li[1]");
    private static final By LAPTOPS_AND_NOTEBOOKS_DROPDOWN_BUTTON = By.xpath("//ul[@class='nav navbar-nav']/li[2]");
    private static final By COMPONENTS_DROPDOWN_BUTTON = By.xpath("//ul[@class='nav navbar-nav']/li[3]");
    private static final By TABLETS_DROPDOWN_BUTTON = By.xpath("//ul[@class='nav navbar-nav']/li[4]");
    private static final By TABLETS_DROPDOWN_TEXT = By.cssSelector(".col-sm-9 h2");
    private static final By SOFTWARE_DROPDOWN_BUTTON = By.xpath("//ul[@class='nav navbar-nav']/li[5]");
    private static final By PHONES_AND_PDAS_DROPDOWN_BUTTON = By.xpath("//ul[@class='nav navbar-nav']/li[6]");
    private static final By CAMERAS_DROPDOWN_BUTTON = By.xpath("//ul[@class='nav navbar-nav']/li[7]");
    private static final By MP3_PLAYERS_DROPDOWN_BUTTON = By.xpath("//ul[@class='nav navbar-nav']/li[8]");

    public static void useSearch(String searchText) {
        BasePage.textInputInElementByLocator(SEARCH_INPUT_FIELD, searchText);
        BasePage.clickOnElementByLocator(SEARCH_BUTTON);
    }

    public static void checkCartTotal() {
        BasePage.clickOnElementByLocator(CART_TOTAL_BUTTON);
    }

    public static String checkEmptyCart() {
        return driver.findElement(EMPTY_CART).getText();

    }

    public static void returnToMainPage() {
        BasePage.clickOnElementByLocator(OPENCART_LOGO);
    }

    public static String getSearchText() {
        return driver.findElement(SEARCH_TEXT_VALUE).getAttribute("value");
    }

    public static void clickTablets() {
        BasePage.clickOnElementByLocator(TABLETS_DROPDOWN_BUTTON);
    }
    public static String getTabletsText() {
        return driver.findElement(TABLETS_DROPDOWN_TEXT).getText();
    }
}
