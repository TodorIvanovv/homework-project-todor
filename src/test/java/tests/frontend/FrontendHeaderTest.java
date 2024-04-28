package tests.frontend;

import components.FrontendHeader;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.base.BasePage;
import pages.frontend.MainPage;
import tests.base.BaseTest;
import utils.WaitTool;

public class FrontendHeaderTest extends BaseTest {

    @Test
    public void searchForExistingProduct() {
        MainPage.goToMainPage();
        FrontendHeader.useSearch("iMac");
        WaitTool.waitForElementVisibility(By.cssSelector("#input-search"), 10);
        String actualSearchText = FrontendHeader.getSearchText();
        Assert.assertEquals(actualSearchText,"iMac");
    }

    @Test
    public void emptySearch() {
        MainPage.goToMainPage();
        FrontendHeader.useSearch("");
        WaitTool.waitForElementVisibility(By.cssSelector("#input-search"), 10);
        String searchText = FrontendHeader.getSearchText();
        Assert.assertEquals(searchText, "");
    }

    @Test
    public void checkEmptyCart() {
        MainPage.goToMainPage();
        FrontendHeader.checkCartTotal();
        String emptyCartText = FrontendHeader.checkEmptyCart();
        Assert.assertEquals(emptyCartText, "Your shopping cart is empty!");
    }

    @Test
    public void returnToMainPageByOpencartLogo() {
        MainPage.goToMainPage();
        FrontendHeader.useSearch("");
        FrontendHeader.returnToMainPage();
        String mainPageCheckFeaturedText = MainPage.mainPageCheck();
        Assert.assertEquals(mainPageCheckFeaturedText, "Featured");
    }

    @Test
    public void dropdownTabletsButton() {
        MainPage.goToMainPage();
        FrontendHeader.clickTablets();
        WaitTool.waitForElementVisibility(By.cssSelector(".col-sm-3.hidden-xs"), 10);
        String tabletsText = FrontendHeader.getTabletsText();
        Assert.assertEquals(tabletsText, "Tablets");
    }
}
