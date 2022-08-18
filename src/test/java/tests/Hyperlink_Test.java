package tests;

import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.HyperlinkPage;
import utils.BaseClass;

public class Hyperlink_Test extends BaseClass {

    @Test
    public void hyperlinkFeatures(){

        HomePage homePage = new HomePage(driver);
        HyperlinkPage hyperlinkPage = new HyperlinkPage(driver);

        click(homePage.btnHyperLink, "Hyperlink button");
        click(hyperlinkPage.lnk_Home, "Home link");
        elementExists(homePage.btnHyperLink);
        click(homePage.btnHyperLink, "Hyperlink button");

        click(hyperlinkPage.lnk_Navigation, "Navigate link");
        System.out.println("Navigated to: " + getPageTitle());
        navigateBack();

        click(hyperlinkPage.lnk_Broken, "Broken link");
        if(getPageURL().contains("error")){
            System.out.println("Broken link");
        }else {
            System.out.println("Fail");
        }
        navigateBack();

        click(hyperlinkPage.lnk_HomeLinkName, "Home link");
        elementExists(homePage.btnHyperLink);
        click(homePage.btnHyperLink, "Hyperlink button");

        System.out.println("Total number of links in page: " + returnNumberOfElements("a"));

    }

}