package tests;

import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.HyperlinkPage;
import utils.BaseClass;

public class TC003_Hyperlink extends BaseClass {

    @Test
    public void hyperlinkFeatures(){

        HomePage homePage = new HomePage(driver);
        HyperlinkPage hyperlinkPage = new HyperlinkPage(driver);

        click(homePage.btn_HyperLink);
        click(hyperlinkPage.lnk_Home);
        elementExists(homePage.btn_HyperLink);
        click(homePage.btn_HyperLink);

        click(hyperlinkPage.lnk_Navigation);
        System.out.println("Navigated to: " + getPageTitle());
        navigateBack();

        click(hyperlinkPage.lnk_Broken);
        if(getPageURL().contains("error")){
            System.out.println("Broken link");
        }else {
            System.out.println("Fail");
        }
        navigateBack();

        click(hyperlinkPage.lnk_HomeLinkName);
        elementExists(homePage.btn_HyperLink);
        click(homePage.btn_HyperLink);

        System.out.println("Total number of links in page: " + returnNumberOfElements("a"));

    }

}