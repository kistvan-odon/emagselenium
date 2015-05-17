package ro.tests;

import org.junit.Test;
import ro.pages.BasePage;

public class MenuNavigationTest extends BaseTest{

    @Test
    public void menuNavigationTest() {
        homePage.goToHomePage();
        homePage.selectCategory("Casa, Gradina & Petshop", "Gradinarit");
        BasePage.getDriver().sleepSeconds(5);
//        homePage.selectCategory("Casa, Gradina & Petshop", "Masini de tuns iarba, coase si accesorii");
//        BasePage.getDriver().sleepSeconds(5);
    }
}